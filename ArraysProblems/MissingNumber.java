public class MissingNumber {
    public static void main(String[] args) {
        int arr[] ={ 1,2,4,5};
        int n=5;
        int expectedSum = n*(n+1)/2;
        int actualsum=0;
        for(int num:arr) actualsum +=num;
        System.out.println("Missing number: "+(expectedSum - actualsum));
    }
    
}
