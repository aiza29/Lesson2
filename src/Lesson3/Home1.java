package Lesson3;

/**
 * Created by Anna on 22.12.2018.
 */
public class Home1 {
    public static void main(String[] args) {
        System.out.println(toUsd(53,1.6469));
    }
    public static double toUsd(int rub, double course){
        double dol = rub*course;
        return dol;
    }
}
