import java.util.Random;
import java.util.Scanner;

public class Stos {
    private int rozmiarTablicy;
    private String[] tablica;
    private int wierzcholek;

    public Stos() {
        Random rand = new Random();
        this.rozmiarTablicy = rand.nextInt(10) + 1;
        this.tablica = new String[rozmiarTablicy];
        this.wierzcholek = -1;
    }

    public Stos(int rozmiar) {
        this.rozmiarTablicy = rozmiar;
        this.tablica = new String[rozmiar];
        this.wierzcholek = -1;
    }

    public int maxRozmiarStosu() {
        return rozmiarTablicy;
    }

    public int rozmiarStosu() {
        return wierzcholek + 1;
    }

    public void naStos(String element) {
        if (wierzcholek == rozmiarTablicy - 1) {
            System.out.println("Stos pelny, nic nie dodano.");
        } else {
            wierzcholek++;
            tablica[wierzcholek] = element;
        }
    }

    public String zeStosu() {
        if (wierzcholek == -1) {
            System.out.println("Stos jest pusty.");
        } else {
            System.out.println("Ktory element chcesz usunac? (podaj indeks od 0 do " + wierzcholek + ")");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            if (index < 0 || index > wierzcholek) {
                System.out.println("Podano niepoprawny indeks.");
            } else {
                System.out.println("Usunieto element: " + tablica[index]);
                for (int i = index; i < wierzcholek; i++) {
                    tablica[i] = tablica[i+1];
                }
                wierzcholek--;
            }
        }
        return null;
    }

    public void wypiszStos() {
        if (wierzcholek == -1) {
            System.out.println("Stos jest pusty.");
        } else {
            System.out.println("Elementy stosu:");
            for (int i = wierzcholek; i >= 0; i--) {
                System.out.println(tablica[i]);
            }
        }
    }
}
