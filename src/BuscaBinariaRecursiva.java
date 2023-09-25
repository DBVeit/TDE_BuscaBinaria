public class BuscaBinariaRecursiva {

    public static int busca_binaria(int[] dados, int x, int inicio, int fim){

        if (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (dados[meio] == x){
                return meio; // Elemento encontrado, retorna a posição
            } else if (dados[meio] > x) {
                return busca_binaria(dados,x,inicio,meio - 1); // Elemento na metade inferior do vetor
            }else {
                return busca_binaria(dados, x, meio + 1, fim); // Elemento na metade superior do vetor
            }
        }
        return -1;
    }

}