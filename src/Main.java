public class Main {
    public static void main(String[] args) {

        int[] dados = {10,12,14,15,22,37};

        int x = 22;
        int inicio = 0;
        int fim = 5;

        int resultado = BuscaBinariaRecursiva.busca_binaria(dados,x,inicio,fim);

        if (resultado == -1){
            System.out.println("Elemento não encontrado");
        }else{
            System.out.println("Elemento encontrado: " + resultado);
        }

    }
}