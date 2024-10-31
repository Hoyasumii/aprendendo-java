import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 4, 5, 2, 6};
        sort(arr);
        String arrS = Arrays.toString(arr);
        System.out.println(arrS);
    }

    public static void sort(int[] arr) {
        for (int firstIndex = 1; firstIndex < arr.length; firstIndex++) { // Esse primeiro índice começa na posição 0 e irá percorrer o array até o final
            // Mas porquê 1 e não 0 como valor inicial de firstIndex? Por causa que, durante o segundo índice, será tratado índices - 1, ou seja, que irá subtrair índices por 1, e caso esse índice seja -1 e a consulta seja realizada, ocorrerá um erro.
            for (int secondIndex = arr.length - 1; secondIndex >= firstIndex; secondIndex--) { // esse segundo índice irá da posição final e írá para a inicial, enquanto o seu valor estiver maior ou igual à posição do primeiro item
                if (arr[secondIndex] <= arr[secondIndex - 1]) { // Se o item do segundo índice for menor que o item do segundo índice menos 1, trocar
                    int valueToReplace = arr[secondIndex];
                    arr[secondIndex] = arr[secondIndex - 1];
                    arr[secondIndex - 1] = valueToReplace;
                }
            }
        }
    }
}