public class OOP {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Ravinder";
        s1.roll=5733;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=95;
        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[1]=100;                           //suppose after copying the properties of obj1 to obj 2 we make a small change in the marks of s1, but still (after copying) the chnage is reflected in the output. so this is a big problem that the change is still reflected in the s2 even if we are not copying it again in s2.
        for(int i=0;i<3;i++){                     //because in case of array(marks) we are not copying the array but we are taking its reference in the s2, so when we change the array in s1 it will be automatically chnaged in s2.
            System.out.println(s2.marks[i]);
        }

    }
}  

class Student{
   String name;
   int roll;
   String password;
   int marks[];      //array declaration
   

   Student(Student s1){  //shallow copy constructor (we are copying the properties of object s1 to object s2)
    marks=new int[3];    //to initialize/allocate memory to an array we use new keyword
    this.name=s1.name;
    this.roll=s1.roll;                    //shallow copy- chnages reflects- only refernces of the objects are copied not the complete object
    this.marks=s1.marks;
    /*Student(Student s1){               //deep copy- chnages do not reflect as even after changing marks in s1 after copying their is no chnage in s2
      marks=new int[3];  
      this.name=s1.name;
      this.roll=s1.roll;
      for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
      }
    }*/
  }
   
   Student(){
    marks=new int[3];
    System.out.println("constructor is called");
   }


}

