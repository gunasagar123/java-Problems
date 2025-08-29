public class minnumber {
    public static void main(String[] args) {
        String words[]={ "coffee","water","chai","diet coke"};
        String minword = words[0];
        int minIndex=0;
        for(int i=1;i<words.length;i++){
            if(words[i].length() <minword.length()){
                minword =words[i];
                minIndex=i;
            }
        }
        System.out.println("value:"+minword+" & index: "+minIndex);
    }
    
}
