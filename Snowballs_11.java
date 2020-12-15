import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bestSnowballValue = -1.0;
        int bestSnowballSnow = 0;
        int bestSnowTime = 0;
        int bestSnowballQuality = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow * 1.0/snowballTime ),snowballQuality);

            if (bestSnowballValue < snowballValue ){
                bestSnowballValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }
        }
        System.out.println(String.format("%d : %d = %.0f (%d)",bestSnowballSnow,bestSnowTime ,
                bestSnowballValue,bestSnowballQuality ));
    }
}
