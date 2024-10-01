public class ooppractice {
    public static void main(String args[]) {
        
        Animal a=new Animal();
        a.eat();
        Deer d= new Deer();
        d.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
} 
class Deer{
    void eat(){
        System.out.println("eats grass");
    }
}