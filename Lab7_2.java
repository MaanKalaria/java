public class Lab7_2 {
    public static void main(String[] args) {
        B b = new B();
        b.printhello();
    }    
}
interface A{
    int a=10;
    public void printhello();
}
interface A1 extends A{

}
interface A2 extends A{

}
interface A12 extends A1 , A2{

}
class B implements A12{
    public void printhello(){
        System.out.println("hello");
    }
}