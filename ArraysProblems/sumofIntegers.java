
import java.util.Arrays;


/*public class sumofIntegers {
    public static void main(String[] args) {
        
    int [] marks={2,5,1,9,6};
    int sum=0;
    for(int num : marks){
        sum +=num;
    }
    System.out.println("Sum = " +sum);
}
}*/
//using  JavaStreams
public class sumofIntegers {
    public static void main(String[] args) {
        int[]  numbers ={1,8,4};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum is " +sum);

    }
}
