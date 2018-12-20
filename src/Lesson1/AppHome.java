package Lesson1;

/**
 * Created by Anna on 18.12.2018.
 */
public class AppHome {
    public static String runProgramLogic(String name) {
        return ("Я - " + name + " обязуюсь: \n"
                + "\t - прилежно комментировать свой код, \n"
                + "\t - не использовать goto, \n"
                + "\t - следить за состоянием потоков своих программ \n"
                + "\t - контролировать выделение памяти. \n"
                + "\n"
                + "Я обязуюсь не оставлять муссора в системе \n"
                + "и избегать однобуквенных переменных. \n"
                +"\t \t \t \t \t \t \t \t \t Ресет. \n");
    }
    public static void main (String [] args){
        String name = "<Анна>";
        System.out.println(runProgramLogic(name));
    }
}
