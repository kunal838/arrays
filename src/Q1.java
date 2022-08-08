//span of array
public class Q1 {
    public static void main(String[] args) throws Exception {
        int []arr = {2,54,3,3,2,34};
        System.out.println("span of array is "+ spanOfArray(arr));
       
      
     }
 
 
 
     public static int spanOfArray(int []arr){
         int max = arr[0],min=arr[0];
         for(int i=0;i<arr.length;i++){
          if(max<arr[i]){
              max=arr[i];
          }
         }
         for(int i=0;i<arr.length;i++){
         if(min>arr[i]){
              min=arr[i];
          }
         }
 
         return max-min;
  
 
     }
}
