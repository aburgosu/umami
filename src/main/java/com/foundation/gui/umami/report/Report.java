package com.foundation.gui.umami.report;

import com.foundation.gui.core.utils.Log;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Report class.
 *
 * @author Andres Burgos
 * @version 1.0
 */
public class Report {
    /**
     * This method gets an instance of from getInstance.
     *
     * @return Report instance.
     */
    public static Report getInstance() {
        return new Report();
    }

    /**
     * This method set up and create a report.
     */
    public void generateReport() {
        final File reportOutputDirectory = new File("target");
        final List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");
        final String projectName = "BiiaLab";
        final Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        // additional metadata presented on main page.
        configuration.addClassifications("Platform", "WINDOWS");
        configuration.addClassifications("Branch", "RELEASE/1.0");
        final ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);

        // and here validate 'result' to decide what to do if report has failed.
        final Reportable result = reportBuilder.generateReports();
        Log.getInstance().getLog().info(result);
    }
}
