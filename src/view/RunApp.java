package view;

import controller.Reports;
import static controller.Reports.getReportViewer;

public class RunApp {

    public static void main(String[] args) {
        getReportViewer()
                .setVisible(true);
    }
}
