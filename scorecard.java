import java.util.Scanner;
public class scorecard{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter val of string");
   int n=sc.nextInt();
   int []a;
   a=new int[n];
   for(int i=0; i<n; i++){
      System.out.println("enter the "+i+" element:");
      a[i]=sc.nextInt();
   }
   for(int i=0; i<n; i++){
      System.out.println("array element="+a[i]);
   }
}
}