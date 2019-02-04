package Lesson3;

/**
 * Created by Anna on 26.12.2018.
 */
public class Home4 {
    public static void main(String[] args) {
        String[] gemers = {"Gleb", "Boris", "Ivan", "Egor"};
        String[] horseNames = {"Pegas", "Alfa", "Legenda", "Shanhai"};
        String[] selectHorses = {"Alfa", "Legenda", "Shanhai", "Pegas"};
    }

    public static void payout(String[] horseNames, String[] gemers, String[] selectHorses) {
        int[] sums = {300_000, 200_000, 1_500_000, 600_000};

        for (int i = 0; i < gemers.length; i++) {
            System.out.print(gemers[i] + " сделал ставку на лошадь по кличке ");
            System.out.print(selectHorses[i] + " сумма выйграша сосавляет ");
            System.out.println(sums[i] * (i * 0.66 + 1) + " руб.");
        }
    }

}
