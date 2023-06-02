public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacões;
    int duracaoEmMinutos;

    void exibeFichaTecnica () {
        System.out.println("\n********************************************");
        System.out.println("\nInformações sobre o filme: ");

        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração do Filme: " + duracaoEmMinutos + " Minutos");
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacões++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacões;
    }



}
