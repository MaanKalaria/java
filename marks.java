import java.util.Scanner;
public class marks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter val of 1st sub:");
        int a=sc.nextInt();
        System.out.print("enter val of 2nd sub:");
        int b=sc.nextInt();
        System.out.print("enter val of 3rd sub:");
        int c=sc.nextInt();
        System.out.print("enter val of 4th sub:");
        int d=sc.nextInt();
        System.out.print("enter val of 5th sub:");
        int e=sc.nextInt();
        float f=(a+b+c+d+e)/(float)5.0;
        if(f>60){
            System.out.print("First class");
        }
        else if(50>=f && f<=59){
            System.out.print("Second class");
        }
        else if(40>=f && f>=49){
            System.out.print("Third class");
        }
        else if(f<40){
            System.out.print("Fail");
        }
        //60 first 50-59 second 40-49 third 40 fail 
    }
}