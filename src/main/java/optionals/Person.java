package optionals;

import enums.DaysOfWeek;

public record Person(int id, String name, DaysOfWeek favoriteDay) {

    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public DaysOfWeek favoriteDay() {
        return favoriteDay;
    }
}
