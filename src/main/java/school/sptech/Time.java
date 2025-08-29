package school.sptech;

public class Time {
    String nome;
    Integer vitorias, empates, derrotas;

    // construtor
    public Time(){
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public void registrarVitoria(){
        vitorias += 1;
    }
    public void registrarEmpate(){
        empates += 1;
    }
    public void registrarDerrota(){
        derrotas += 1;
    }

    public Integer getPontos(){
        int pontosV = vitorias * 3;
        int pontosE = empates;
        int pontosD = 0;
        int somaPontos = pontosV + pontosE + pontosD;
        //System.out.println("Total de pontos conquistados: " + somaPontos);

        return somaPontos;
    }

    public Integer getTotalPartidas(){
        int totalPartidas =  vitorias + empates + derrotas;
        //System.out.println("Total de partidas: " + totalPartidas);

        return totalPartidas;
    }

    public Integer getAproveitamento(){
        Integer percentual = (vitorias * 100/getTotalPartidas());

        return percentual;
    }

    public void compararAproveitamento(Time adversario){

        if (adversario.getAproveitamento() > getAproveitamento()){
            System.out.println("Time " + adversario.nome + " tem o aproveitamento maior que o " + nome);
        } else {
            System.out.println("Time " + nome + " tem o aproveitamento maior que o " + adversario.nome);
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do time: " + nome);
        System.out.println("Número de vitórias: " + vitorias);
        System.out.println("Número de empates: " + empates);
        System.out.println("Número de derrotas: " + derrotas);
        System.out.println("Número de pontos: " + getPontos());
        System.out.println("Total de partidas: " + getTotalPartidas());
        System.out.println("Aproveitamento: " + getAproveitamento() + "\n\n");
    }


}
