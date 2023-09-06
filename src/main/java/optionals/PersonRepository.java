package optionals;
import enums.DaysOfWeek;

import java.util.*;

public class PersonRepository {
    private Map<Integer, Person> persons;

    public PersonRepository() {
        persons = new HashMap<>();
        // Füge 10 Personen mit vordefinierten Werten hinzu
        persons.put(1, new Person(1, "Alice", DaysOfWeek.MONDAY));
        persons.put(2, new Person(2, "Bob", DaysOfWeek.TUESDAY));
        persons.put(3, new Person(3, "Charlie", DaysOfWeek.WEDNESDAY));
        persons.put(4, new Person(4, "David", DaysOfWeek.THURSDAY));
        persons.put(5, new Person(5, "Eva", DaysOfWeek.FRIDAY));
        persons.put(6, new Person(6, "Frank", DaysOfWeek.SATURDAY));
        persons.put(7, new Person(7, "Grace", DaysOfWeek.SUNDAY));
        persons.put(8, new Person(8, "Hank", DaysOfWeek.MONDAY));
        persons.put(9, new Person(9, "Ivy", DaysOfWeek.TUESDAY));
        persons.put(10, new Person(10, "Jack", DaysOfWeek.WEDNESDAY));
    }

    public Optional<Person> findPersonById(int id) {
        return Optional.ofNullable(persons.get(id));
    }
}


/*
Schritt 1: Erstelle ein Enum DaysOfWeek mit den Wochentagen (Montag bis Sonntag).

Schritt 2: Schreibe eine Methode, die den übergebenen Wochentag als String zurückgibt,
wenn er ein Werktag (Montag bis Freitag) ist, andernfalls gib 'Wochenende' zurück.

Schritt 3: Erstelle ein Record 'Person' mit den Eigenschaften 'id', 'name' und 'favoriteDay',
 wobei 'favoriteDay' vom Typ DaysOfWeek ist.

Schritt 4: Erstelle eine Klasse PersonRepository mit einer Liste/Map von Personen.

Schritt 5: Schreibe eine Methode in der Klasse PersonRepository, die eine Person anhand ihrer
Id aus der Liste/Map sucht und zurückgibt. Die Methode soll ein Optional zurückgeben.

Schritt 6: überprüft in euerer Main-Methode, ob es die Person gibt. Wenn es sie gibt, dann gib
 den Namen und den Lieblings-Wochentag auf der Konsole aus.
 */