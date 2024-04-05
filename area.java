import java.util.Scanner;
public class area{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter val of r:");
        int r= sc.nextInt();
        System.out.println("Area of circle:"+(Math.PI*r*r));
    }
}