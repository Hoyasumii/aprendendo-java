package testing;

import testing.exceptions.GreaterThanTwoException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws GreaterThanTwoException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("- Informe o número inteiro: ");
            int desiredNumber = scanner.nextInt();
            if (desiredNumber > 2) throw new GreaterThanTwoException();
        }
        catch (GreaterThanTwoException e) {
            System.out.println(e.getMessage());
        }
    }
}
