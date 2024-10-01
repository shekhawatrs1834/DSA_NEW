import java.util.*;
public class Revision01 {

    public static int Buyandsellstocks(int prices[]){
        int bp=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;

        for(int i=1;i<prices.length;i++){
            bp=Math.min(prices[i],bp);
            int sp=prices[i];
            if(sp>bp){
                int profit=sp-bp;
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
//     public static int Trappedrainwater(int height[]){
//         int n=height.length;
//         int leftmax[]=new int[n];
//         leftmax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftmax[i]=Math.max(height[i],leftmax[i-1]);
//         }

//         int rightmax[]=new int[n];
//         rightmax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightmax[i]=Math.max(height[i],rightmax[i+1]);
//         }

//         int Trappedwater=0;
//         for(int i=0;i<n;i++){
//             int waterlevel=Math.min(leftmax[i],rightmax[i]);
//             Trappedwater+=waterlevel-height[i];
//         }
//         return Trappedwater;
// }

    public static void main(String[] args) {
       
    // int height[]={4,2,0,6,3,2,5};
    
	// System.out.println(Trappedrainwater(height));
	
        int prices[]={7,1,5,3,6,4};
        System.out.println(Buyandsellstocks(prices));
    }
}

    

