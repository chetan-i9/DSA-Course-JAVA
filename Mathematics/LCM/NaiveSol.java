import java.util.Scanner;
import java.lang.Math;
class NaiveSol{
    static int lcm(int a,int b){
        int res=Math.max(a,b);
        while (true){
            if (res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Least Common Multiple of the given numbers is "+ lcm(a,b));
    }
}