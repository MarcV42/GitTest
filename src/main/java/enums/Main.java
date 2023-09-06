package enums;

public class Main {

    public static void main(String[] args) {
        Appointment a1 = new Appointment("1", "Java Bootcamp", DaysOfWeek.TUESDAY);
        System.out.println(a1);
        System.out.println(wochentagAsString(a1.getWochentag()));

        if (a1.getWochentag() == DaysOfWeek.SUNDAY) {
            System.out.println("Termin ist am Sonntag");
        }
        else {
            System.out.println("Termin ist nicht am Sonntag");
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
