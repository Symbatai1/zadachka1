public class Main {
    public static void main(String[] args) {


        Doctor doctor= new Doctor(" Kanymgul",18,3,100000,"ak");

        System.out.println(doctor+doctor.wear() + ", akchasy=" + doctor.work());
        System.out.println("*************************************************************************");
        Police police=new Police("Murat",34,2,39900,"kok");
        System.out.println(police+police.wear()+", akchasy=" + doctor.work());
        System.out.println("**************************************************************************");
        Fireman fireman=new Fireman("Ulan",23,3,20000,"green");
        System.out.println(fireman+fireman.wear()+", akchasy=" + doctor.work());
    }
}
