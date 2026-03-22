package Rian_R_Rai_Final;

import javax.swing.*;
import java.awt.*;

//คลาสหน้าต่างหลักของโปรแกรม
public class MainFrame extends JFrame {
    private Timetable timetable; //ตารางเรียน
    private InputPanel inputPanel; //แผงรับข้อมูล
    private TimetablePanel timetablePanel; //แผงแสดงตาราง

    //สร้าง MainFrame
    public MainFrame() {
        setTitle("Class Schedule"); //ชื่อหน้าต่าง
        setSize(900, 600); //ขนาดหน้าต่าง
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ปิดโปรแกรมเมื่อปิดหน้าต่าง

        setLayout(new BorderLayout());

        timetable = new Timetable();
        inputPanel = new InputPanel(timetable, this);
        timetablePanel = new TimetablePanel(timetable);

        //วางแผงซ้ายและขวา
        add(inputPanel, BorderLayout.WEST);
        add(timetablePanel, BorderLayout.CENTER);

        setVisible(true); //แสดงหน้าต่าง
    }

    //รีเฟรชตารางเรียน
    public void refreshTable() {
        timetablePanel.refresh();
    }

    //เมธอดหลักเริ่มต้นโปรแกรม
    public static void main(String[] args) {
        new TimetableApp();
    }
}