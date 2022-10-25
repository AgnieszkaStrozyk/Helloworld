import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        // 1. Aplikacja ‘Bankomat’
        // 2. musimy mieć wcześniej zadeklarowaną ilość pieniędzy
        // 3. bankomat pyta ile chcemy wypłacić
        // 4. bankomat pokazuje ile wypłaciliśmy
        // 5. bankomat pokazuje aktualny stan konta po wypłacie

        Scanner sc = new Scanner(System.in);

        int money= 1000;
        System.out.println("Ile chcesz wypłacić?");
        int get_money = sc.nextInt();
        int current = money - get_money;

        System.out.println("Wypłaciłes: "+get_money );
        System.out.println("Stan konta: "+current);
    }

}
