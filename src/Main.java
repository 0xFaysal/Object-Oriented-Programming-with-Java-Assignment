import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void printArr(int[] a){
        for(int x:a){
            System.out.println(x);
        }
    }
    public static void main(String[] args) throws IOException {
        File a = new File("a.txt");

        Scanner scF = new Scanner(a);

        while(scF.hasNext()){
            String s = scF.nextLine();
            System.out.println(s);
        }



        boolean isFile = a.createNewFile();
        System.out.println(isFile);
    }
}