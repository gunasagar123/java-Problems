
import java.util.Arrays;



/*public class SumofmultidemsionalArray {
    public static void main(String[] args) {
        int [][] numbers={{1,8,4},{9,7,2},{7,6,4}};
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++) {
                sum +=numbers[i][j];
                
            }

            System.out.println("Sum is :"+sum);
        }
        
    }
    
}*/
public class  SumofmultidemsionalArray{
    public static void main(String[] args) {
        int [][] numbers ={{1,8,4},{9,7,2},{7,6,4}};
    int sum = Arrays.stream(numbers)
.flatMapToInt(Arrays::stream )
.sum();
System.out.println("Sum is"+sum);;
   }
}
