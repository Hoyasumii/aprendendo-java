public class Testing {
    public static void main(String... args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    public static double sum(double... args) { 
        // No java eu posso colocar um operador spread como em javascript, só que claro, não é tão flexível quanto no javascript e também, aqui ele é chamado de outra coisa: varargs
        double result = 0;

        for (double item : args) {
            result += item;
        }

        return result;
    }

}