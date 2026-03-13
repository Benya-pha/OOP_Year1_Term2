package Information;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextField_LAB{

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100, 100, 360, 510);

        fr.setTitle("Welcome to Java GUI");
        fr.getContentPane().setLayout(null);

        //name
        JLabel name_label = new JLabel("Name  ");
        name_label.setBounds(50, 50, 200, 14);
        fr.getContentPane().add(name_label);
        
        JTextField name = new JTextField();
        name.setBounds(120, 50, 144, 20);
        fr.getContentPane().add(name);

        //pass
        JLabel pass_label = new JLabel("Password  ");
        pass_label.setBounds(50, 80, 200, 14);
        fr.getContentPane().add(pass_label);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(120, 80, 144, 20);
        fr.getContentPane().add(pass);

        //address
        JLabel address_label = new JLabel("Address  ");
        address_label.setBounds(50, 110, 200, 14);
        fr.getContentPane().add(address_label);

        JTextArea address = new JTextArea(5,120);
        address.setBounds(120, 110, 144, 50);
        fr.getContentPane().add(address);

        JScrollPane scroll = new JScrollPane(address);
        scroll.setBounds(120, 110, 144, 50);
        fr.getContentPane().add(scroll);

        //Radio Button
        JLabel gender_label = new JLabel("Gender  ");
        gender_label.setBounds(50, 170, 200, 14);
        fr.getContentPane().add(gender_label);
        //button_gender
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(120, 170, 55, 23);
        fr.getContentPane().add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(180, 170, 67, 23);
        fr.getContentPane().add(female);
        //Button Group
        ButtonGroup gender_group = new ButtonGroup();
        gender_group.add(male);
        gender_group.add(female);

        //Skill
        JLabel skill_label = new JLabel("Skills  ");
        skill_label.setBounds(50, 200, 200, 14);
        fr.getContentPane().add(skill_label);

        JCheckBox cb1 = new JCheckBox("C");
        cb1.setBounds(120, 200, 35, 14);
        fr.getContentPane().add(cb1);

        JCheckBox cb2 = new JCheckBox("C++");
        cb2.setBounds(120, 220, 50, 14);
        fr.getContentPane().add(cb2);

        JCheckBox cb3 = new JCheckBox("Java");
        cb3.setBounds(120, 240, 53, 14);
        fr.getContentPane().add(cb3);

        JCheckBox cb4 = new JCheckBox("Python");
        cb4.setBounds(120, 260, 65, 14);
        fr.getContentPane().add(cb4);

        JCheckBox cb5 = new JCheckBox("PHP");
        cb5.setBounds(120, 280, 53, 14);
        fr.getContentPane().add(cb5);

        JCheckBox cb6 = new JCheckBox("R");
        cb6.setBounds(120, 300, 35, 14);
        fr.getContentPane().add(cb6);

        //Education
        JLabel edu_label = new JLabel("Education  ");
        edu_label.setBounds(50, 340, 200, 14);
        fr.getContentPane().add(edu_label);

        String[] education = {"High school", "Bachelor", "Master’s Degree", "Ph.D."};
        JComboBox cb_education = new JComboBox(education);
        cb_education.setBounds(120, 340, 100, 20);
        fr.getContentPane().add(cb_education);

        //button
        JButton ok_bt = new JButton("OK");
        ok_bt.setBounds(120, 440, 80, 23);
        fr.getContentPane().add(ok_bt);

        fr.setVisible(true);

        //when_ok_bt_Clicked
        ok_bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String gender = male.isSelected() ? "Male" : "Female";
                String skills = "";
                if (cb1.isSelected()){
                    skills += "C ";
                }if (cb2.isSelected()){
                    skills += "C++ ";
                }if (cb3.isSelected()){
                    skills += "Java ";
                }if (cb4.isSelected()){
                    skills += "Python ";
                }if (cb5.isSelected()){
                    skills += "PHP ";
                }if (cb6.isSelected()){
                    skills += "R ";
                }

                JOptionPane.showMessageDialog(fr,
                        "Your information\n"+
                                "Name : "+name.getText()+"\n"+
                                "Address : "+address.getText()+"\n"+
                                "Gender : "+gender+"\n"+
                                "Skill : "+skills+"\n"+
                                "Education : "+cb_education.getSelectedItem()+"\n"
                );
            }
        });
    }

}