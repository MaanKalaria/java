import java.util.Scanner;
public class palindrom1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String a=sc.next();
        int start=0;
        int b=0;
        int end=a.length()-1;
        while(start<=end){
            if(a.charAt(start)==a.charAt(end)){
                b=1;
                start++;
                end--;
            }
            break;
        }
        if(b==0){
            System.out.println("palindrom");
        }
        else{System.out.println("not palindrom");
        }
    }
}