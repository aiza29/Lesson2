package Lesson4.Home1;

/**
 * Created by Anna on 16.01.2019.
 */
public class Astronaut {
    public static void main(String[] args) {
        String[] crew = {"Komandir", "Pilot", "Ingener", "Second Komandir", "Second Pilot", "Second Ingener"};
        int[] growth = {168, 174, 178, 167, 175, 168};
        int[] growthSitting = {82, 86, 84, 80, 88, 82};
        int[] weight = {67, 63, 74, 62, 75, 65};
        int[] hip = {32, 34, 28, 36, 35, 31};
        int[] shoulder = {46, 48, 44, 42, 46, 40};
        int[] chest = {46, 48, 44, 42, 46, 40};
        int[] leg = {26, 28, 26, 28, 26, 28};

        for(int i=0; i <  crew.length; i++) {
            System.out.println(crew[i] + " корабля, мерки для изготовления скафандра 'Сокол КВ-2'и посадочных кресел 'Союз-МС':");
            System.out.println("Рост в положении стоя - " + growth[i] + " см.");
            System.out.println("Рост в положении сидя - "+ growthSitting[i] + " см.");
            System.out.println("Вес - " + weight[i]+" кг.");
            System.out.println("Ширина бедер в положении сидя - " + hip[i]+" см.");
            System.out.println("Поперечный размер плечевой области - " + shoulder[i]+" см.");
            System.out.println("Обхват груди - " + chest[i]+" см.");
            System.out.println("Длина ступни - " + leg[i]+" см."+ "\n\n");
        }
    }

}
