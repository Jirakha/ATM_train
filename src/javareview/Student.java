package javareview;

public class Student {

    // access specifier / access modifier ตัวแปรนั้นจะเข้าถึงได้อย่างไร 4 ระดับ
    // private class ภายในเท่านั้น public package (default) protected

    // ตัวระบุการเข้าถึงตัวแปรและmethod
    // นักเรียนต้องมีฟิลด์อะไรในการจัดเก็บบ้าง field, attribute, instance variable ตัวแปรของ obj
    // เช่น id ใครก็มีค่านั้น
    // 1.field
    private int id; // ตัวแปร เป็น private
    private String name;
    private double midtermScore;
    private double finalScore;
    // 2. constructor กำหนดค่าเริ่มต้นกับตัวแปรที่เป็น private  ถูกเรียกตอนสร้าง object ครั้งเดียวตอนสร้าง obj
        public Student(int id,String name){
            // ข้อมล attribute ต่างๆ
            this.id = id;
            this.name = name;
            // กำหนด่าให้กับ instance variable ของ obj นั้น
        }

    // 3. method คล้ายฟังก์ชั่น
    public double getTotalScore(){
        double total = midtermScore + finalScore;
        return total;
        // เมทอด
    }
    // getter ช่วยอ่านค่า คืนค่า instance variable
    public int getId()    {

        return id;
    }
    public String getName()
     {  return name;}


    // setters สำหรับกำหนดค่า
     public void setName(String name)
    {  this.name = name;}

    public void setMidtermScore(double midtermScore)
    {this.midtermScore=midtermScore;}

    public void setFinalScore(double finalScore)
    {
        this.finalScore = finalScore;
    }

    public String toString(){

            return id + " -------------  " + name;
    }
}
