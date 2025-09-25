import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stops = sc.nextInt();
        int currentCapacity = 0;
        int maxCapacity = 0;

        for (int i = 0; i < stops; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            currentCapacity = currentCapacity - exit + enter;
            if (currentCapacity > maxCapacity) {
                maxCapacity = currentCapacity;
            }
        }
        sc.close();
        System.out.println(maxCapacity);
    }
}