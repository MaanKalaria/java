import java.util.Scanner;
public class volorcon{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter string:");
    String a = sc.nextLine();
    int vol=0;
    int con=0;
    for (int i=0;i<a.length();i++){
        char c=a.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            vol++;
        }
        else if(c==' '){
            
        }
        else{
            con++;
        }
    }
    System.out.println("vowels="+vol);
    System.out.println("consonants="+con);
}
}