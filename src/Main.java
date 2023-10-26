public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: O Castelo Animado");

        int anoDeLancamento = 2004;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        System.out.println(incluidoNoPlano ? "Filme incluido no plano": "O filme não está incluso neste plano");

        double notaDoFilme = 8.75;
        System.out.println("Nota do filme: " + notaDoFilme);

        double media = (9.8 + 8.3 + 8.0) / 3;
        System.out.println("Media: "+ media);

        //Text Blocks
        String sinopse = """
                Filme O Castelo animado
                Filme de aventura e magia
                Ano de lançamento:
                """ + anoDeLancamento;

        System.out.println(sinopse);

        //Cast --> converção de tipos de variaves
        int classificacao = (int) media / 2;
        System.out.println("A classificação média é de %d estrelas.".formatted(classificacao));
        System.out.println(String.format("A classificação média é de %d estrelas.", classificacao));

        String nome = "Natario";
        int idade = 25;
        String proficao = "Programador";
        double valor = 35.258;

        /*
            %s --> String
            %d --> int
            %f --> decimal
            %.2f --> duas casas decimais
        */

        System.out.println(String.format("Meu nome é %s, tenho %d e atuo como %s", nome, idade, proficao));

        String mensagem = """
                    Meu nome é %s.
                    Tenho %d anos.
                    Atuo como %s.
                    Gaste R$ %.2f
                """.formatted(nome, idade, proficao, valor);
        System.out.println(mensagem);




    }
}