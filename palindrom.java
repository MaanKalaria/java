import java.util.Scanner;
public class palindrom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number:");
        int a= sc.nextInt();
        int b=0;
        int x=a;
        int last;
        while(a>0){
        last = a%10;
        b=b*10+last;
        a=a/10;
    }
    if(b==x){
        System.out.println("number is palindrom");
    }
    else{
        System.out.println("number is not palindrom");
    }
}
}