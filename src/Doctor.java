public class Doctor extends Person {


    public Doctor(String fullname, int age, int experience, int salary, String clothes) {
        super(fullname, age, experience, salary, clothes);


    }

    @Override
    public String toString() {
        return "Doctor{}" +super.toString();
    }
}