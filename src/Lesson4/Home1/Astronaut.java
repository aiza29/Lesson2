package Lesson4.Home1;

/**
 * Created by Anna on 16.01.2019.
 */
 class Astronaut {

    private String position;
    private String name;
    private String gender;
    private String nationality;
    private String education;
    private int growth;
    private int weght;
    private int age;

    public int getWeght() {
        return weght;
    }

    public void setWeght(int weght) {
        this.weght = weght;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Астронавт{" +
                "должность='" + position + '\'' +
                ", имя='" + name + '\'' +
                ", пол='" + gender + '\'' +
                ", национальность='" + nationality + '\'' +
                ", образование='" + education + '\'' +
                ", рост=" + growth +
                ", вес=" + weght +
                ", возраст=" + age +
                '}';
    }

}
