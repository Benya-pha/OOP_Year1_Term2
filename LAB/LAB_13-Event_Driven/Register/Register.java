package Register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends Person{
    public Register(String username, String password, String name, String email) {
        super(username, password, name, email);
    }
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100, 100, 360, 300);
        fr.setTitle("GUI Tutorial");
        fr.getContentPane().setLayout(null);

        //label_register_data
        JLabel lb_register_data = new JLabel("Register Data");
        lb_register_data.setBounds(130,0,100,40);
        fr.getContentPane().add(lb_register_data);

        //Username
        JLabel lb_Username = new JLabel("Username  : ");
        lb_Username.setBounds(50,30,100,40);
        fr.getContentPane().add(lb_Username);

        JTextField ans_username = new JTextField();
        ans_username.setBounds(180,40,120,20);
        fr.getContentPane().add(ans_username);

        //Password
        JLabel lb_Password = new JLabel("Password  : ");
        lb_Password.setBounds(50,60,100,40);
        fr.getContentPane().add(lb_Password);

        JPasswordField ans_password = new JPasswordField();
        ans_password.setBounds(180,70,120,20);
        fr.getContentPane().add(ans_password);

        //Confirm Password
        JLabel lb_ConfirmPassword = new JLabel("Confirm Password  : ");
        lb_ConfirmPassword.setBounds(50,90,150,40);
        fr.getContentPane().add(lb_ConfirmPassword);

        JPasswordField ans_confirmPassword = new JPasswordField();
        ans_confirmPassword.setBounds(180,100,120,20);
        fr.getContentPane().add(ans_confirmPassword);

        //Name
        JLabel lb_Name = new JLabel("Name  : ");
        lb_Name.setBounds(50,120,100,40);
        fr.getContentPane().add(lb_Name);

        JTextField ans_name = new JTextField();
        ans_name.setBounds(180,130,120,20);
        fr.getContentPane().add(ans_name);


        //Email
        JLabel lb_Email = new JLabel("Email  : ");
        lb_Email.setBounds(50,150,100,40);
        fr.getContentPane().add(lb_Email);

        JTextField ans_email = new JTextField();
        ans_email.setBounds(180,160,120,20);
        fr.getContentPane().add(ans_email);

        //Save button
        JButton bt_save = new JButton("Save");
        bt_save.setBounds(120, 200, 100, 20);
        fr.getContentPane().add(bt_save);

        fr.setVisible(true);

        //when click Save Button
        bt_save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {

                String username = ans_username.getText();
                String password = new String(ans_password.getPassword());
                String confirmPassword = new String(ans_confirmPassword.getPassword());
                String name = ans_name.getText();
                String email = ans_email.getText();

                if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(fr, "Please input your username");

                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(fr, "Please input your password");

                } else if (confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(fr, "Please input your confirm password");

                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(fr, "Password Not Match! Try Again please");

                } else if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(fr, "Please input your name");

                } else if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(fr, "Please input your email");

                } else {
                    JOptionPane.showMessageDialog(fr,
                            "Register Data Successfully\n" +
                                    "Name : " + name + "\n" +
                                    "Email : " + email);
                }
            }
        });
    }

}
