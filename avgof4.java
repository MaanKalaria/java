import java.util.Scanner;
public class avgof4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float avg=0;
        int[] a= new int[4];
        for(int i=0;i<4;i++){
            System.out.print("enter values:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            avg=(avg+a[i]);
        }
        avg=(avg)/4.0f;
        System.out.print("avg="+avg);
    }
}