public class Compare {
    public static void main(String[] args) {
        //compare
        String name1="Tony";
        String name2 ="Tony"; 
        //1 s1 > s2: +ve value
        //2. s1 == s2 :0
        //3 s1 < s2 :-ve value

        // Gives correct answer here
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //Gives incorrect answer here
        if(new String("Tony")== new String ("Tony")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
    
}
