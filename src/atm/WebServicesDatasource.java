package atm;

import java.util.ArrayList;

public class WebServicesDatasource implements Datasource {

    public ArrayList<Customer> getCustomerData()
    {
        //  จำลองการต่อ web service ด้วย API เพื่อดึงข้อมูลลูกค้า
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"แอนดี้","1234"));
        customers.add(new Customer(200,"ไปรอัน","2345"));
        return customers;

    }



}
