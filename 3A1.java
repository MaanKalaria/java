public static marks{
    public static void main(String[] args){
        int marks= 60;
        if(marks>60){
            System.out.println("First class");
        }
        else if(50>marks<59){
            System.out.println("Second class");
        }
        else if(40>marks<49){
            System.out.println("Third class");
        }
        else if(marks<40){
            System.out.println("Fail");
        }
        //60 first 50-59 second 40-49 third 40 fail 
    }
}