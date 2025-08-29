package school.sptech;

public class Main {

    public static void main(String[] args) {
        Time[] times = new Time[2];

        times[0] = new Time();
        times[0].nome = "Corinthians";

        times[1] = new Time();
        times[1].nome = "Varmengo";


        for (int i = 0; i < times.length; i++){
            times[i].registrarVitoria();
            times[i].registrarVitoria();
            times[i].registrarVitoria();
            times[i].registrarEmpate();
            times[i].registrarEmpate();
            times[i].registrarDerrota();
            times[i].registrarDerrota();
            times[i].registrarDerrota();

            times[i].exibirInformacoes();

        }
            // comparando as informações
            times[0].compararAproveitamento(times[1]);


    }
}