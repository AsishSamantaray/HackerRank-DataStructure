import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {

        String sws = s.replaceAll(" ", "");

        // int row = (int)Math.floor(Math.sqrt(sws.length()));
        int column = (int)Math.ceil(Math.sqrt(sws.length()));

        StringBuilder sb = new StringBuilder();

        for(int index = 0;index<column;index++) {
            for (int i=index; i < sws.length() && i < (i + column); i+=column) {
                sb.append(sws.charAt(i)+"");
            }
            sb.append(" ");
        }  

        return sb.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
