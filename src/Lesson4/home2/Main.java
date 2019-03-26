package lesson4.home2;

/**
 * Created by Anna on 18.02.2019.
 */
public class Main {

    public static void main(String[] args) {

        Candidate Candidate1 = new Candidate();
        Candidate1.setGender("жен.");
        Candidate1.setNationality("русский");
        Candidate1.setEducation("высшее");
        Candidate1.setWeght(54);
        Candidate1.setGrowth(168);
        Candidate1.setAge(34);

        Candidate Candidate2 = new Candidate();
        Candidate2.setGender("муж.");
        Candidate2.setNationality("русский");
        Candidate2.setEducation("высшее");
        Candidate2.setWeght(67);
        Candidate2.setGrowth(178);
        Candidate2.setAge(37);

        Candidate Candidate3 = new Candidate();
        Candidate3.setGender("муж.");
        Candidate3.setNationality("русский");
        Candidate3.setEducation("среднее");
        Candidate3.setWeght(71);
        Candidate3.setGrowth(175);
        Candidate3.setAge(32);

        if (validation(Candidate1)){
            System.out.println("кандидат 1 подходит ");
        }
        else {
            System.out.println("кандидат 1 не подходит ");
        }

        if (validation(Candidate2)) {
            System.out.println("кандидат 2 подходит ");
        }
        else {
            System.out.println("кандидат 2 не подходит ");
        }


        if (validation(Candidate3)) {
            System.out.println("кандидат 3 подходит ");
        }
        else {
            System.out.println("кандидат 3 не подходит ");
        }

    }

    public static boolean validation(Candidate candidate) {

        if ("муж.".equals(candidate.getGender())) {
            if ("русский".equals(candidate.getNationality())) ;
            if ("высшее".equals(candidate.getEducation())) ;
            if (candidate.getWeght() <= 68) ;
            if (candidate.getGrowth() <= 180) ;
            if (candidate.getAge() <= 40) ;
        }
        return false;
    }
}