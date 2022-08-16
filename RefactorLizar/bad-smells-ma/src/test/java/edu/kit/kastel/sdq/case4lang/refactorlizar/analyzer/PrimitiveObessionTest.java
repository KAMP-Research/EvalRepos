package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_abstraction.PrimitiveObession;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PrimitiveObessionTest {
    @Test
    void testFullAnalysis() {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Hiwi/Software/SmartGrid/Smart-Grid-ICT-Resilience-Framework");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Hiwi/Software/SmartGrid/SmartGridLang/metamodel/refactored");
        Project project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .ignoreTestFolder(true)
                        .parse();
        new PrimitiveObession()
                .analyze(
                        project.getLanguage(),
                        project.getSimulatorModel(),
                        new PrimitiveObession().getSettings());
    }
}