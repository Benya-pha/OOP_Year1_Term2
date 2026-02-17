package Student;

public class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String checkStatus(){
        if (gpa >= 2.00){
            return "Normal";
        } else if (gpa < 2.00 && gpa >= 1.75) {
            return "Probation";
        } else if (gpa < 1.75) {
            return "Retired";
        }
        return "-1";
    }

    public String getType(){
        String ID = Integer.toString(id);
        if (ID.charAt(2) == '1'){
            return "(Day)";
        }else if(ID.charAt(2) == '6') {
            return "(Spacial)";
        }else {
            return "Error";
        }
    }
}
