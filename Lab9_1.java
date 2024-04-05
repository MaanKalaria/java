public class Lab9_1{
    public static void main(String[] args) {
        try{
            Thread1 t1 = new Thread1();
            Thread x = new Thread(t1);
            x.start();
            x.join();
            Thread2 t2 = new Thread2();
            Thread x2 = new Thread(t2);
            x2.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }   
    }
}
class Thread1 implements Runnable{
    public void run(){
        for (int i = 0; i <10; i++){
            try{
                System.out.println("GOOD MORNING");
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for (int i = 0; i <10; i++){
            try{
                System.out.println("GOOD AFTERNOON");
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}