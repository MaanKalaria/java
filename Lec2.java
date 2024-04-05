import java.util.Scanner;
public class Lec2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        if(temp.trim().equals("maan")){    //trim() is used for ignoring white spaces
                System.out.println("valid user");
        }
        else{
            System.out.println("invalid user");
        }
    }
}