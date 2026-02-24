package Score;

import java.io.*;
import java.util.Scanner;

public class Score_check {
    public static void main(String[] args) throws IOException {
        File scores = new File("C:\\Users\\Mr_A_Dell\\IdeaProjects\\LAB10\\src\\Score\\score.txt");

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
