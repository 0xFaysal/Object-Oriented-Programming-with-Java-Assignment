import java.io.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] employeeNames = new String[n];
        String[] employeeIds = new String[n];
        double[] averageScores = new double[n];

        // Taking employee data input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            employeeNames[i] = scanner.nextLine();
            System.out.print("ID: ");
            employeeIds[i] = scanner.nextLine();

            System.out.println("Enter the performance scores for the last 6 months:");
            int[] scores = new int[6];
            int totalScore = 0;
            for (int j = 0; j < 6; j++) {
                System.out.print("Month " + (j + 1) + ": ");
                scores[j] = scanner.nextInt();
                totalScore += scores[j];
            }
            scanner.nextLine(); // Consume the newline

            // Calculating average score
            averageScores[i] = totalScore / 6.0;
        }

        // Writing employee data to "employee.txt"
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employee.txt"))) {
            for (int i = 0; i < n; i++) {
                writer.write(employeeNames[i]);
                writer.newLine();
                writer.write(employeeIds[i]);
                writer.newLine();
                writer.write(String.valueOf(averageScores[i]));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to employee.txt: " + e.getMessage());
        }

        // Reading from "employee.txt" and finding employees with average score > 75
        try (BufferedReader reader = new BufferedReader(new FileReader("employee.txt"));
             BufferedWriter incrementWriter = new BufferedWriter(new FileWriter("increment.txt"))) {

            String name, id, avgScoreStr;
            while ((name = reader.readLine()) != null) {
                id = reader.readLine();
                avgScoreStr = reader.readLine();

                double avgScore = Double.parseDouble(avgScoreStr);

                if (avgScore > 75) {
                    incrementWriter.write(name);
                    incrementWriter.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading from employee.txt or writing to increment.txt: " + e.getMessage());
        }

        System.out.println("Process completed. Check employee.txt and increment.txt files.");
    }
}
