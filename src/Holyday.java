public class Holyday extends CalendarDay {
    private String type = "feriado";

    Holyday(String date, String name) {
        super.setDate(date);
        super.setName(name);
    }

    @Override
    public String getType() {
        return this.type;
    }
}
