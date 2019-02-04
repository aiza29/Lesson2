package Lesson3;

/**
 * Created by Anna on 25.12.2018.
 */
public class Home3 {
    public static void main(String[] args) {

        double[] party = new double[6];

        party[0] = 40_000.30;
        party[1] = 33_100.50;
        party[2] = 26_220.60;
        party[3] = 38_000.20;
        party[4] = 31_150.50;
        party[5] = 24_340.30;


        System.out.println("зарплата командира = " + party[0] + " рублей.");
        System.out.println("зарплата пилота = " + party[1] + " рублей.");
        System.out.println("зарплата инженера = " + party[2] + " рублей.");
        System.out.println("зарплата второго командира = " + party[3] + " рублей.");
        System.out.println("зарплата второго пилота = " + party[4] + " рублей.");
        System.out.println("зарплата второго командира = " + party[5] + " рублей.\n \n");
    }

    public static void calculate(double[] party) {
        for (int i = 0; i < party.length; i++) {
            party[i] = party[i] * 0.93;


            System.out.println("зарплата командира за вычетом 7% = " + party[0] + " рублей.");
            System.out.println("зарплата пилота за вычетом 7% = " + party[1] + " рублей.");
            System.out.println("зарплата инженера за вычетом 7% = " + party[2] + " рублей.");
            System.out.println("зарплата второго командира за вычетом 7% = " + party[3] + " рублей.");
            System.out.println("зарплата второго пилота за вычетом 7% = " + party[4] + " рублей.");
            System.out.println("зарплата второго командира за вычетом 7% = " + party[5] + " рублей.");
        }
    }


// С комментариями я опаздала по времени, все давно решили эту задачу:) Р.S. Метод изменяет исходный массив)

}