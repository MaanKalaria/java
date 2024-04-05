// import java.util.Scanner;
// class Student{
//     Scanner s=new Scanner(System.in);
//     int id_no=0;
//     int no_of_subject=5;
//     int subject_code=0;
//     int[] subjct_credit=new int[5];
//     char[] grade_obtained=new char[5];
//     int spi=0;
//     int totalcredit=0;
// Student(){
//     Scanner sc = new Scanner(System.in);
//     this.id_no = sc.nextInt();
//     System.out.println("enter subject code");
//     this.subject_code = sc.nextInt();
//     for(int i=0;i<5;i++){
//         System.out.println("enter credit: ");
//         subjct_credit[i] = sc.nextInt();
//         System.out.println("entrer grade: ");
//         grade_obtained[i] = sc.next().charAt(0);
//         totalcredit += subjct_credit[i];
//         }
//     }
//     void calcspi(){
//         int totalmarks=0;
//         for(int i=0;i<5;i++){
//             if(grade_obtained[i] == 'A'){
//                 totalmarks += 10;
//             }
//             else if(grade_obtained[i] == 'b'){
//                 totalmarks += 7;
//             }
//             else if(grade_obtained[i] == 'c'){
//                 totalmarks += 4;
//             }
//             else if(grade_obtained[i] == 'd'){
//                 totalmarks += 3;
//             }
//         }
//         spi=totalmarks/totalcredit;
//     }
// }
// public class lab6_1 {
//     public static void main(String[] args){
//         int n = Integer.parseInt(args[0]);
//         Student[] students = new Student[n];
//         for(int i=0;i<n;i++){
//             students[i] = new Student();
//         }
//         for(int j=0;j<n;j++){
//         students[j].calcspi();
//         }
//     }
// }