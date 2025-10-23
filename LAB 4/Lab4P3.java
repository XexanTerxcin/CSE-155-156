import java.util.Scanner;

public class Lab4P3 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        int N = x.nextInt();
        int num = 2;
        int count = 0;
        while(count < N){
            boolean isPrime = true;
            for(int i=2; i<num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
