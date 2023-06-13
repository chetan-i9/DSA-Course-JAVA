import java.util.Scanner;
class EfficientSol{
    static int countZeroes(int num){
        int res=0;
        for (int i=5;i<=num;i++){
            res=res+(num/i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Number of Trailing Zeroes in factorial of a given Number " + countZeroes(num));
    }
}