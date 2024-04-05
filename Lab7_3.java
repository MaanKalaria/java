public class Lab7_3 {
    public static void main(String[] args){
    Animal[] arr ={
        new Tiger(),
        new Camel(),
        new Deer(),
        new Donkey()
    };
    for(Animal a : arr){
        if(a instanceof Transport){
            ((Transport)a).delivery();
            }
        }
    }
}
interface Transport{
    public void delivery();
}
abstract class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
    public void delivery(){
    System.out.println("Camel ");
    }
}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
    public void delivery(){
    System.out.println("Donkey ");
    }
}