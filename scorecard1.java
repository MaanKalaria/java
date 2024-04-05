import java.util.Scanner;
public class scorecard1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score=0;
        int totalruns=0;
        int []ball = new int[6];
        int []over = new int[3];
        for(int i = 0; i < over.length; i++){
            System.out.print(" over:" + (i+1));
            for(int j = 0; j < ball.length; j++){
                System.out.print(" enter runs of over:" + (j+1));
                ball[j] = sc.nextInt();
                ball[j]+=score;
                totalruns += score;
            }  
        }
        System.out.println(score);
        sc.close();
    }
}