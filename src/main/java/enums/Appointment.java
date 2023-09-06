package enums;

public record Appointment(
        String id,
        String name,
        DaysOfWeek wochentag
) {

    public DaysOfWeek getWochentag() {
        return this.wochentag;
    }
}