import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("Excelent");
        }
        else if(score >= 80){
            System.out.println("Great");
        }
        else if(score >= 70){
            System.out.println("Good");
        }
        else if(score >= 50){
            System.out.println("Not Bad");
        }
        else if(score <= 49){
            System.out.println("You Failed");
        }
        else{
            System.out.println("Error !!!");
        }
    }
}
