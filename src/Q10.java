import java.io.*;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] s = new String[5];
        for (int i = 0; i < 5; i++) {
            s[i] = sc.nextLine().trim();
        }

        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter("e.txt"));
            for(String i : s){
                bw.write(i);
                bw.newLine();
            }

            BufferedReader br = new BufferedReader(new FileReader("e.txt"));
            String line;
            StringBuilder full= new StringBuilder();

            while((line = br.readLine()) != null){
                full.append(line).append(" ");
            }

            full = new StringBuilder(full.toString().trim());
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("f.txt"));
            bw2.write(full.toString());

            bw.close();
            bw2.close();

        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
