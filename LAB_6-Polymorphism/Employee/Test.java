package Employee;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        Sales s1 = new Sales("Jame",15000,5000);
        Sales s2 = new Sales("Bell",20000,8000);

        employees[0] = s1;
        employees[1] = s2;

        Manager m1 = new Manager("Peter" , 40000 , "40-19");

        employees[2] = m1;

        Programmer p1 = new Programmer("Ann" , 30000 , new String[]{"Java","C"}, 10000 );
        Programmer p2 = new Programmer("Bank" , 40000 , new String[]{"Java","PHP","Python"},8000 );

        employees[3] = p1;
        employees[4] = p2;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println();
        }


    }
}
