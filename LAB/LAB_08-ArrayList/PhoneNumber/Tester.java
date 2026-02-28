package PhoneNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<PhoneNumber> list = new ArrayList<PhoneNumber>();
        String cmd;

        do {
            System.out.println("This program run until you key Q");
            System.out.print("Insert what do you want : ");
            cmd = kb.next();

            if(cmd.equals("add")){
                String name = kb.next();
                int phoneNum = kb.nextInt();
                PhoneNumber p1 = new PhoneNumber(name,phoneNum);
                list.add(p1);
            } else if (cmd.equals("search")) {
                String name = kb.next();
                boolean isFound = false;

                for (int i = 0; i < list.size(); i++) {
                    if (name.equals(list.get(i).getName())){
                        isFound = true;
                        System.out.println(list.get(i).getName() + " " + list.get(i).getPhoneNum());
                    }
                }
                if (isFound == false){
                    System.out.println(name + " Not found");
                }
            } else if (cmd.equals("delete")) {
                String name = kb.next();
                boolean isFound = false;
                for (int i = 0; i < list.size(); i++) {
                    if (name.equals(list.get(i).getName())){

                        isFound = true;
                        System.out.print("Do you confirm to Delete (Y/N) : ");
                        String confirm = kb.next();

                        if (confirm.equalsIgnoreCase("Y")){
                            list.remove(i);
                        }else {

                        }
                    }
                }
                if (isFound == false){
                    System.out.println(name + " Not found");
                }
            } else if (cmd.equalsIgnoreCase("Q")) {
                break;
            }
            System.out.println(list);
        }while (!cmd.equals("Q"));
    }
}
