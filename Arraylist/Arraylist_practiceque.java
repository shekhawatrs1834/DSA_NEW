import java.util.*;
public class Arraylist_practiceque {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(15);
        list.add(20);

        //System.out.println(ismonotone(list));
        System.out.println(Lonely(list));
    }

    // public static boolean ismonotone(ArrayList<Integer> list){
    //     boolean increasing=true;
    //     boolean decreasing=true;
    //     for(int i=0;i<list.size()-1;i++){
    //         if(list.get(i)<list.get(i+1)){
    //             decreasing=false;
    //         }else{
    //             increasing=false;
    //         }
            
    //     }
    //     return increasing||decreasing;
    // }

    public static ArrayList<Integer> Lonely(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> list1=new ArrayList<>();

        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)+1<list.get(i) && list.get(i)+1<list.get(i+1)){
                list1.add(list.get(i));
            }
        }
        if(list.size()==1){
            list1.add(list.get(0));
        }
        if(list.get(0)+1<list.get(1)){
            list1.add(list.get(0));
        }
        if(list.get(list.size()-2)+1<list.get(list.size()-1)){
            list1.add(list.get(list.size()-1));
        }
        return list1;
    }
   
}
