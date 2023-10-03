import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witam w programie, który sprawdza czy podana przez ciebie liczba dzieli się przez 2,3,5,7 ");

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if(liczba % 2 == 0)
            System.out.println("dzieli sie przez 2");
        if(liczba % 3 == 0)
            System.out.println("dzieli sie przez 3");
        if(liczba % 5 == 0)
            System.out.println("dzieli sie przez 5");
        if(liczba % 7 == 0)
            System.out.println("dzieli sie przez 7");

    }
}