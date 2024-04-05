import java.util.Scanner;
public class temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter val in F:");
        float F=sc.nextFloat();
        System.out.println((F-32)*5/9);
    }
}