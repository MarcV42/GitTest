package enums;

import optionals.Person;
import optionals.PersonRepository;

import java.util.Optional;

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
        } else {
            System.out.println("Termin ist nicht am WOCHENENDE" + " sondern am " + a1.getWochentag());
        }

        System.out.println(a1.getWochentag().getGerman());
    }


    public static void printPersonById(PersonRepository repository, int id) {
        Optional<Person> optionalPerson = repository.findPersonById(id);

        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            System.out.println("Person gefunden - ID: " + person.id() + ", Name: " + person.name() + ", Wochentag: " + person.favoriteDay());
        } else {
            System.out.println("Person mit ID " + id + " nicht gefunden.");
        }
    }

    public static String wochentagAsString(DaysOfWeek wochentag) {
        if (wochentag == DaysOfWeek.SATURDAY || wochentag == DaysOfWeek.SUNDAY) {
            return "Wochenende";
        } else {
            return wochentag.getEnglish();
        }

        // Suchen Sie nach Personen in der Repository und geben Sie sie aus

    }

}
