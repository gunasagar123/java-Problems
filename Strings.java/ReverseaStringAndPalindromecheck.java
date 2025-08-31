public class ReverseaStringAndPalindromecheck {
    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed:"+rev);
        System.out.println("Palindrome?"+ str.equals(rev));
    }
}
