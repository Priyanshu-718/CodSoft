import java.util.*;
class user
    {
        String name;
        int balance;
        int withdraw;
        int deposit;
        Scanner b =new Scanner(System.in) ;
        public void account()
        {
            System.out.println("Account name");
            name=b.nextLine();
        }
        public void accountdetails()
        {
            System.out.println("Your account balance is: "+balance);
            System.out.println("The amount you withdraw is:"+withdraw);
            System.out.println("Your deposited account is: "+ deposit);
        }
    }
        
 class Atmmachine
  
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        int withdraw;
        int amount;
        int balance;
        int deposit;
        System.out.println("Your balance is :");
        amount=a.nextInt();
        System.out.println("How much you want to withdraw: ");
        withdraw=a.nextInt();
        balance=amount-withdraw;
        System.out.println("Your balance is: " + balance);
        System.out.println("How much you want to deposit: ");
        deposit=a.nextInt();
        user user1;
        user1=new user();
        user1.name="Ram ";
        user1.balance=balance;
        user1.withdraw=withdraw;
        user1.deposit=balance+deposit;
        user1.account();
        user1.accountdetails();
        System.out.println("THANK YOU");


    }


    }

