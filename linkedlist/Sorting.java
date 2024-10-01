public class Sorting {

    public static void Mergesort(int a[],int l,int r){
        
        if(l<r){
            int mid=(l+r)/2;
            Mergesort(a,l,mid);
            Mergesort(a,mid+1,r);
            Merge(a,mid,l,r);

        }
    }

    public static void Merge(int a[],int mid,int l,int r){
        int temp[]=new int[r-l+1];
        int i=l;      //iterator for left part
        int j=mid+1;   //iterator for right part
        int k=0;         //iterator for new arr-->temp

        while(i<=mid && j<=r ){
            if(a[i]<a[j]){
                temp[k]=a[i];
                i++;
            }
            else{
                temp[k]=a[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=a[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k]=a[j];
            j++;
            k++;
        }

        for(k=0,i=l;k<temp.length;k++,i++){
            a[i]=temp[k];
        }

    }
    public static void Print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }

    //quick sort
    public static int Partition(int a[],int lb,int ub){
        int v=a[lb];
        int p=lb;
        int q=ub;

        while(p<q){
            while(v>=a[p]&&p<ub){
                p++;
            }
            while(v<a[q]){
                q--;
            } 
            if(p<q){
                int temp=a[p];
                a[p]=a[q];
                a[q]=temp;
            }
            
        }
        int temp=a[q];
        a[q]=a[lb];
        a[lb]=temp;
        return q;
    }

    public static void QuickSort(int a[],int lb,int ub){
        if(lb<ub){
            int loc=Partition(a,lb,ub);
            QuickSort(a, lb,loc-1);
            QuickSort(a, loc+1, ub);
        }
    }
    public static void main(String[] args) {
        int a[]={6,3,9,5,2,8};
        //Mergesort(a,0,a.length-1);
        QuickSort(a, 0, a.length-1);
        Print(a); 
    }
}
