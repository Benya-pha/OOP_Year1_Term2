package Student;

import java.util.Scanner;
import java.io.*;

public class Student_Read {
    public static void main(String[] args) throws IOException{
        File f =new File("C:\\Users\\Mr_A_Dell\\IdeaProjects\\LAB10\\src\\Student\\student.txt");

        Scanner kb = new Scanner(f);

        int cs = 0;
        int it = 0;
        int se = 0;

        String id;
        String type;
        String name;
        String lastname;

        while (kb.hasNext()){
            id = kb.next();
            type = kb.next();
            if (type.equalsIgnoreCase("cs")){
                cs += 1;
            } else if (type.equalsIgnoreCase("it")) {
                it += 1;
            } else if (type.equalsIgnoreCase("se")) {
                se += 1;
            }
            name = kb.next();
            lastname = kb.next();
        }
        kb.close();
        System.out.println("There are "+ cs +" persons in Computer Science.");
        System.out.println("There are "+ it +" persons in Information Technology.");
        System.out.println("There are "+ se +" persons in Software Engineering.");
    }
}
