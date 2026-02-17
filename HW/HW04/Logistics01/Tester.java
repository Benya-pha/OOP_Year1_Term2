package Logistics01;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int distance = kb.nextInt();
        Logistics L1 = new Logistics();
        Truck T1 = new Truck();

        double total = L1.planDelivery(T1, distance);
        System.out.printf("%.2f",total);
        System.out.println();
        L1.deliver();
    }
}
//Description
//บริษัทขนส่งสินค้าแก่งหนึ่งได้เริ่มทำธุรกิจขนส่ง โดยที่บริษัทแห่งนี้ได้พัฒนาโปรแกรมขึ้นมาเพื่อจัดการการขนส่งสินค้า
//
//โปรแกรมนี้ได้มีการสร้างคลาสขนส่ง (Logistics) และคลาสรถบรรทุก (Truck) ขึ้นมา โดยมีรายละเอียดดังนี้
//
//คลาสรถบรรทุก (Truck)
//
//แอตทริบิวต์
//
//อัตราค่าขนส่ง (rate) กิโลเมตรละ 5 บาท
//เมธอด
//
//deliver() เมธอดขนส่งสินค้า ให้พิมพ์ข้อความ “Deliver By Truck”
//getRate() คืนค่าอัตราค่าขนส่ง
//
//
//คลาสขนส่ง (Logistics)
//
//แอตทริบิวต์
//
//trans อ็อบเจกต์รถบรรทุกที่ใช้ส่งสินค้า
//distance ระยะทาง
//เมธอด
//
//planDelivery() เมธอดวางแผนการขนส่ง โดยทำการกำหนดค่าอ็อบเจกต์ที่ใช้ขนส่ง ระยะทาง หลังจากนั้นทำการคำนวณค่าขนส่งและคืนค่าค่าขนส่ง โดยที่ค่าขนส่งคิดจากระยะทาง * อัตราค่าขนส่ง
//deliver() สั่งให้รถบรรทุกเริ่มขนส่ง
//
//
//โปรแกรมหลัก
//
//ให้รับค่าระยะทาง หลังจากนั้นสร้างอ็อบเจกต์ Logistics แล้วสั่งวางแผนการขนส่งแล้วพิมพ์ค่าขนส่งออกทางจอภาพและเริ่มขนส่งสินค้า
