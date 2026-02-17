package Logistics03;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int distance = kb.nextInt();

        String type = kb.next();

        Logistics log;

        if(type.equalsIgnoreCase("Road")){

            log = new RoadLogistics();

            double price = log.planDelivery( distance);

            System.out.printf("%.2f\n", price);

            log.deliver();

        }else if(type.equalsIgnoreCase("Sea")){

            log = new SeaLogistics();

            double price = log.planDelivery(distance);

            System.out.printf("%.2f\n", price);

            log.deliver();

        }

    }
}

//Description
//หลังจากโปรแกรมขนส่งถูกใช้งานไปหลายเดือน บริษัทก็ขยายกิจการให้ขนส่งด้วยเรือเพิ่มขึ้น ดังนั้น จึงเป็นอีกครั้งที่ต้องแก้โปรแกรม
//
//ซึ่งในครั้งนี้ เราออกแบบโปรแกรมให้รองรับการขนส่งแบบต่างๆ ด้วย เช่น ขนส่งทางอากาศ
//
//โดยส่วนของคลาส Logistics ได้ปรับเป็น abstract class
//
//และปรับปรุงเมธอด ดังนี้
//
//planDelivery() เป็นเมธอดวางแผนขนส่ง โดยภายในเมธอด ให้เรียกใช้งานเมธอด createTransport() แล้วทำการคำนวณค่าขนส่งและคืนค่าขนส่ง
//createTransport() เป็น abstract method ที่ใช้สร้างอ็อบเจกต์ที่ใช้ส่งสินค้า
//
//
//คลาส RoadLogistics และคลาส SeaLogistics ให้ทำการ override method createTransport() โดยภายในเมธอดนี้ ให้ทำการสร้างอ็อบเจกต์ Truck หรือ Ship ตามลักษณะ
//
//การขนส่งแล้วคืนค่าอ็อบเจกต์ออกไป
//
//
//
//คลาส Ship ให้ implement Interface Transport โดยที่กำหนดอัตราค่าขนส่ง กิโลเมตรละ 2 บาท
//
//เมธอด deliver() เมธอดขนส่งสินค้า ให้พิมพ์ข้อความ “Deliver By Ship”
//
//
//โปรแกรมหลัก ให้รับค่าระยะทางและประเภทการขนส่ง (Road หรือ Sea) แล้วสั่งวางแผนการขนส่งแล้วพิมพ์ค่าขนส่งออกทางจอภาพและเริ่มขนส่งสินค้า
//
//
//
//ซอร์สโค้ดโปรแกรมหลัก
//
//public static void main(String[] args) {
//
//Scanner kb = new Scanner(System.in);
//
//int distance = kb.nextInt();
//
//String type = kb.next();
//
//Logistics log;
//
//if(type.equalsIgnoreCase("Road")){
//
//log = new RoadLogistics();
//
//double price = log.planDelivery( distance);
//
//System.out.printf("%.2f\n", price);
//
//log.deliver();
//
//}else if(type.equalsIgnoreCase("Sea")){
//
//log = new SeaLogistics();
//
//double price = log.planDelivery(distance);
//
//System.out.printf("%.2f\n", price);
//
//log.deliver();
//
//}
//
//}