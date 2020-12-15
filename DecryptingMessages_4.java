import java.util.Scanner;

public class DecryptingMessages_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String sumMessages = " ";

        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            int value = input + key;

            char message = (char)value;
            sumMessages += message;
        }
        System.out.println(sumMessages);
    }
}
