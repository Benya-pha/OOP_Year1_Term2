package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < num; i++) {
            int id = kb.nextInt();
            String name = kb.next();
            double gpa = kb.nextDouble();
            Student s1 = new Student(id,name,gpa);
            students.add(s1);
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + " " + students.get(i).getType() + " " + students.get(i).checkStatus() );
        }
    }
}
