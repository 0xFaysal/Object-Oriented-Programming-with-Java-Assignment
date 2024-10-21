
import java.io.*;
import java.util.*;

public class Q10_v2 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String s;
        String full="";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("e.txt"));
            while (i < 5) {
                s = sc.nextLine();
                bw.write(s);
                bw.newLine();
                i++;
            }

            bw.close();
        } catch (IOException e) {}

        try{
            BufferedReader br = new BufferedReader(new FileReader("e.txt"));


            while ((s= br.readLine())!=null){
                full += (s + " ");

            }
            full = full.trim();


        }catch (IOException e){}

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("f.txt"));
            bw.write(full);

            bw.close();
        }
        catch(IOException e){}


    }
}