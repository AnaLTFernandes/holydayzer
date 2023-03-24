import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Holydays holydays = new Holydays();

        System.out.println("\n====================");

        System.out.println("> Feriados criados: " + holydays.getAll() + "\n");
        System.out.println("> Nomes dos feriados criados: " + holydays.getNames() + "\n");
        System.out.println("> Datas dos feriados criados: " + holydays.getDates() + "\n");

        String date = "";
        while (!date.equals("exit")) {
            System.out.println(
                    "\nDigite uma data no formato \"dd/mm/aaaa\" para procurar pelo feriado correspondente, ou digite \"exit\" para sair.");

            System.out.print(">> ");
            date = scanner.next();

            if (!date.equals("exit")) {
                System.out.print("> ");
                holydays.getByDate(date);
            }
        }

        System.out.println("\nBye! Espero te ter aqui novamente :)");
        System.out.println("====================\n");
        scanner.close();
    }
}
