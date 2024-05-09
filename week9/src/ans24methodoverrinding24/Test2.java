package ans24methodoverrinding24;

public class Test2 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Axis a = new Axis();
        Icic i = new Icic();
        System.out.println("SBI Rate Of Interest: " + s.getRateOfInterest());
        System.out.println("ICIC Rate Of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate Of Interest: " + a.getRateOfInterest());
    }
}
