public class strings {
   /*public static boolean isPalindrome(String str){         //string is plaindrome or not
        int n=str.length();
        for(int i=0;i<=n/2;i++){                           //divide the string into 2 parts keep comparing from 1st and last
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }                                             //Time complexity= O(n)
        }
        return true;
    }
    public static void main(String args[]){
        String str="Ravinder";
        System.out.print(isPalindrome(str));

    }
    */
    /*public static float getShortestpath(String path){
        int x=0;
        int y=0;
        int n=path.length();
        for(int i=0;i<n;i++){
            char dir=path.charAt(i);
            //for south
            if(dir=='S'){
                y--;
            }
            //for north
            else if(dir=='N'){
                y++;                           //we get all the values of x and y
            }
            //for east
            else if(dir=='E'){
                x++;
            }
            //for west
            else{
            x--;
            }
            
        }
        //calculate the distance
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.print(getShortestpath(path));
}
}*/

/*public static void main(String args[]){               //to find the largest word in string (in terms of lexicograpgical order)
    String fruits[]={"apple","mango","banana"};
    String largest=fruits[0];               //we assumed the first one to be largest
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
        }
    }
    System.out.println(largest);
}
}*/
/* 
public static String ToUppercase(String str1){                //to convert 1st letter of each word to capital of a given string 
    StringBuilder sb=new StringBuilder("");                //form a empty string builder
    char ch=Character.toUpperCase(str1.charAt(0));                //convert 1st letter to uppercase
    sb.append(ch);                                              //append the capitalize letter in the StringBuilder
    for(int i=1;i<str1.length();i++){                            //run aloop for the rest
        if(str1.charAt(i)==' ' && i<str1.length()-1){             //if we find any empty space we will append it to string builder then increment this we get out 1st letter of next word we will capitalize and then append it to string builder
            sb.append(str1.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str1.charAt(i)));
        }
        else{                                                  //for rest of the letters we directly append in the string builder
            sb.append(str1.charAt(i));
        }
    }
    return sb.toString();                                     //convert stringbuilder to string form
}
public static void main(String args[]){
    String str1="hii, i am ravinder singh shekhawat";
    System.out.println(ToUppercase(str1));
}
}*/

public static String Compress(String str){                //compress given string
    String str1="";
    for(int i=0;i<str.length();i++){
        Integer count=1;                                      //selecting 1st element hence count initially is one
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){             //check condition if the next element is equal to previous one also i should be less than n-1 because we are comparing it with next term so we cant take it equal to n-1 as it will give compile error it should be less than n-1
            count++;
            i++;
        }
        str1+=str.charAt(i);                         //we will write the character in the new string
        if(count>1){                                 //check if the element is repeating or not
            str1+=count.toString();                   //store the number(no. of times repeating) in the new string after converting it to string
        }
    }
    return str1;
}
public static void main(String args[]) {
    String str= "aaabbcccdd";
    System.out.println(Compress(str));
}
}
