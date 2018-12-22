package Lesson2;

/**
 * Created by Anna on 19.12.2018.
 */
public class MainApp {
    public static void main(String args[]) {
        Printer printer = new Printer();
        printer.printString();

    }
}
class Printer {
    public void printString(){
        System.out.println("Viva La Java!");
    }
}