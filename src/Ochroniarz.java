import java.util.Scanner;

public class Ochroniarz {
    public static void main(String[] args) {
        // 1. Ochroniarz najpierw pyta o imię
        // 2. potem o nazwisko
        // 3. potem o miasto zamieszkania
        // 4. potem o wiek
        // 5. potem stan cywilny (zmienna boolean)
        // 6. na koniec ładnie jeden po drugim wypisuje w podsumowaniu

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoje imie");
        String name= sc.nextLine();
        System.out.println("Podaj swoje nazwisko");
        String last_name= sc.nextLine();
        System.out.println("Podaj swoje miasto zamieszkania");
        String city= sc.nextLine();
        System.out.println("Podaj swój wiek");
        int age= sc.nextInt();
        System.out.println("Czy jesteś zamężna/żonaty?");
        boolean married= sc.hasNext();

        System.out.println("Twoje imie to: "+name);
        System.out.println("Twoje nazwisko to: "+last_name);
        System.out.println("Twoje miasto zamieszkania to: "+city);
        System.out.println("Twój wiek to: "+age);
        System.out.println("Zamężna/żonaty: "+married);

    }
}
