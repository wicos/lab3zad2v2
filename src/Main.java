import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stos stos = new Stos();
        boolean wyjdz = false;

        while (!wyjdz) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Dodaj element na stos");
            System.out.println("2. Usun element ze stosu");
            System.out.println("3. Wyswietl zawartosc stosu");
            System.out.println("4. Wyjdz");

            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1:
                    System.out.println("Podaj element ktory chcesz dodac:");
                    String element = scanner.nextLine();
                    stos.naStos(element);
                    break;
                case 2:
                    try {
                        String removedElement = stos.zeStosu();
                        System.out.println("Usunieto element: " + removedElement);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Nie mozna usunac elementu z pustego stosu.");
                    }
                    break;
                case 3:
                    stos.wypiszStos();
                    break;
                case 4:
                    wyjdz = true;
                    break;
                default:
                    System.out.println("Nieprawidlowy wybor.");
                    break;
            }
        }
        //
    }
}