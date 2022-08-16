package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.duplicated_abstraction;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import spoon.reflect.declaration.CtType;
import static org.neo4j.driver.Values.parameters;
import java.util.stream.Collectors;

public class GraphIsomorphie {
  
public static void main(String[] args) {
  new GraphIsomorphie().start(null);
}
  public void start(Project project) {
    Driver driver =
        GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "test"));
    try (Session session = driver.session()) {
     System.out.println(session.writeTransaction(tx -> {
       tx.run("MATCH (n)\nDETACH DELETE n");
       return "cleaned";
     }));
     var languageNodes =
         project.getLanguage().getComponents().stream().flatMap(v -> v.getTypes().stream()).collect(Collectors.toSet());
     var simulatorNodes =
         project.getSimulatorModel().getComponents().stream().flatMap(v -> v.getTypes().stream()).collect(Collectors.toSet());
     for (CtType<?> type : simulatorNodes) {
       session.writeTransaction(tx -> {
         tx.run("CREATE (a:Simulator {name:$fqn})",
             parameters("fqn", type.getQualifiedName()));
         return "added nodes";
       });
       type.getReferencedTypes().stream()
           .filter(v -> languageNodes.contains(v.getTypeDeclaration())).forEach(v -> {
             session.writeTransaction(tx -> {
               tx.run("CREATE (a:Language {name: $fqn})",
                   parameters("fqn", v.getQualifiedName()));
               return Void.TYPE;  
             });
         session.writeTransaction(tx -> {
           tx.run("MATCH (a:Simulator), (b:Language) WHERE a.name =$simulatorName AND b.name = $languageName  CREATE (a)-[r:uses]->(b)", parameters("simulatorName", type.getQualifiedName(), "languageName", v.getQualifiedName()));
           return "add relation";
         });
       });
     }

      // String greeting = session.writeTransaction(tx -> {
      //   Result result = tx.run("CREATE (a:Greeting) " + "SET a.message = $message "
      //       + "RETURN a.message + ', from node ' + id(a)", parameters("message", "hello"));
      //   return result.single().get(0).asString();
      // });
    }
    driver.close();
  }
}
