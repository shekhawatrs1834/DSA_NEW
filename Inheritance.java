public class Inheritance {
    public static void main(String args[]){
        fish shark=new fish();
        //shark.eat();
        //dog dobby=new dog();
        //dobby.eat();
        //dobby.legs=4;
        //System.out.println(dobby.legs);
        Bird sparrow=new Bird();      //Hierarical inhertance
        sparrow.eat();
        shark.size=10;                //Hierarical inhertance
        System.out.println(shark.size);


    }
    
}
class Animal{                                      //single level inheritance- single base class
    String color;
    int size;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
         System.out.println("breaths");
    }
}

//class fish extends Animal{      //extends is used to inherit property from parent class
    //int fins;

   // void swim(){
       // System.out.println("swims");
    //}

//}

//class Mammal extends Animal{               //Multilevel inheritance
  //  int legs;
//}

//class dog extends Mammal{                  //Multilevel inheritance
  //  String breed; 
//}

class Mammal extends Animal{                  //Hierarical inhertance
    void walk(){
        System.out.println("walks");
    }
}
class fish extends Animal{                    //Hierarical inhertance
    void swim(){
       System.out.println("swims"); 
    }
}
class Bird extends Animal{                    //Hierarical inhertance
    void fly(){
       System.out.println("fly"); 
    }
}
