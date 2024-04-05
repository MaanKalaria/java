import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int a= sc.nextInt();
        int[] n=new int[a];
        for(int i=0;i<a; i++){
            System.out.print("enter arrays:");
            n[i]=sc.nextInt();
        }
        for(int i=a-1;i>=0;i--){
            System.out.println(n[i]);
        }
    }
}