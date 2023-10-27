import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Dia sua avaliação para o filme ou -1 para encerrar");
            nota = scanner.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalNotas ++;
            }

            System.out.println("media:>>: "+ mediaAvaliacao);
            System.out.println("loops:>>: "+ totalNotas);
        }

        System.out.println("Media de avaliações: " + mediaAvaliacao/totalNotas);

    }
}
