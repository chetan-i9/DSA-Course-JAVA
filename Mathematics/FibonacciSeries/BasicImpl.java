import java.util.Scanner;
class BasicImpl{
    static void fibboSeries(int num){
        int n1=0;
        int n2=1;
        int count=0;
        int sum=0;
        if (num<=0){
            System.out.println("Invalid.");
        }
        else if (num==1){
            System.out.print(n1+" ");
        }
        else {
            while (count<num){
                System.out.print(n1+ " ");
                sum=n1+n2;
                n1=n2;
                n2=sum;
                count+=1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num= sc.nextInt();
        System.out.print("Fibonacci Series : ");
        fibboSeries(num);
    }
}