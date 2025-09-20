public class P1 {
    public static void main(String[] args) {
        int a = 24;
        System.out.print("Sequence A: ");
        while (a >= -6) {
            System.out.print(a + (a > -6 ? "|" : ""));
            a = a - 6;
        }
        
        int b = -10;
        System.out.print("\nSequence B: ");
        while (b <= 20) {
            System.out.print(b + (b < 20 ? "|" : ""));
            b = b + 5;
        }
    }
}