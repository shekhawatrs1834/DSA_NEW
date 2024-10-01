import java.util.*;
public class ArraylistOperations {
   /* public static void main(String[] args) {
        
    
    ArrayList<Integer> list=new ArrayList<>();
    //add

    list.add(2);
    list.add(1,4);
    list.add(6);
    list.add(8);
   // System.out.println(list);

    //get
    //System.out.println(list.get(2));

    //remove
    //list.remove(3);
    //System.out.println(list);

    //set element at index
    //list.set(2,10);
    //System.out.println(list);

    //contains element
    //System.out.println(list.contains(4));
    //System.out.println(list.contains(11));

    //size
   // System.out.println(list.size());

   //reverse an arraylist

   /*for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
   }*/

   //maximum element
   /*int max=Integer.MIN_VALUE;
   for(int i=1;i<list.size();i++){
       /* if(max<list.get(i)){
            max=list.get(i);
        }/
        max=Math.max(max,list.get(i));
        
   }
   System.out.println(max);

   //swap 2 numbers
   int indx1=1;
   int indx2=3;
   System.out.println(list);
   Swap(list,indx1,indx2);
   System.out.println(list);
}
   public static void Swap(ArrayList<Integer> list,int indx1,int indx2){
    int temp=list.get(indx1);
    list.set(indx1,list.get(indx2));
    list.set(indx2,temp);
   }

}*/


public static void main(String[] args) {
     // ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();         //2D array implementation
     // ArrayList<Integer> list1=new ArrayList<>();
     // ArrayList<Integer> list2=new ArrayList<>();                       
     // ArrayList<Integer> list3=new ArrayList<>();

     // for(int i=1;i<=5;i++){                     //adding elements in singular arraylists
     //      list1.add(i*1);  
     //      list2.add(i*2);          
     //      list3.add(i*3);
     // }

     // mainlist.add(list1);                      //add singular arraylist to main list
     // mainlist.add(list2);        
     // mainlist.add(list3);

     // for(int i=0;i<mainlist.size();i++){                    
     //      ArrayList<Integer> currlist=mainlist.get(i);       //this temporary arraylist to store the element from mainlist(that are actually lists)
     //      for(int j=0;j<currlist.size();j++){
     //           System.out.print(currlist.get(j)+" ");
     //      }
     //      System.out.println();
     // }

     
     // ArrayList<Integer> height=new ArrayList<>();
    
     // height.add(1);
     // height.add(8);
     // height.add(6);
     // height.add(2);
     // height.add(5);
     // height.add(4);
     // height.add(8);
     // height.add(3);
     // height.add(7);
     // System.out.println(ContainerMostWater(height));


     // ArrayList<Integer> list=new ArrayList<>();            //array should be sorted in pairsum problem
    
     // list.add(1);
     // list.add(2);
     // list.add(4);
     // list.add(6);
     // list.add(7);
     // list.add(10);
     // int target=6;
     // System.out.println(isPairsum(list, target));

     ArrayList<Integer> list=new ArrayList<>();            //sorted and rotated array
    
     list.add(11);
     list.add(15);
     list.add(6);
     list.add(8);
     list.add(9);
     list.add(10);
     int target=16;
     System.out.println(isPairsum2(list, target));
}
//public static int ContainerMostWater(ArrayList<Integer> height){          //bruteforce approach    // TC- O(n^2)
     // int maxwater=0;   //for finding minimum water make it equal to infinity and use math.min in place of math.max
     // for(int i=0;i<height.size();i++){
     //      for(int j=i+1;j<height.size();j++){
     //           int ht=Math.min(height.get(i),height.get(j));
     //           int width=j-i;
     //           int currwater=ht*width;
     //            maxwater=Math.max(maxwater,currwater);
     //      }
          
     // }
     
     // return maxwater;

     //int maxwater=Integer.MAX_VALUE;   for min water
     // int maxwater=0;                              // TC- O(n)
     // int Lh=0;
     // int Rh=height.size()-1;

     // while(Lh<Rh){
          
     //      int ht=Math.min(height.get(Lh),height.get(Rh));
     //      int width=Rh-Lh;
     //      int currwater=ht*width;
     //      maxwater=Math.max(maxwater,currwater);                     //for minimum make it math.min

     //      if(height.get(Lh)<height.get(Rh)){
     //           Lh++;
     //      }else{
     //           Rh--;
     //      }


     //      // if(height.get(Lh)<height.get(Rh)){               //to calculate minimum water
     //      //      Rh--;
     //      // }else{
     //      //      Lh++;
     //      // }
     // }
     // return maxwater;

     
     


     // public static boolean isPairsum( ArrayList<Integer> list,int target){                    ///O(n)
     //      int p1=0;
     //      int p2=list.size()-1;

     //      while(p1<p2){
               
     //           if(list.get(p1)+list.get(p2)==target){
     //                return true;
     //           }
               
     //           if((list.get(p1)+list.get(p2))<target){
     //                p1++;
     //           }
     //           else{
     //                p2--;
     //           }
     //      }
     //      return false;
     // }

     public static boolean isPairsum2(ArrayList<Integer> list,int target){      //sorted and rotated array search
          int bp=-1;         //breaking point
          int n=list.size();
           for(int i=0;i<n;i++){
               if(list.get(i)>list.get(i+1)){
                    bp=i;
                    break;
               }
           }

           int rp=bp;
           int lp=bp+1;

           while(lp!=rp){
               if(list.get(lp)+list.get(rp)==target){
                    return true;
               }
               if(list.get(lp)+list.get(rp)<target){
                    lp=(lp+1)%n;
               }else{
                    rp=(n+rp-1)%n;
               }
           }
           return false;
     }
}




