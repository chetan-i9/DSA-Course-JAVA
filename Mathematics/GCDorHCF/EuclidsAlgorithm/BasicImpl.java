import java.util.Scanner;
class BasicImpl{
    static int gcd(int a, int b){
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            else {
                b=b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest Common Divisor of the given numbers is "+ gcd(a,b));
    }
}