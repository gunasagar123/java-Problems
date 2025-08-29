// import java.util.*;
// public class GCD {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2 =sc.nextInt();


//         while(n1!=n2){
//             if(n1>n2){
//                 n1=n1-n2;
//             }else{
//                 n2=n2-n1;
//             }
//         }
//         System.out.println("GCD is : "+n2);
//     }
// }
class Main {
    public static void printGCD(int a ,int b) {
        int n=Math.min(a,b);
        int gcd=1;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("Gcd is: "+gcd);

    }
    public static void main(String[] args){
        printGCD(12,18);
    }
}