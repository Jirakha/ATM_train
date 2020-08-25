package atm;

public class ATM
{
    private Bank bank;
    private Customer currentCustomer;

    public ATM(Bank bank)
    {

         this.bank = bank;
    }
    public void validateCustomer(int id, String pin) {

        Customer matchingCustomere = bank.findCustomer(id);

        if (matchingCustomere != null && matchingCustomere.checkPin(pin)) {
            currentCustomer = matchingCustomere;
        }

    }
        public void deposit(double amount)
        {currentCustomer.getAccount().deposit(amount);}

        public void withdraw(double amount)
        {currentCustomer.getAccount().withdraw(amount);}

        public void transfer(int receiverId, double amount)
        {
            Customer receiver = bank.findCustomer(receiverId);
            currentCustomer.getAccount().withdraw(amount);
            receiver.getAccount().deposit(amount);

        }

        public void  getBalance()
        {

        }

        public void end()
        { currentCustomer = null; }


    }


