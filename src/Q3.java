//merge sort
public class Q3 {
    public static void printarr(int[] intArray){
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
            
        }
    }
    public static void mergesort(int[] arr){
       int []a1 = merge(arr, 0,arr.length-1);
        printarr(a1);

    }
    public static int[] merge(int arr[],int start,int end){
        if(start==end){
            int []ba = new int[1];
            ba[0]=arr[start];
            return ba;

        }
       int mid = (end+start)/2;
     int fsa[]=  merge(arr,start, mid);
     int ssa[]=  merge(arr,mid+1, end);
        int sortedArray[] = mergeTwoSortedArray(fsa, ssa) ;
        return sortedArray;

    }
    public static void main(String[] args) {
        int a1[]={10,5,20,6,90,67};
        mergesort(a1);
        
     
        
    }
  public static int[] mergeTwoSortedArray(int []a1,int[] a2){
    int a= a1.length;
    int b = a2.length;
    int arr[] = new int[a+b];
    int i=0;
    int j=0;
    int k=0;
    while(i<a1.length&&j<a2.length){
        
        if(a1[i]<a2[j]){
            arr[k]=a1[i];
            i++;
            k++;
        }else{
            arr[k]=a2[j];
            j++;
            k++;
        }

        

    }
    while(i<a1.length){
        arr[k]=a1[i];
        i++;
        k++;

    }

    while(j<a2.length){
        arr[k]=a2[j];
        j++;
        k++;
    }

        
    return arr;



    }
}
