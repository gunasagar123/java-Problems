// public class Problems {//Write a java program to count the number of characters in a string
//        public static void main(String[] args){
//        String txt ="java is super";
//        int count =txt.length();
//        System.out.println(count);
//    }
// }


//Write a java program to count the number of words in a string
public class Problems {
    public static void main(String[] args) {
        String txt = "java is super";
        //split the string by spaces
        String[] words = txt.trim().split("\\s+");
        int count = words.length;
        System.out.println(count);
    }
}

