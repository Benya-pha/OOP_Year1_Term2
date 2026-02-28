package Score;

import java.io.*;
import java.util.Scanner;

public class Score_check {
    public static void main(String[] args) throws IOException {
        File scores = new File("/workspaces/OOP_Year1_Term2/LAB/LAB_10-File_Operation/Score/score.txt");

        Scanner kb = new Scanner(scores);

        String id;
        int score;

        while (kb.hasNext()){
            id = kb.next();
            score = kb.nextInt();

            if (score >= 60 ){
                System.out.println("ID : "+id+" Grade : S");
            }else {
                System.out.println("ID : "+id+" Grade : U");
            }
        }
    }
}
