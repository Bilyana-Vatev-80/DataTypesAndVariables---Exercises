import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int countPokePower = pokePower;
        int targetsCount = 0;

        while (countPokePower >= distance ){
            countPokePower -= distance;
            targetsCount ++;
            if(countPokePower == pokePower / 2.0 && exhaustionFactor != 0){
                countPokePower = countPokePower / exhaustionFactor;
            }
        }
        System.out.println(countPokePower);
        System.out.println(targetsCount);

    }
}
