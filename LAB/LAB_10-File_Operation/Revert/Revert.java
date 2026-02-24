package Revert;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Revert {
    public static void main(String[] args) throws IOException {
        File og = new File("C:\\Users\\Mr_A_Dell\\IdeaProjects\\LAB10\\src\\Revert\\text.txt");
        File reverse = new File("C:\\Users\\Mr_A_Dell\\IdeaProjects\\LAB10\\src\\Revert\\revtext.txt");
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
