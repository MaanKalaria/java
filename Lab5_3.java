import java.util.Scanner;
public class Lab5_3 {
    static class Sentence {
        String x;
        int ca = 0,ce=0,ci=0,co=0,cu=0;
        void vow(String x) {
            this.x = x;
            for(int i=0;i<x.length();i++) {
                char c = Character.toLowerCase(x.charAt(i));
                if (c=='a') ca++;
                else if (c=='e') ce++;
                else if (c=='i') ci++;
                else if (c=='o') co++;
                else if (c=='u') cu++;
            }
            System.out.println("A="+ca);
            System.out.println("E="+ce);
            System.out.println("I="+ci);
            System.out.println("O="+co);
            System.out.println("U="+cu);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sentence sentenceCounter = new Sentence();
        while(true){
            System.out.println("Enter string:");
            String x = sc.next();
            if(x.equals("quit")){
                break;
            }
            else{
                sentenceCounter.vow(x);
            }
        }
    }
}

//import java.util.Scanner;
// public class Lab5_3 {
//     class sentence{
//         String x;
//         int ca=0,ce=0,ci=0,co=0,cu=0;
//         void vow(String x){
//             this.x=x;
//             for(int i=0;i<x.length();i++){
//                 if(x.charAt(i)=='a') ca++;
//                 else if(x.charAt(i)=='e') ce++;
//                 else if(x.charAt(i)=='i') ci++;
//                 else if(x.charAt(i)=='o') co++;
//                 else if(x.charAt(i)=='u') cu++;
//             }
//             System.out.println("A="+ca);
//             System.out.println("E="+ce);
//             System.out.println("I="+ci);
//             System.out.println("O="+co);
//             System.out.println("U="+cu);
//         }
//     }
// }
// class vowel{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         vowel v1 = new vowel();
//         while(true){
//             System.out.println("enter string:");
//             String x = sc.next();
//             if(x.equals("quit")){
//                 break;
//             }
//             else{
                
//             }
//         }
//     }
// }