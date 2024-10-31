public class BasicSum {
    public int firstNumber;
    public static int secondNumber = 0;

    static { // O bloco static funciona como um construtor para os elementos estáticos, pois será só será executado após o chamado do elemento mas antes da execução do elemento estático. Você pode usar para fazer uma solicitação num servidor ou banco de dados remoto ou local.
        System.out.println("O valor inicial de secondNumber é: " + secondNumber);
    }

    public BasicSum(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public BasicSum(int firstNumber, int secondNumber) {
        this(firstNumber); // Assim, eu posso chamar o construtor da linha 5
        BasicSum.secondNumber = secondNumber;
    }

    public int run() {
        return this.firstNumber + BasicSum.secondNumber;
    }

}
