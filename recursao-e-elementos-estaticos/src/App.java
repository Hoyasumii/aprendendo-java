public class App {
    public static int factorial(int number) {
        if (number < 0) return -1;
        else if (number == 0) return 1;
        return number * factorial(number - 1); // Exemplo básico de recursão
    }

    public static void main(String[] args) {
//        System.out.println(factorial(5));
        BasicSum obj1 = new BasicSum(1);
        BasicSum obj2 = new BasicSum(2, 3);
        System.out.println(obj1.run() + "; " + obj2.run());
        BasicSum.secondNumber = 10; // Exemplo de como se usar elementos estáticos
        System.out.println(obj1.run() + "; " + obj2.run());
    }

}
