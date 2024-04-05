import java.util.Scanner;
class rectangle{
    double h,w;
    public double area() {
        return h*w ;
    }
    public double perimeter() {
        return 2*(h+w);
    }
}
public class timepass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter val of h and w:");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        rectangle r = new rectangle();
        r.h=h;
        r.w=w;
        double perimeter = r.perimeter();
        double area = r.area();
        System.out.println("area:"+area);
        System.out.println("perimeter:"+perimeter);    
    }
}