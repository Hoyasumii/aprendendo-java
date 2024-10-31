public class Outerloop {
    public static void main(String[] args) {
        outerloop:
            for (int i = 1; i < 10; i++) {
                System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
                
                for (int j = 1; j < 10; j++) {
                    // Aqui eu estou dizendo que se o valor de j for maior que 5, ele vai sair do loop mais externo, que é o outerloop. Se eu não colocar o outerloop, ele vai sair do loop mais interno, que é o innerloop.
                    if (j > 5) continue outerloop; 
                    /*
                     * No Java, dá pra criar um bloco no código que permite com que você consiga tratar esse bloco como se fosse um loop. 
                     * Entretanto, seu uso acaba sendo usado para sair de fluxos muito internos. 
                     * Como exemplo, um for dentro de um for, e você quer sair do for mais externo, você pode usar o continue com o nome do bloco que você quer sair.
                    */
                    System.out.print(j);
                }

            }            
    } 
}