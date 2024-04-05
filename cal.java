import java.util.Scanner;
public class  cal{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("operator:");   
        char c=sc.nextLine().charAt(0);     
        System.out.print("enter val of a:");
        float a=sc.nextFloat();
        System.out.print("enter val of b:");
        float b=sc.nextFloat();
        if(c=='-'){System.out.println(a-b);
        }
        if(c=='+'){System.out.print(a+b);
        }
        if(c=='*'){System.out.print(a*b);
        }
        if(c=='/'){System.out.print(a/b);
        }
    }
}