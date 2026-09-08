import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto("Teclado", 1, 100.00);
        Produto p2 = new Produto("Mouse", 2, 50.00);
        Produto p3 = new Produto("Monitor", 3, 800.00);

        Fatura fatura = new Fatura();

    }
}