package bank;
import java.util.Scanner;

public class Command2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String name,mobileNo,accNo;
        double balance = 0;

        System.out.print("Enter your name: ");
        name = Scanner.nextLine();

        System.out.print("Enter cash amount for opening an Account: ");
        balance = Scanner.nextDouble();

        System.out.print("Enter your mobile number: ");
        mobileNo = Scanner.next();
        accNo = mobileNo.substring(0,3)+ "-" + mobileNo.charAt(3)+ "-" + mobileNo.substring(4,9)+"-"+ mobileNo.charAt(9);

        Member user1 = new Member();
        user1.setName(name);
        user1.setMemberMobileNo(mobileNo);

        Account acc1 = new Account();
        acc1.setAccount(accNo);
        acc1.setBalance(balance);
        acc1.setMember(user1);
        
    
        System.out.printf("Account Number: %s\n", acc1.getAccount());
        System.out.printf("Name: %s\n", acc1.getMember().getName());
        System.out.printf("Balance: %.2f\n", acc1.getBalance());
        System.out.printf("Moblie Number: %s\n", acc1.getMember().getMemberMobileNo());
    } 
}
