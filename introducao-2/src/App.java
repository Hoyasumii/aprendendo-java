import java.util.Scanner;

public class App {1
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = input.nextLine();

        System.out.println("Olá, " + nome);
        input.close();

    }
}
