public class Condicional {
        public static void main(String[] args) {
            int anoLancamento = 2004;
            boolean incluidoNoPlano = false;
            double notaDoFilme = 9.4;
            String tipoPlano = "normal";

            if (anoLancamento >= 2022){
                System.out.println("Lançamento que as pessoas estão curtindo");
            } else {
                System.out.println("Filme retrô que vale a pena assistir");
            }

            if(incluidoNoPlano || tipoPlano.equals("plus")){
                System.out.println("Filme liberado");
            } else {
                System.out.println("Deve pagar a locação");
            }

        }


}
