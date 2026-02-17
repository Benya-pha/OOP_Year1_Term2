package Logistics04;

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

        } else if (type.equalsIgnoreCase("Air")) {

            log = new AirLogistics();

            double price = log.planDelivery(distance);

            System.out.printf("%.2f\n", price);

            log.deliver();

        }

    }
}

//Description
//เมื่อเวลาผ่านไป บริษัทขนส่งก็ได้ขยายกิจการอีกครั้ง ซึ่งได้มีการขนส่งทางอากาศเพิ่มขึ้น
//
//ครั้งนี้ โปรแกรมเมอร์ก็แก้ไขโปรแกรมเพียงเล็กน้อย โดยการเพิ่มคลาส AirLogistics และคลาส Plane. ดังนี้
//
//
//
//คลาส AirLogistics สืบทอดจากคลาส Logistics
//
//เมธอด createTransport ให้ทำการสร้างอ็อบเจกต์ Plane แล้วคืนค่า
//
//
//คลาส Plane
//
//rate อัตราค่าขนส่งกิโลเมตรละ 10 บาท
//deliver ให้พิมพ์ข้อความ “Deliver By Plane”
//
//
//โปรแกรมหลักให้ใช้ซอร์สโค้ดดังนี้
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
//} else if (type.equalsIgnoreCase("Air")) {
//
//log = new AirLogistics();
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