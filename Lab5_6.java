public class Lab5_6{
    public static void main(String[] args){
        Count c1 =new Count();
        System.out.print("Object count="+Count.count);
    }
}
class Count{
    static int count=0;
    public Count(){
        count++;
    }
}