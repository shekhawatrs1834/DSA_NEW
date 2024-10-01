import java.util.*;
public class RevisionAug {

    /*public static boolean isPrime(int n){
        if(n==2){
            System.out.println("it is a prime number");
        }
        
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            } 
        }
    }
        return true;
    }*/
        
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in); 
        /*int n=sc.nextInt();
        System.out.println(isPrime(n));*/
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }*/

        
       /* for(int i=1;i<=4;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
                
            }
            System.out.println();
        }*/

        /*int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

         /*int n=101;
         bintodec(n);
        
       
    }
    public static void bintodec(int n){
        int pow=0;
        int dc=0;
            while(n>0){
                int lastdigit=n%10;
                dc=dc+(lastdigit*(int)Math.pow(2,pow));
                pow++;
                n/=10;

            }
            System.out.println(dc);
        }*/

       /*  int marks[]={97,98,95};
        update(marks);
         for(int i=0;i<marks.length;i++){
                System.out.print(marks[i]+" ");                //array call by reference
            }
    }
        public static void update(int marks[]){
            for(int i=0;i<marks.length;i++){
                marks[i]=marks[i]+1;
                
            }*/
           
            /*String menu[]={"dosa","dhokla","samosa","kachori","momos"};
            String key="dhokla";
            int index=Linearsearch(menu, key);
            if(index==-1){
                System.out.println("not found");                                   //linear search
            }
            else
            System.out.println("found at index: "+index);

        }
        public static int Linearsearch(String menu[],String key){
            for(int i=0;i<menu.length;i++){
                if(menu[i]==key){
                    return i;
                }
            }
            return -1;
        }*/
        /*int numbers[]={1,4,3,6,7,2};
        System.out.println(getLargest(numbers));
    }
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
               
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
         return largest;
    }*/

    /*int numbers[]={2,4,5,7,9,0};
    int key=7;
    System.out.println(binarySearch(numbers,key));
    
}
public static int binarySearch(int numbers[],int key){
    int start=0;
    int end=numbers.length-1;
     for(int i=start;i<=end;i++){
        int mid=(start+end)/2;

        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
     }
     return -1;
}*/
    /*int numbers[]={1,2,3,4,5};
    reverse(numbers);
    for(int i=0;i<=numbers.length-1;i++){
        System.out.print(numbers[i]+" ");
    }

}
public static void reverse(int numbers[]){                //reverse an array
    int start=0;
    int end=numbers.length-1;
    while(start<=end){
        int temp=numbers[end];
        numbers[end]=numbers[start];
        numbers[start]=temp;
        start++;
        end--;
    }*/

   
       /*  int numbers[]={2,4,6,8,10};
        totalpairs(numbers);
}
 

    public static void totalpairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+tp);
    }*/
    /*int numbers[]={2,4,6,8,10};
    subarraysmaxsum(numbers);
}

    
    public static void subarraysmaxsum(int numbers[]){
        
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
              int end=j;
              currsum=0;
              for(int k=start;k<=end;k++){
                currsum=currsum+numbers[k];
                 
              }
              if(currsum>maxsum){
                 maxsum=currsum;
                }
              System.out.println(currsum);
              
              
            }
            
        }
       
       System.out.println("max sum "+maxsum);
        
    }*/
    /*int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    kadane(numbers);
}

    public static void kadane(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=(int)Math.max(cs,ms);
        }
        System.out.println(ms);
    }*/
    /*Student s1= new Student();
    s1.name="Ravinder";
    s1.rollno=33;
    s1.marks[0]=100;
    s1.marks[1]=95;
    s1.marks[2]=98;
    
    Student s2=new Student(s1);
    s1.marks[1]=100;
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }

   

}
}
    class Student{
        String name;
        int rollno;
        int marks[];

        Student(){
            marks=new int[3];
            System.out.println("constructor is called");
        }

        /*Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.rollno=s1.rollno;               //shallow copy
            this.marks=s1.marks;
            
        }*/
        /*Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.rollno=s1.rollno;                        //deep copy
            for(int i=0;i<marks.length;--i){
                this.marks[i]=s1.marks[i];
            }
        }*/



    } }
 



