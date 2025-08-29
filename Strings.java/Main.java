class Main{
public static void main(String[] args){
//concatenation
String firstname ="Tony";
String lastname ="stark";
String fullName =firstname +  lastname;
System.out.println(fullName.length());

//charAt
for(int i=0; i<fullName.length();i++){
    System.out.println(fullName.charAt(i));
}
}
}