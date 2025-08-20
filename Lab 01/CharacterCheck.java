import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = x.next().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a consonant");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        }
        else {
            System.out.println(ch + " is a special character");
        }
        
    }
}