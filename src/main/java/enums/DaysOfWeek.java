package enums;

public enum DaysOfWeek {
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

    private final String german;

    DaysOfWeek(String german) {
        this.german = german;
    }

    public String getGerman() {
        return german;
    }

    public String getEnglish() {
        return this.german;
    }
}
