public class TrappingRainWater3 {
    public static int trappedwater(int arr[]){
        int n=arr.length;
        // 
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++ ){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        // rigth max

        int rightmax[]=new int [n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int height=Math.min(leftmax[i],rightmax[i]);
            int width=1;// given
            int waterlevel=height-arr[i];
            trappedwater+=waterlevel*width;
        }
        return trappedwater;

    }
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trappedwater(arr));

    }
    
}
