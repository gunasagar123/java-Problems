
import java.util.Arrays;


/*import java.util.Arrays;

public class MergetwoArrays {
    public static void main(String[] args) {
        String [][] drinks={{"chai","coffee"},{"milk","water","coke"}};
        String[] merged = Arrays.stream(drinks)
                             .flatMap(Arrays::stream)
                             .toArray(String[]:: new);
        System.out.println(Arrays.toString(merged));
    }
    
}
*/
// another method using for loop
public class MergedtwoArrays {
    public static void main(String[] args) {
        String[][] drinks = {{"chai","coffee"},{"milk","water","coke"}};
         //to find the total number of elements
         int totalLength =0;
         for(String[] row :drinks){
            totalLength += row.length;
         }
         //create a 1d array of that size

         String[] merged = new String[totalLength];
         //coping elements using nested loops
         int index=0;
         for(String[] row:drinks){
            for(String drink :row){
                merged[index++]=drink;
            }
         }
         System.out.println(Arrays.toString(merged));


    }
}