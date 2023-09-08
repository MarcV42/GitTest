package optionals;

import enums.DaysOfWeek;

import java.util.*;

public class PersonRepository {
    public List<Person> personList;
    public Map<Integer, Person> personMap;

    public PersonRepository() {
        personList = new ArrayList<>();
        personMap = new HashMap<>();
        // Füge 10 Personen mit vordefinierten Werten hinzu
        personList.add(new Person(1, "Alice", DaysOfWeek.MONDAY));
        personList.add(new Person(2, "Bob", DaysOfWeek.TUESDAY));
        personList.add(new Person(3, "Charlie", DaysOfWeek.WEDNESDAY));
        personList.add(new Person(4, "David", DaysOfWeek.THURSDAY));
        personList.add(new Person(5, "Eva", DaysOfWeek.FRIDAY));
        personList.add(new Person(6, "Frank", DaysOfWeek.SATURDAY));
        personList.add(new Person(7, "Grace", DaysOfWeek.SUNDAY));
        personList.add(new Person(8, "Hank", DaysOfWeek.MONDAY));
        personList.add(new Person(9, "Ivy", DaysOfWeek.TUESDAY));
        personList.add(new Person(10, "Jack", DaysOfWeek.WEDNESDAY));

        // Fülle die Map mit Personen
        for (Person person : personList) {
            personMap.put(person.id(), person);
        }
    }

    public Optional<Person> findPersonById(int id) {
        // Zuerst in der Liste nach der Person suchen
        Optional<Person> personFromList = personList.stream()
                .filter(person -> person.id() == id)
                .findFirst();

        // Wenn in der Liste nicht gefunden, in der Map suchen
        if (personFromList.isPresent()) {
            return personFromList;
        } else {
            return Optional.ofNullable(personMap.get(id));
        }
//Test
    }
    //Main Test
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