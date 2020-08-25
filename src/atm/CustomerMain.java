package atm;

import java.util.Arrays;

public class CustomerMain {

    public static void main(String[] args) {
        Customer peter = new Customer(1,"Peter","1234");
        Customer nancy = new Customer(2,"Nancy","6789");

        //Bank bank = new Bank("My name", new DatabaseDataSource());
        Bank bank = new Bank("My name", new WebServicesDatasource());
        bank.addCustomer(peter);
        bank.addCustomer(nancy);
        System.out.println(bank);

        ATM atm = new ATM(bank);
        atm.validateCustomer(1,"1234");
        atm.deposit(1000);
        System.out.println( peter);

        atm.withdraw(100);
        System.out.println( peter);

        atm.transfer(2,500);
        System.out.println( peter);




//        Customer c1 = bank.findCustomer(1);
  //      Customer c80 = bank.findCustomer(80);


    //    System.out.println(peter);
      //  System.out.println(nancy);

        //System.out.println(c80);
        //System.out.println(c1);

    }

}
