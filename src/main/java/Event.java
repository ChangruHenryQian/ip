import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Event extends Task{
    private LocalDate startTime;
    private LocalDate endTime;
    public Event(String description, LocalDate startTime, LocalDate endTime) {
        super(description);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Event(String description, boolean isDone, LocalDate startTime, LocalDate endTime) {
        super(description, isDone);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + startTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy", Locale.ENGLISH))
                + " to: " + endTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy", Locale.ENGLISH)) + ")";
    }

    @Override
    public String toTxt() {
        return "E | " + super.toTxt() + " | " + this.startTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy", Locale.ENGLISH))
                + " | " + this.endTime.format(DateTimeFormatter.ofPattern("MMM dd yyyy", Locale.ENGLISH));
    }
}
