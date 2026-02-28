package WorkParttime;

public class Tester {
    public static void main(String[] args) {
        Employee unun = new Employee("nongUnUn" , "janyaporn" , 23000);
        System.out.println(unun);
        System.out.println(unun.Pay());

        System.out.println();

        Parttime autit = new Parttime("nongIt","it",17,50);
        System.out.println(autit);
        System.out.println(autit.Pay());
        }
    }
