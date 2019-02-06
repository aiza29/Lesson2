package Lesson4.Home1;

/**
 * Created by Anna on 16.01.2019.
 */
public class Main  {

    public static void main(String[] args) {

        Astronaut Astronaut1 = new Astronaut();
        Astronaut1.setPosition("Командир");
        Astronaut1.setName("Иванов С. М.");
        Astronaut1.setGender("муж.");
        Astronaut1.setNationality("русский");
        Astronaut1.setEducation("высшее");
        Astronaut1.setGrowth(180);
        Astronaut1.setWeght(78);
        Astronaut1.setAge(35);

        Astronaut Astronaut2 = new Astronaut();
        Astronaut2.setPosition("Второй пилот");
        Astronaut2.setName("Петров И. М.");
        Astronaut2.setGender("муж.");
        Astronaut2.setNationality("русский");
        Astronaut2.setEducation("высшее");
        Astronaut2.setGrowth(174);
        Astronaut2.setWeght(75);
        Astronaut2.setAge(33);

        Astronaut Astronaut3 = new Astronaut();
        Astronaut3.setPosition("Инженер");
        Astronaut3.setName("Салихов М. К.");
        Astronaut3.setGender("муж.");
        Astronaut3.setNationality("татарин");
        Astronaut3.setEducation("высшее");
        Astronaut3.setGrowth(171);
        Astronaut3.setWeght(67);
        Astronaut3.setAge(31);

        Astronaut Astronaut4 = new Astronaut();
        Astronaut4.setPosition("Инженер");
        Astronaut4.setName("Проценко Л. С.");
        Astronaut4.setGender("муж.");
        Astronaut4.setNationality("хохол");
        Astronaut4.setEducation("высшее");
        Astronaut4.setGrowth(168);
        Astronaut4.setWeght(71);
        Astronaut4.setAge(36);

        Astronaut Astronaut5 = new Astronaut();
        Astronaut5.setPosition("Второй пилот");
        Astronaut5.setName("Соболь В. А.");
        Astronaut5.setGender("муж.");
        Astronaut5.setNationality("русский");
        Astronaut5.setEducation("высшее");
        Astronaut5.setGrowth(178);
        Astronaut5.setWeght(73);
        Astronaut5.setAge(38);

        Astronaut Astronaut6 = new Astronaut();
        Astronaut6.setPosition("Командир");
        Astronaut6.setName("Майданкин Р. Ю.");
        Astronaut6.setGender("муж.");
        Astronaut6.setNationality("русский");
        Astronaut6.setEducation("высшее");
        Astronaut6.setGrowth(177);
        Astronaut6.setWeght(77);
        Astronaut6.setAge(35);


        Astronaut[] Astronauts = new  Astronaut[6];

        Astronauts[0] = Astronaut1;
        Astronauts[1] = Astronaut2;
        Astronauts[2] = Astronaut3;
        Astronauts[3] = Astronaut4;
        Astronauts[4] = Astronaut5;
        Astronauts[5] = Astronaut6;

        for(int i=0; i <  Astronauts.length; i++) {
            System.out.println(Astronauts[i]);

        }

    }

}











