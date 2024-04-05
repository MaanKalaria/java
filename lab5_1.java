import java.util.Scanner;
class Circle{
    double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
}
public class lab5_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter val of radius:");
        double radius = sc.nextDouble();
        Circle c = new Circle();
        c.radius = radius;
        double area = c.area();
        System.out.println("area:"+area);
    }
}