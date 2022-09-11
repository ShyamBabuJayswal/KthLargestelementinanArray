public class UsingQuickSelectAlgo {
    public static int Kthlargest(int[] arr,int k, int low, int high){
        int pivotpoint= getPivotPoint(arr,low,high);
        if(pivotpoint == k-1){
            return arr[pivotpoint];
        }
        else if(pivotpoint < k-1){
            return  Kthlargest(arr,k,pivotpoint+1,high);
        }
        else{
            return Kthlargest(arr,k,low,pivotpoint-1);
        }

    }

    public static int getPivotPoint(int[] arr,int low,int high){//for pivotpoint, low=O index ,high=arr.length-1
     int pivotelement=arr[high];
     int pivotpoint=low;
     for(int i=low;i<high;i++){
         if(arr[i]<pivotelement){
             int temp=arr[i];
             arr[i]=arr[pivotpoint];
             arr[pivotpoint]=temp;
         }
         int temp=arr[pivotpoint];
         arr[pivotpoint]=arr[high];
         arr[high]=temp;
     }
     return pivotpoint;
    }
}
