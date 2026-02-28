package School;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Stu_name {
    public static void main(String[] args) throws IOException {
        File f =new File("/workspaces/OOP_Year1_Term2/LAB/LAB_10-File_Operation/School/student2.txt");

        Scanner kb =new Scanner(f);

        String id;
        String name;
        String lastname;
        double grade;

        while (kb.hasNext()){
            id = kb.next();
            name = kb.next();
            lastname = kb.next();
            grade = kb.nextDouble();

            if (grade >= 2.00){
                System.out.println(id+" "+name.charAt(0)+"."+lastname+" Pass");
            } else if (grade >= 1.00 && grade < 2.00) {
                System.out.println(id+" "+name.charAt(0)+"."+lastname+" Retired");
            }
        }
    }
}
