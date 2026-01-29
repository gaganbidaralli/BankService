public class BankService 
{
    static class BankAccount
    {
        private double balance;
        
        BankAccount(double b)
        {
            if(b<0) throw new IllegalArgumentException();
                balance=b;
        }
        
        void deposit(double a)
        {
            if(a<0) throw new IllegalArgumentException();
                balance +=a;
        }
        
        void withdrawl(double a)
        {
            if(a<0) throw new IllegalArgumentException();
                balance -=a;
        }
        
        double getBalance()
        {
            return balance;
        }
    }
    
    public static void main(String[] args)
    {
        BankAccount bc=new BankAccount(500);
        System.out.println(bc.getBalance());
    }

}
