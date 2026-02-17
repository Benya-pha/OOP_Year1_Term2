package Employee;

public class Programmer extends Employee{
    public String[] progSkill  = new String[2];
    public int OT;

    public Programmer() {

    }

    public Programmer(String name, double salary, String[] progSkill , int OT) {
        super(name, salary);
        this.progSkill = progSkill;
        this.OT = OT;
    }

    public double celSarary(){
        return salary + OT ;
    }

    @Override
    public String toString() {

        String txtSkill = "";
        for (int i = 0; i < progSkill.length; i++) {
            if (i == progSkill.length -1){
                txtSkill += progSkill[i];
            }else {
                txtSkill += progSkill[i] + ",";
            }
        }

        return "My name is " + name + "." + " " +
                "I am an programer" +   "." + "\n" +
                "My programmer skill are : " + txtSkill + "\n" +
                "My salary is " + celSarary()   ;
    }


}
