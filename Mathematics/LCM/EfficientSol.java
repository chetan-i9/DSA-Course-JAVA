import java.util.Scanner;
class EfficientSol{
    static int gcd (int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Least Common Multiple of the given numbers is "+ lcm(a,b));
    }
}