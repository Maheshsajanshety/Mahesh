package Arrays1D2D;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,5,6,2,3,7};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max1=Math.max(max1, arr[i]);
        }
        for(int num:arr){
            if(num!=max1){
                max2=Math.max(max2, num);
            }
        }
        if(max2==Integer.MIN_VALUE){
            System.out.println("No second largest element in an arrsy");
        }else{
            System.out.println("it is the Second larget element in an array is :"+max2);
        }
    }
}
