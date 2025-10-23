public class Problem1 {
    public static void main(String[] args) {
        int x = 24;
        int y = -10;

        System.out.print("a) ");
        while (x >= -6) { 
            System.out.print(x);

            if (x == -6) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }

            x = x-6;
        }
        
        System.out.println(" ");
        System.out.print("b) ");

        while (y <= 20) {
            System.out.print(y);

            if (y == 20) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }

            y = y+5;
        }
    }
}