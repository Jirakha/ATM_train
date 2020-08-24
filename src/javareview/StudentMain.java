package javareview;

import java.util.Arrays;

public class StudentMain {

    public static void main(String[] args) {
       int x = 5;
       Student s1 = new Student(1,"Somchai"); // 1 obj
       Student s2 = new Student(2,"Somjai"); // 1 obj

       // เข้าถึงตัวแปรโดยตรง public / package
        System.out.println(s1.getId()+" : " + s1.getName() );
        System.out.println(s2.getId()+" : " + s2.getName() );

        System.out.println(s1); //System.out.println(s2.toString());
        System.out.println(s2);

//        s2.id = 2;
//        s2.name = "Somjai";
//        System.out.println(s2.id+ ": "+s2.name);
//
//
//
        s1.setMidtermScore(10);
        s1.setFinalScore(8);
        System.out.println("Somchai 's total = "+s1.getTotalScore());
        System.out.println("------------------------");
//
//        Student s3 = s2; // share obj เดียวกัน
//        s3.id = 100;
//        System.out.println(s2.id+ ": "+s2.name);
//        System.out.println("------------------------");






    }



}
