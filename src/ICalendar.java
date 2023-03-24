import java.util.List;

public interface ICalendar {
    public List<CalendarDay> getAll();

    public List<String> getNames();

    public List<String> getDates();

    public String getByDate(String date);
}
