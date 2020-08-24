package atm;

public class Customer {
    private int id;
    private String name;
    private String pin;
    private BankAccount account;
//CONSTRUCTOR

    public Customer(int id, String name, String pin) {
        //attributes / field
        this.id = id;
        this.name = name;
        this.pin = pin;
        //composition มีการเชื่อมโยงกับ คสลาส อื่น has a relationship
        this.account = new BankAccount(id,name,"Checking");

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
