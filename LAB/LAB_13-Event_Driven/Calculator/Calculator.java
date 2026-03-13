package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100, 100, 360, 300);
        fr.setTitle("My Calculator");
        fr.getContentPane().setLayout(null);

        JLabel lb_Number1 = new JLabel("Number 1");
        lb_Number1.setBounds(20, 30, 100, 20);
        fr.getContentPane().add(lb_Number1);

        JTextField ans_Number1 = new JTextField();
        ans_Number1.setBounds(20, 60, 100, 20);
        fr.getContentPane().add(ans_Number1);

        JLabel lb_Operator = new JLabel("Operator");
        lb_Operator.setBounds(140, 30, 100, 20);
        fr.getContentPane().add(lb_Operator);

        String[] operation = {"+", "-", "x", "/"};
        JComboBox ans_Operator = new JComboBox(operation);
        ans_Operator.setBounds(140, 60, 50, 20);
        fr.getContentPane().add(ans_Operator);

        JLabel lb_Number2 = new JLabel("Number 2");
        lb_Number2.setBounds(215, 30, 100, 20);
        fr.getContentPane().add(lb_Number2);

        JTextField ans_Number2 = new JTextField();
        ans_Number2.setBounds(215, 60, 100, 20);
        fr.getContentPane().add(ans_Number2);

        JButton bt_Calculate = new JButton("Calculate");
        bt_Calculate.setBounds(120, 160, 100, 20);
        fr.getContentPane().add(bt_Calculate);

        fr.setVisible(true);

        //when click Calculate Button
        bt_Calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                int ans1 = Integer.valueOf(ans_Number1.getText());
                int ans2 = Integer.valueOf(ans_Number2.getText());
                int sum = 0;
                if (ans_Operator.getSelectedItem().equals("+")) {
                    sum = ans1 + ans2;
                }
                if (ans_Operator.getSelectedItem().equals("-")) {
                    sum = ans1 - ans2;
                }
                if (ans_Operator.getSelectedItem().equals("x")) {
                    sum = ans1 * ans2;
                }
                if (ans_Operator.getSelectedItem().equals("/")) {
                    sum = ans1 / ans2;
                }
                JOptionPane.showMessageDialog(fr, ans1 +" "+ ans_Operator.getSelectedItem() +" "+ ans2 + " = " + sum);
            }
        });
    }
}