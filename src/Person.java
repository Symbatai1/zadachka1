public class Person {
    private String fullname;
    private int age;
    private int experience;
    private int salary;
    private String clothes;

    public Person(String fullname, int age, int experience, int salary, String clothes) {
        this.fullname = fullname;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.clothes = clothes;
    }

    public int work(){
        return salary;
    }

    public  String wear(){
        return clothes;
    }
    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", salary=" + salary +
                ", clothes=";
    }
}
