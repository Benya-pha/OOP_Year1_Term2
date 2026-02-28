package Revert;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Revert {
    public static void main(String[] args) throws IOException {
        File og = new File("LAB/LAB_10-File_Operation/Revert/text.txt");
        File reverse = new File("LAB/LAB_10-File_Operation/Revert/revtext.txt");
        Scanner kb = new Scanner(og);
        PrintStream out = new PrintStream(reverse);

        String text;
        String reverseText;

        while (kb.hasNext()){
            text = kb.nextLine();
            reverseText = new StringBuilder(text).reverse().toString();
            out.println(reverseText);
        }
    }
}
