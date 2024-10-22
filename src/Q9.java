import java.io.*;

public class Q9 {

    public static void main(String[] args) {
        String inputFile = "id.txt";
        String oddFile = "odd.txt";
        String evenFile = "even.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFile));
                BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFile))
        ) {
            String id;
            while ((id = reader.readLine()) != null) {
                // Check if the last digit is odd or even
                char lastDigit = id.charAt(id.length() - 1);

                // If last digit is odd, write to odd.txt, otherwise to even.txt
                if (lastDigit % 2 != 0) {
                    oddWriter.write(id);
                    oddWriter.newLine();
                } else {
                    evenWriter.write(id);
                    evenWriter.newLine();
                }
            }

            System.out.println("ID separation completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
