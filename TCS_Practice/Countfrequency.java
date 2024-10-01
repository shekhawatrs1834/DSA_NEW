import java.util.*;

public class Countfrequency {
    public static void Frequency(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int i:map.keySet()){
            System.out.println("Freq of: "+i+":"+map.get(i));
        }
    }
    public static void InsertAtpos(int arr[],int pos,int value,int n){
		for(int i=n-2;i>=pos-1;i--){
			arr[i+1]=arr[i];
		}
		arr[pos-1]=value;
		
	}
    public static void main(String args[]){
        //int arr[]={1,5,9,2,1,4,2,3,5,1};
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter No. of Array elements: ");
        // int n=sc.nextInt();

        // int arr[]=new int[n];
        // System.out.println("Enter Array elements: ");
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // Frequency(arr, n);

        // int arr[]={8,7,1,6,5,9};                        //  sort 1st half inc 2nd half dec
        // int n=arr.length;
        // Arrays.sort(arr);
        // for(int i=0;i<n/2;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // for(int i=n-1;i>=n/2;i--){
        //     System.out.print(arr[i]+" ");
        // }

        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        float median=0;
        Arrays.sort(arr);
        if(n%2==0){
            median=(float)(arr[((n/2)-1)]+arr[(n/2)])/2;
            System.out.println(median);
        }else{
            System.out.println(arr[((n+1)/2)-1]);
        }

        // int arr[]={1,2,5,4,3,0};                         //insert at a soecific position in an array
		// int pos=4;
		// int n=arr.length;
		// int value=10;
		
		// for(int i=0;i<n;i++){
		// 	System.out.print(arr[i]+" ");
		// }
        // System.out.println();
		// InsertAtpos(arr,pos,value,n);

		// for(int i=0;i<n;i++){
		// 	System.out.print(arr[i]+" ");
		// }

    }
}

