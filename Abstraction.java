public class Abstraction {
    /*public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        
        Chicken c= new Chicken();
        c.eat();
        c.walk();
    }
    
}

abstract class Animal{
    String color;

    Animal(){                     //constructor is used    //default property for all the child class objects
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();               //abstract method - only idea no implementation
}                                       //childs can implement acc. to their requirements

class Horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }*/

    public static void main(String args[]) {                  //multilevel inheritance using interface 
        Bear b=new Bear();
        b.eatflesh();
        b.eatgrass();
        
    }
}

interface Herbivore{                                    //multilevel inheritance using interface 
    void eatgrass();
}
interface Carnivore{                                        //multilevel inheritance using interface 
    void eatflesh();
}
class Bear implements Herbivore,Carnivore{
    public void eatgrass(){
        System.out.println("eats grass");
    }
    public void eatflesh(){
        System.out.println("eats flesh");
    }

}

