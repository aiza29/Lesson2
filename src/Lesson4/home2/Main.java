package Lesson4.Home2;

/**
 * Created by Anna on 18.02.2019.
 */
public class Main {

    public static void main(String[] args) {

        Candidate Candidate1 = new Candidate();
        Candidate1.setGender("���.");
        Candidate1.setNationality("�������");
        Candidate1.setEducation("������");
        Candidate1.setWeght(54);
        Candidate1.setGrowth(168);
        Candidate1.setAge(34);


        Candidate Candidate2 = new Candidate();
        Candidate2.setGender("���.");
        Candidate2.setNationality("�������");
        Candidate2.setEducation("������");
        Candidate2.setWeght(67);
        Candidate2.setGrowth(178);
        Candidate2.setAge(37);

        Candidate Candidate3 = new Candidate();
        Candidate3.setGender("���.");
        Candidate3.setNationality("�������");
        Candidate3.setEducation("�������");
        Candidate3.setWeght(71);
        Candidate3.setGrowth(175);
        Candidate3.setAge(32);

    }

    public static boolean validation(Candidate candidate) {

        if ("���.".equals(candidate.setGender())) {
            if ("�������".equals(candidate.setNationality())) ;
            if ("������".equals(candidate.setEducation())) ;
            if (candidate.setWeght() <=  75) ;
            if (candidate.setGrowth() <= 180) ;
            if (candidate.setAge() <= 45) ;
        }

        return;
    }

}