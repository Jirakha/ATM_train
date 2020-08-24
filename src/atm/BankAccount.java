package atm;

public class BankAccount {

    private int id;
    private String name;
    private String type;
    private double balance;



    public BankAccount(int id, String name, String type) // balance ถ้าไม่ได้ส่งค่ามากำหนดเป็น 0
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = 0;
    }

    public BankAccount(int id, String name, String type, double balance)// balance ถ้าากำหนดให้ใช้ค่าที่ส่งเข้ามา
    {
        this.id = id; // attribute
        this.name = name;
        this.type = type;
        this.balance = balance;
    } // คลิกขวา เพื่อ generate code alt + ins

    public void deposit(double amount){
        balance = balance + amount;

    }
    // กรณี ไม่มี return ค่า ที่กำหนดจะต้องเป็น ไม่คืนค่าให้ใช้ void
    public void withdraw(double amount)
     {    balance = balance - amount;}
    //----------------getter------------------
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
