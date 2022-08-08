public class Q2 {
    public static void main(String[] args) {
        int []arr ={10,20,30,40,50};
        int tar = 60;
        if(findindex(arr,tar)==-1){
            System.out.println("counld not find the position");
        }else 
        {
            System.out.println(findindex(arr, tar)+" is the index");
        }

    }
    public static int findindex(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
                
            }

        }
        return -1;
    }
}
