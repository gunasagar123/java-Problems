
/*import java.util.Arrays;

public class averageIntegersofArray {
    public static void main(String[] args) {
        int [] numbers ={2,5,3,9,};
        int sum =0;
        for(int num : numbers){
            sum += num;
        }
        double average =(double) sum/numbers.length;
        System.out.println("Average using loop :" +average);

        
    }
    
}*/
//using javaStreams
import java.util.Arrays;
class averageIntegersofArray{
    public static void main(String[] args) {
        int[] numbers ={2,5,3,9};
        double average =Arrays.stream(numbers)
                              .average()
                              .orElse(0.0);
        System.out.println("Average using stream:" +average);
    }
}