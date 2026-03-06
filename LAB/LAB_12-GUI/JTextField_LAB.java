import javax.swing.*;

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

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(120, 170, 60, 23);
        fr.getContentPane().add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(180, 170, 100, 23);
        fr.getContentPane().add(female);
        //Button Group
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        //Skill
        JLabel skill_label = new JLabel("Skill  ");
        skill_label.setBounds(50, 200, 200, 14);
        fr.getContentPane().add(skill_label);

        JCheckBox cb1 = new JCheckBox("C");
        cb1.setBounds(120, 200, 100, 14);
        fr.getContentPane().add(cb1);

        JCheckBox cb2 = new JCheckBox("C++");
        cb2.setBounds(120, 220, 100, 14);
        fr.getContentPane().add(cb2);

        JCheckBox cb3 = new JCheckBox("Java");
        cb3.setBounds(120, 240, 100, 14);
        fr.getContentPane().add(cb3);

        JCheckBox cb4 = new JCheckBox("Python");
        cb4.setBounds(120, 260, 100, 14);
        fr.getContentPane().add(cb4);

        JCheckBox cb5 = new JCheckBox("PHP");
        cb5.setBounds(120, 280, 100, 14);
        fr.getContentPane().add(cb5);

        JCheckBox cb6 = new JCheckBox("R");
        cb6.setBounds(120, 300, 100, 14);
        fr.getContentPane().add(cb6);

        //Education
        JLabel edu_label = new JLabel("Education  ");
        edu_label.setBounds(50, 330, 200, 14);
        fr.getContentPane().add(edu_label);

        String[] education = {"High school", "Bachelor", "Master’s Degree", "Ph.D."};
        JComboBox cb = new JComboBox(education);
        cb.setBounds(120, 330, 100, 20);
        fr.getContentPane().add(cb);

        //button
        JButton ok_bt = new JButton("OK");
        ok_bt.setBounds(120, 430, 80, 23);
        fr.getContentPane().add(ok_bt);

        fr.setVisible(true);

    }

}