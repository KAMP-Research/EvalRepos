package edu.kit.kastel.sdq.case4lang.refactorlizar.eval;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
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

public class SmartGrid {

    private Project project;

    @BeforeEach
    public void setUp() {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/eval/smartGrid/Smart-Grid-ICT-Resilience-Framework_ANALYSE");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/eval/smartGrid/Smart-Grid-ICT-Resilience-Framework_SPRACHE");
        project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .parse();
    }

    @Test
    public void broken_modularityReport() throws IOException {
        Report report =
                new WrongDependencyDirection()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new WrongDependencyDirection().getSettings());
        Files.writeString(Path.of("broken_modularity"), report.toString());
    }

    @Test
    public void deficient_encapsulationReport() throws IOException {
        Report report =
                new DataClumbs()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DataClumbs().getSettings());
        Files.writeString(Path.of("deficient_encapsulation"), report.toString());
    }

    @Test
    public void degraded_modularityReport() throws IOException {
        Report report =
                new FeatureScatter()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new FeatureScatter().getSettings());
        Files.writeString(Path.of("degraded_modularity"), report.toString());
    }

    @Test
    public void duplicated_abstractionReport() throws IOException {
        Report report =
                new DuplicateAbstraction()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DuplicateAbstraction().getSettings());
        Files.writeString(Path.of("SmartGrid_duplicated_abstraction.md"), report.toString());
    }

    @Test
    public void incomplete_abstractionReport() throws IOException {
        Report report =
                new SwitchStatements()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new SwitchStatements().getSettings());
        Files.writeString(Path.of("incomplete_abstraction"), report.toString());
    }

    @Test
    public void missing_abstractionReport() throws IOException {
        Report report =
                new PrimitiveObession()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new PrimitiveObession().getSettings());
        Files.writeString(Path.of("missing_abstraction"), report.toString());
    }

    @Test
    public void missing_modularityReport() throws IOException {
        Report report =
                new MissingModularity()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new MissingModularity().getSettings());
        Files.writeString(Path.of("missing_modularity"), report.toString());
    }

    @Test
    public void rebellious_modularityReport() throws IOException {
        Report report =
                new LanguageBlob()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new LanguageBlob().getSettings());
        Files.writeString(Path.of("rebellious_modularity"), report.toString());
    }

    @Test
    public void unexploited_HierarchyReport() throws IOException {
        Report report =
                new UnexploitedHierarchy()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new UnexploitedHierarchy().getSettings());
        Files.writeString(Path.of("unexploited_Hierarchy"), report.toString());
    }

    @Test
    public void unused_abstractionReport() throws IOException {
        Report report =
                new SpeculativeGenerality()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new SpeculativeGenerality().getSettings());
        Files.writeString(Path.of("unused_Abstraction"), report.toString());
    }

    @Test
    public void weakened_modularityReport() throws IOException {
        Report report =
                new DependencyCycle()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DependencyCycle().getSettings());
        Files.writeString(Path.of("weakened_modularity"), report.toString());
    }

    @Test
    void brokenModularity() {
        Report report =
                new WrongDependencyDirection()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new WrongDependencyDirection().getSettings());
        int a = 3;
    }

    @Test
    void deficient_encapsulation() throws IOException {
        Report report =
                new DataClumbs()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DataClumbs().getSettings());
        Files.writeString(Path.of("deficient_encapsulation.md"), report.getDescription());
        int a = 3;
    }

    @Test
    void deficient_encapsulation_repair() throws IOException {
        Report report =
                new DataClumbs()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DataClumbs().getSettings());
        int a = 3;
    }

    @Test
    void degraded_modularity() throws IOException {
        Report report =
                new FeatureScatter()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new FeatureScatter().getSettings());
        Files.writeString(Path.of("degraded_modularity.md"), report.getDescription());
        int a = 3;
    }

    @Test
    public void folded_hierarchyReport() throws IOException {
            var setting = new FoldedHierarchy().getSettings();
            setting.setValue("layer", "paradigm,domain,quality,analysis");
            Report report = new FoldedHierarchy().analyze(project.getLanguage(),
                            project.getSimulatorModel(), setting);
            Files.writeString(Path.of("folded_hierarchy"), report.toString());

    }
/*
    @Test
    void evaluateScenario() {
            String badSmell = "deficient_encapsulation";
            String scenarioNumber = "01";
            boolean isBefore = false;
            String path = "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/eval/smartGrid/"
                            + badSmell + "/" + "scenario_" + scenarioNumber;
            if (isBefore) {
                    path += "/before";
            } else {
                    path += "/after";
            }
            Result result = new Application().evaluate(CalculationMode.ONE_OFFSET, path);
            int a = 3;
            System.out.println("Complexity " + result.getComplexity().getValue());
            System.out.println("Cohesion " + result.getCohesion().getValue());
            System.out.println("Coupling " + result.getCoupling().getValue());
    }
    */
    //startTable("SmartGrid", "SmartGrid");
    @Test
    public void createTable() throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("% " + project.getSimulatorModel().getComponents().iterator().next()
                            .getTypes().iterator().next().getPosition().getFile().getAbsolutePath())
                            .append("\n");
            sb.append(toTableRow(broken_modularityReport_CSV())).append("\n");
            sb.append(toTableRow(deficient_encapsulationReport_CSV())).append("\n");
            sb.append(toTableRow(degraded_modularityReport_CSV())).append("\n");
            sb.append(toTableRow(duplicated_abstractionReport_CSV())).append("\n");
            sb.append(toTableRow(incomplete_abstractionReport_CSV())).append("\n");
            sb.append(toTableRow(missing_abstractionReport_CSV())).append("\n");
            sb.append(toTableRow(missing_modularityReport_CSV())).append("\n");
            sb.append(toTableRow(rebellious_modularityReport_CSV())).append("\n");
            sb.append(toTableRow(unexploited_HierarchyReport_CSV())).append("\n");
            sb.append(toTableRow(unused_abstractionReport_CSV())).append("\n");
            sb.append(toTableRow(weakened_modularityReport_CSV())).append("\n");
            sb.append(toTableRow(folded_hierarchyReport_CSV())).append("\n");
            System.out.println(sb.toString());

    }

    private String toTableRow(Report report) {
            return report.getText() + " & " + report.getNumberOfSmells() + " \\\\";
    }

    public Report broken_modularityReport_CSV() throws IOException {
            return new WrongDependencyDirection().analyze(project.getLanguage(),
                            project.getSimulatorModel(),
                            new WrongDependencyDirection().getSettings());
    }

    public Report deficient_encapsulationReport_CSV() throws IOException {
            return new DataClumbs().analyze(project.getLanguage(), project.getSimulatorModel(),
                            new DataClumbs().getSettings());
    }

    public Report degraded_modularityReport_CSV() throws IOException {
            return new FeatureScatter().analyze(project.getLanguage(), project.getSimulatorModel(),
                            new FeatureScatter().getSettings());
    }

    public Report duplicated_abstractionReport_CSV() throws IOException {
            return new DuplicateAbstraction().analyze(project.getLanguage(),
                            project.getSimulatorModel(), new DuplicateAbstraction().getSettings());
    }

    public Report incomplete_abstractionReport_CSV() throws IOException {
            return new SwitchStatements().analyze(project.getLanguage(),
                            project.getSimulatorModel(), new SwitchStatements().getSettings());
    }

    public Report missing_abstractionReport_CSV() throws IOException {
            return new PrimitiveObession().analyze(project.getLanguage(),
                            project.getSimulatorModel(), new PrimitiveObession().getSettings());
    }

    public Report missing_modularityReport_CSV() throws IOException {
            return new MissingModularity().analyze(project.getLanguage(),
                            project.getSimulatorModel(), new MissingModularity().getSettings());
    }

    public Report rebellious_modularityReport_CSV() throws IOException {
            return new LanguageBlob().analyze(project.getLanguage(), project.getSimulatorModel(),
                            new LanguageBlob().getSettings());
    }

    public Report unexploited_HierarchyReport_CSV() throws IOException {
            return new UnexploitedHierarchy().analyze(project.getLanguage(),
                            project.getSimulatorModel(), new UnexploitedHierarchy().getSettings());
    }

    public Report unused_abstractionReport_CSV() throws IOException {
            return new SpeculativeGenerality().analyze(project.getLanguage(),
                            project.getSimulatorModel(), new SpeculativeGenerality().getSettings());
    }

    public Report weakened_modularityReport_CSV() throws IOException {
            return new DependencyCycle().analyze(project.getLanguage(), project.getSimulatorModel(),
                            new DependencyCycle().getSettings());
    }

    public Report folded_hierarchyReport_CSV() throws IOException {
            var setting = new FoldedHierarchy().getSettings();
            setting.setValue("layer", "paradigm,domain,quality,analysis");
            return new FoldedHierarchy().analyze(project.getLanguage(), project.getSimulatorModel(),
                            setting);
    }
    // endtable
}
