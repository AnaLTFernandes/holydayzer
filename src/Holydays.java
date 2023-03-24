import java.util.ArrayList;
import java.util.List;

public class Holydays implements ICalendar {
    private List<CalendarDay> holydayList = new ArrayList<>();

    Holydays() {
        Holyday holyday1 = new Holyday("01/01/2023", "Confraternização mundial");
        Holyday holyday2 = new Holyday("21/02/2023", "Carnaval");
        Holyday holyday3 = new Holyday("17/04/2023", "Páscoa");
        Holyday holyday4 = new Holyday("21/04/2023", "Tiradentes");
        Holyday holyday5 = new Holyday("01/05/2023", "Dia do trabalho");
        Holyday holyday6 = new Holyday("08/06/2023", "Corpus Christi");
        Holyday holyday7 = new Holyday("07/09/2023", "Independência do Brasil");
        Holyday holyday8 = new Holyday("12/10/2023", "Nossa Senhora Aparecida");
        Holyday holyday9 = new Holyday("02/11/2023", "Finados");
        Holyday holyday10 = new Holyday("15/11/2023", "Proclamação da República");
        Holyday holyday11 = new Holyday("25/12/2023", "Natal");

        holydayList.add(holyday1);
        holydayList.add(holyday2);
        holydayList.add(holyday3);
        holydayList.add(holyday4);
        holydayList.add(holyday5);
        holydayList.add(holyday6);
        holydayList.add(holyday7);
        holydayList.add(holyday8);
        holydayList.add(holyday9);
        holydayList.add(holyday10);
        holydayList.add(holyday11);
    }

    public List<CalendarDay> getAll() {
        return holydayList;
    }

    public List<String> getNames() {
        List<String> holydayNameList = new ArrayList<>();

        for (int i = 0; i < holydayList.size(); i++) {
            CalendarDay holyday = holydayList.get(i);
            String name = holyday.getName();
            holydayNameList.add(name);
        }

        return holydayNameList;
    }

    public List<String> getDates() {
        List<String> holydayDateList = new ArrayList<>();

        for (int i = 0; i < holydayList.size(); i++) {
            CalendarDay holyday = holydayList.get(i);
            String date = holyday.getDate();
            holydayDateList.add(date);
        }

        return holydayDateList;
    }

    public String getByDate(String date) {
        for (int i = 0; i < holydayList.size(); i++) {
            CalendarDay holyday = holydayList.get(i);

            if (holyday.getDate().equals(date)) {
                String name = holyday.getName();

                System.out.println("O feriado da data \"" + date + "\" é: " + name + "!");

                return name;
            }
        }

        System.out.println("Não existe nenhum feriado da data \"" + date + "\"!");

        return "";
    }
}
