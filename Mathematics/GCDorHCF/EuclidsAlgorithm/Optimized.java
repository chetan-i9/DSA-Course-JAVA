import java.util.Scanner;

class Optimized{
    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest Common Divisor of the given numbers is "+ gcd(a,b));
    }
}