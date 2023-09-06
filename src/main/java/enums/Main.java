package enums;

public class Main {

    public static void main(String[] args) {
        Appointment a1 = new Appointment("1", "Java Bootcamp", DaysOfWeek.MONDAY);
        System.out.println(a1);
        System.out.println(wochentagAsString(a1.getWochentag()));

        DaysOfWeek saturday = DaysOfWeek.SATURDAY;
        if (a1.getWochentag() == DaysOfWeek.SUNDAY) {
            System.out.println("WOCHENENDE");
        }
        if (a1.getWochentag() == DaysOfWeek.SATURDAY) {
            System.out.println("WOCHENENDE");
        }
        else {
            System.out.println("Termin ist nicht am WOCHENENDE" + " sondern am " + a1.getWochentag());
        }

        System.out.println(a1.getWochentag().getGerman());
    }

    public static String wochentagAsString(DaysOfWeek wochentag) {
        if (wochentag == DaysOfWeek.SATURDAY || wochentag == DaysOfWeek.SUNDAY) {
            return "Wochenende";
        } else {
            return wochentag.getEnglish();
        }
    }
}
