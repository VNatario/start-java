import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();


        System.out.println("Qual o ano de lançamento ? ");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual a sua nota para o filme ?");
        double notaFilme = leitura.nextDouble();

        System.out.println("""
                    O filme %s, foi lançado em %d.
                    Você deu a nota de %.2f
                """.formatted(filme, anoLancamento, notaFilme));
    }
}
