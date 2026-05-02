package Assignment2;

import java.util.Scanner;

// Flood Risk Alert System
public class Flood {

    static final int NUM_AREAS = 5;
    static final int NUM_DAYS  = 7;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] areaNames = new String[NUM_AREAS];
        double[][] rainfall = new double[NUM_AREAS][NUM_DAYS];
        double[] avgRainfall = new double[NUM_AREAS];
        String[] riskLevel = new String[NUM_AREAS];

        collectInput(sc, areaNames, rainfall);
        calculateAverages(rainfall, avgRainfall);
        assignRiskLevels(avgRainfall, riskLevel);

        displayReport(areaNames, avgRainfall, riskLevel);
        findHighestRisk(areaNames, avgRainfall);
        checkEmergencyAlert(areaNames, riskLevel);

        sc.close();
    }

    // Input: area names and rainfall data
    static void collectInput(Scanner sc, String[] areaNames, double[][] rainfall) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     FLOOD RISK ALERT SYSTEM          ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println("Enter rainfall data for " + NUM_AREAS + " areas.\n");

        for (int i = 0; i < NUM_AREAS; i++) {
            System.out.print("Enter name for Area " + (i + 1) + ": ");
            areaNames[i] = sc.next();

            for (int j = 0; j < NUM_DAYS; j++) {
                System.out.print("  Day " + (j + 1) + " rainfall (mm): ");
                rainfall[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
    }

    // Process: calculate average rainfall
    static void calculateAverages(double[][] rainfall, double[] avgRainfall) {

        for (int i = 0; i < NUM_AREAS; i++) {
            double sum = 0;

            for (int j = 0; j < NUM_DAYS; j++) {
                sum += rainfall[i][j];
            }

            avgRainfall[i] = sum / NUM_DAYS;
        }
    }

    // Decision: assign risk levels
    static void assignRiskLevels(double[] avgRainfall, String[] riskLevel) {

        for (int i = 0; i < NUM_AREAS; i++) {

            if (avgRainfall[i] < 20) {
                riskLevel[i] = "LOW";
            } else if (avgRainfall[i] < 40) {
                riskLevel[i] = "MEDIUM";
            } else if (avgRainfall[i] < 60) {
                riskLevel[i] = "HIGH";
            } else {
                riskLevel[i] = "CRITICAL";
            }
        }
    }

    // Output: display formatted report
    static void displayReport(String[] areaNames, double[] avgRainfall, String[] riskLevel) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║            FLOOD RISK SUMMARY REPORT         ║");
        System.out.println("╠══════════════╦═══════════════╦═══════════════╣");
        System.out.println("║ Area         ║  Avg Rain(mm) ║  Risk Level   ║");
        System.out.println("╠══════════════╬═══════════════╬═══════════════╣");

        for (int i = 0; i < NUM_AREAS; i++) {

            String indicator;
            switch (riskLevel[i]) {
                case "LOW": indicator = "LOW"; break;
                case "MEDIUM": indicator = " MEDIUM"; break;
                case "HIGH": indicator = " HIGH"; break;
                default: indicator = "CRITICAL";
            }

            System.out.printf("║ %-12s ║ %13.2f ║ %-13s ║%n",
                    areaNames[i], avgRainfall[i], indicator);
        }

        System.out.println("╚══════════════╩═══════════════╩═══════════════╝");
        System.out.println();
    }

    // Find area with highest rainfall
    static void findHighestRisk(String[] areaNames, double[] avgRainfall) {

        int maxIndex = 0;

        for (int i = 1; i < NUM_AREAS; i++) {
            if (avgRainfall[i] > avgRainfall[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println(" Most At-Risk Area: " + areaNames[maxIndex]
                + " (" + String.format("%.2f", avgRainfall[maxIndex]) + " mm avg)");
        System.out.println();
    }

    // While loop: check for critical alerts
    static void checkEmergencyAlert(String[] areaNames, String[] riskLevel) {

        int i = 0;
        boolean alert = false;

        while (i < NUM_AREAS) {
            if (riskLevel[i].equals("CRITICAL")) {
                System.out.println(" EMERGENCY ALERT: " + areaNames[i]
                        + " is at CRITICAL flood risk!");
                alert = true;
            }
            i++;
        }

        if (!alert) {
            System.out.println(" No critical flood risk detected.");
        }
    }
}
