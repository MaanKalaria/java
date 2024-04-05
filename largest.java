import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter val of a:");
        int a = sc.nextInt();
        System.out.print("enter val of b:");
        int b = sc.nextInt();
        System.out.print("enter val of c:");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
        }
        else if(b>c){
            System.out.println("b is largest");
        }
        else{System.out.println("c is largest");
    }
    }   
}