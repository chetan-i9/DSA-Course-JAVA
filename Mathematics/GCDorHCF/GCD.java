import java.util.Scanner;
import java.lang.Math;
class GCD{
    static int gcd(int a,int b){
        int res=Math.min(a,b);
        while (res>0){
            if (((a % res) == 0) && ((b % res) == 0)){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest Common Divisor of the given numbers is "+ gcd(a,b));
    }
}