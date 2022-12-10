package LIGAFUTEBOL;
import java.util.ArrayList;

public class LigaFutebol {
    ArrayList<Jogo> tabelaJogos= new ArrayList<Jogo>();

    public void InserirJogo(Jogo jogo){
        tabelaJogos.add(jogo);
    }
    public void ExibirJogos(){
        for (int i = 0; i < tabelaJogos.size(); i++) {
            System.out.println("Game "+i);
            Jogo jogo = tabelaJogos.get(i);
            System.out.println("Time 1 : "+jogo.getEquipeA()+", "+jogo.getGolsEquipeA());
            System.out.println("Time 1 : "+jogo.getEquipeB()+", "+jogo.getGolsEquipeB());
            System.out.println("Temperatura : "+jogo.getTemperatura());
        }
    }

}
