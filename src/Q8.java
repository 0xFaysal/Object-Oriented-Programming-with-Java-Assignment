import java.io.*;

public class Q8 {
    public static void main(String[] args) {
        try {
            System.out.println("Person with maximum age has ID: " + getMaxAgePersonId("person.txt"));
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static String getMaxAgePersonId(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        String maxAgeId = "";
        int maxAge = -1;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("/");  // Split line by '/'
            String id = parts[0];              // First part is ID
            int age = Integer.parseInt(parts[1]);  // Second part is age

            // Update maxAge and maxAgeId if the current person has a higher age
            if (age > maxAge) {
                maxAge = age;
                maxAgeId = id;
            }
        }

        reader.close();
        return maxAgeId;  // Return ID of the person with maximum age
    }
}

