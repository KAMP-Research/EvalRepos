package edu.kit.kastel.sdq.case4lang.refactorlizar.eval;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.broken_modularity.WrongDependencyDirection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.deficient_encapsulation.DataClumbs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.degraded_modularity.FeatureScatter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.duplicated_abstraction.DuplicateAbstraction;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.folded_hierarchy.FoldedHierarchy;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.incomplete_abstraction.SwitchStatements;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_abstraction.PrimitiveObession;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_modularity.MissingModularity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.rebellious_modularity.LanguageBlob;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.unexploited_Hierarchy.UnexploitedHierarchy;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.unused_abstraction.SpeculativeGenerality;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.weakened_modularity.DependencyCycle;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;

public class KampEval {

  private static Project project;

  @BeforeAll
  public static void setUp() {
    List<String> simulatorPaths = new ArrayList<>();
    simulatorPaths.add(
        "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/eval/KAMP/KAMP_ANALYSE");
    List<String> languagePaths = new ArrayList<>();
    languagePaths.add(
        "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/eval/KAMP/KAMP_Sprache");
    project = new ProjectParser().setLanguageKind(InputKind.ECLIPSE_PLUGIN)
        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN).addLanguagePaths(languagePaths)
        .addSimulatorPaths(simulatorPaths).parse();
  }

  @Test
  public void broken_modularityReport() throws IOException {
    Report report = new WrongDependencyDirection().analyze(project.getLanguage(),
        project.getSimulatorModel(), new WrongDependencyDirection().getSettings());
    Files.writeString(Path.of("broken_modularity_kamp"), report.toString());
  }

  @Test
  public void deficient_encapsulationReport() throws IOException {
    Report report = new DataClumbs().analyze(project.getLanguage(), project.getSimulatorModel(),
        new DataClumbs().getSettings());
    Files.writeString(Path.of("deficient_encapsulation_kamp"), report.toString());
  }

  @Test
  public void degraded_modularityReport() throws IOException {
    Report report = new FeatureScatter().analyze(project.getLanguage(), project.getSimulatorModel(),
        new FeatureScatter().getSettings());
    Files.writeString(Path.of("degraded_modularity_kamp"), report.toString());
  }

  @Test
  public void duplicated_abstractionReport() throws IOException {
    Report report = new DuplicateAbstraction().analyze(project.getLanguage(),
        project.getSimulatorModel(), new DuplicateAbstraction().getSettings());
    Files.writeString(Path.of("CAMUNDA_duplicated_abstraction_kamp"), report.toString());
  }

  @Test
  public void incomplete_abstractionReport() throws IOException {
    Report report = new SwitchStatements().analyze(project.getLanguage(),
        project.getSimulatorModel(), new SwitchStatements().getSettings());
    Files.writeString(Path.of("incomplete_abstraction_kamp"), report.toString());
  }

  @Test
  public void missing_abstractionReport() throws IOException {
    Report report = new PrimitiveObession().analyze(project.getLanguage(),
        project.getSimulatorModel(), new PrimitiveObession().getSettings());
    Files.writeString(Path.of("missing_abstraction_kamp"), report.toString());
  }

  @Test
  public void missing_modularityReport() throws IOException {
    Report report = new MissingModularity().analyze(project.getLanguage(),
        project.getSimulatorModel(), new MissingModularity().getSettings());
    Files.writeString(Path.of("missing_modularity_kamp"), report.toString());
  }

  @Test
  public void rebellious_modularityReport() throws IOException {
    Report report = new LanguageBlob().analyze(project.getLanguage(), project.getSimulatorModel(),
        new LanguageBlob().getSettings());
    Files.writeString(Path.of("rebellious_modularity_kamp"), report.toString());
  }

  @Test
  public void unexploited_HierarchyReport() throws IOException {
    Report report = new UnexploitedHierarchy().analyze(project.getLanguage(),
        project.getSimulatorModel(), new UnexploitedHierarchy().getSettings());
    Files.writeString(Path.of("unexploited_Hierarchy_kamp"), report.toString());
  }

  @Test
  public void unused_abstractionReport() throws IOException {
    Report report = new SpeculativeGenerality().analyze(project.getLanguage(),
        project.getSimulatorModel(), new SpeculativeGenerality().getSettings());
    Files.writeString(Path.of("unused_Abstraction_kamp"), report.toString());
  }

  @Test
  public void weakened_modularityReport() throws IOException {
    Report report = new DependencyCycle().analyze(project.getLanguage(),
        project.getSimulatorModel(), new DependencyCycle().getSettings());
    Files.writeString(Path.of("weakened_modularity_kamp"), report.toString());
  }

  @Test
  public void folded_hierarchyReport() throws IOException {
    var setting = new FoldedHierarchy().getSettings();
    setting.setValue("layer", "domain,paradigm");
    Report report =
        new FoldedHierarchy().analyze(project.getLanguage(), project.getSimulatorModel(), setting);
    Files.writeString(Path.of("folded_hierarchy_kamp"), report.toString());
  }
}
