import java.util.Scanner;
public class Problem6_SportsTournamentQualifier {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Match won : ");
        int w = x.nextInt();
        System.out.println("Match draw : ");
        int d = x.nextInt();
        System.out.println("Match lost : ");
        int l = x.nextInt();

        if (w >= 5) {
            System.out.println("Qualified");
        } 
        else if (w == 4) {
            if (d >= 2) {
                System.out.println("Qualified");
            }
            else {
                System.out.println( "Not qualified");
            }
        }
        else if (w == 3) {
            if (d >= 3) {
                System.out.println("Playoffs");
            } else {
                System.out.println("Not qualified");
            }
        }
        else {
            System.out.println("Not qualified");
        }
    }
}