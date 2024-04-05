abstract class Vegetables{
    public String color;

    public Vegetables(String color){
        this.color = color;
    }

     public String toString(){
        return  color;
    }
}

class Potato  extends Vegetables{
    public Potato(String  color){
        super(color);
    }
}

class  Brinjal extends Vegetables{
    public Brinjal(String color){
        super(color);
    }
}

class Tomato extends Vegetables{
    public Tomato(String color){
        super(color);
    }
} 

public class Lab7_1{
    public static void main(String[] args){
        Potato a = new Potato( "Brown");
        System.out.println(a);

        Brinjal b = new Brinjal( "Purple");
        System.out.println(b);

        Tomato c = new Tomato("Red");
        System.out.println(c);
    }
}