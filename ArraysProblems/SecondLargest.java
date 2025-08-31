import java.util.*;
public class SecondLargest{
    public static void main(String[] args) {
        int [] arr ={10,20,5,8,70};
        Arrays.sort(arr);
        System.out.println("2nd Largest : "+ arr[arr.length -2]);
    }
}
