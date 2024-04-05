public class Lab9_2 {
    public static void main(String[] args) {
      MyThread12 t12 = new MyThread12();
      MyThread21 t21 = new MyThread21();
      t12.start();
      t21.start();
    }
}
class MyThread12 extends Thread{
    public void run(){
      for(int i=1; i<=20; i++){
        if(i%2==0){
          try{
            Thread.sleep(50);
            System.out.println(i);
          }
          catch(Exception e){
            e.printStackTrace();
          }
        }
      }
    }
}
class MyThread21 extends Thread{
    public void run(){
      for(int i=1; i<=20; i++){
        if(i%2!=0){
          try{
            Thread.sleep(50);
            System.out.println(i);
          }
          catch(Exception e){
            e.printStackTrace();
          }
        }
      }
    }
}