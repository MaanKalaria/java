import java.util.Scanner;
public class lab5_4 {
    public static void main(String[] args){
        Bank_Account B1 = new Bank_Account();
        B1.getAccountDetails();
        B1.displayAccountDetails();
    }
}
class Bank_Account{
    int accno;
    String username;
    String email;
    String acctype;
    double accbalance;

    void getAccountDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter acc no. :");
        this.accno = sc.nextInt();
        System.out.print("enter username :");
        this.username = sc.next();
        System.out.print("enter email :");
        this.email = sc.next();
        System.out.print("enter acctype :");
        this.acctype = sc.next();
        System.out.print("enter accbalance :");
        this.accbalance = sc.nextDouble();
    }
    void displayAccountDetails(){
        System.out.println("enter acc no. :"+this.accno);
        System.out.println("enter username"+this.username);
        System.out.println("enter email"+this.email);
        System.out.println("enter acctype"+this.acctype);
        System.out.println("enter accbalance"+this.accbalance);
    }
}