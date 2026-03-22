package Rian_R_Rai_Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//คลาสส่งออกข้อมูลตารางเรียนลงไฟล์
public class ScheduleExporter {
    //ส่งออกข้อมูล Timetable ลงไฟล์
    public static void export(Timetable timetable, String filename) {
        try {
            File f = new File(filename); //สร้างไฟล์
            PrintWriter out = new PrintWriter(f); //เขียนไฟล์
            out.println(timetable.toString()); //เขียนข้อมูล
            out.close(); //ปิดไฟล์
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}