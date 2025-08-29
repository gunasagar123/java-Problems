
import java.util.Arrays;



/*public class maxnumber {
    public static void main(String[] args) {
        int numbers[] ={2,5,1,9,6};
        int max = Arrays.stream(numbers)
        .max()
        .orElseThrow();

        System.out.println("Maximun nuber : "+max);

        
    }
    
    
}*/
public class maxnumber {
    public static void main(String[] args) {
        int[] numbers={2,5,1,9,6};
        int max = numbers[0];
        int maxIndex =0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Array: " +Arrays.toString(numbers));
        System.out.println("Maximum number:"+max);
        System.out.println(maxIndex);

    }
}
