package LIGAFUTEBOL;
import java.util.Random;
import java.util.Scanner;
public class TesteLiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomizar = new Random();

        LigaFutebol campeonato = new LigaFutebol();
        Equipe equipe1 = new Equipe();
        Equipe equipe2 = new Equipe();
        Equipe equipe3 = new Equipe();
        Equipe equipe4 = new Equipe();

        System.out.println("CADASTRAR EQUIPES:");
        System.out.print("Digite o nome da primeira equipe: ");
        equipe1.setNome(input.nextLine());
        System.out.print("Digite o nome da segunda equipe: ");
        equipe2.setNome(input.nextLine());
        System.out.print("Digite o nome da terceira equipe: ");
        equipe3.setNome(input.nextLine());
        System.out.print("Digite o nome da quarta equipe: ");
        equipe4.setNome(input.nextLine());
        System.out.println("================================================");
        System.out.println("VAMOS JOGAR...");


        int TemperaturasBaixasEmSequencia = 3;
        double temperaturaDoJogo;
        int equipeA;
        int equipeB;

        while (TemperaturasBaixasEmSequencia > 0) {
            System.out.print("Digite a temperatura de hoje:");
            temperaturaDoJogo = input.nextDouble();
            if (temperaturaDoJogo > 0) {
                TemperaturasBaixasEmSequencia = 3;
                equipeA = randomizar.nextInt(4);
                equipeB = randomizar.nextInt(4);
                if(temperaturaDoJogo>20.0){
                    Jogo jogo1 = new Jogo();
                    campeonato.InserirJogo(jogo1);
                    jogo1.setId(randomizar.nextInt(1000));
                    jogo1.setTemperatura(temperaturaDoJogo);
                    jogo1.setGolsEquipeA(randomizar.nextInt(5));
                    jogo1.setGolsEquipeB(randomizar.nextInt(5));
                    switch (equipeA){
                        case 1:
                            jogo1.setEquipeA(equipe1.getNome());
                                equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe1.setVitorias(equipe1.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe1.setDerrotas(equipe1.getDerrotas()+1);
                                }else {
                                    equipe1.setEmpates(equipe1.getEmpates()+1);
                                }

                                break;
                            case 2:
                                jogo1.setEquipeA(equipe2.getNome());
                                equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe2.setVitorias(equipe2.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe2.setDerrotas(equipe2.getDerrotas()+1);
                                }else {
                                    equipe2.setEmpates(equipe2.getEmpates()+1);
                                }

                                break;
                            case 3:
                                jogo1.setEquipeA(equipe3.getNome());
                                equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe3.setVitorias(equipe3.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe3.setDerrotas(equipe3.getDerrotas()+1);
                                }else {
                                    equipe3.setEmpates(equipe3.getEmpates()+1);
                                }

                                break;
                            case 4:
                                jogo1.setEquipeA(equipe4.getNome());
                                equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe4.setVitorias(equipe4.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe4.setDerrotas(equipe4.getDerrotas()+1);
                                }else {
                                    equipe4.setEmpates(equipe4.getEmpates()+1);
                                }
                                break;
                            default:
                                break;
                        }
                        switch (equipeB){
                            case 1:
                                jogo1.setEquipeA(equipe1.getNome());
                                equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe1.setVitorias(equipe1.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe1.setDerrotas(equipe1.getDerrotas()+1);
                                }else {
                                    equipe1.setEmpates(equipe1.getEmpates()+1);
                                }

                                break;
                            case 2:
                                jogo1.setEquipeA(equipe2.getNome());
                                equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe2.setVitorias(equipe2.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe2.setDerrotas(equipe2.getDerrotas()+1);
                                }else {
                                    equipe2.setEmpates(equipe2.getEmpates()+1);
                                }

                                break;
                            case 3:
                                jogo1.setEquipeA(equipe3.getNome());
                                equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe3.setVitorias(equipe3.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe3.setDerrotas(equipe3.getDerrotas()+1);
                                }else {
                                    equipe3.setEmpates(equipe3.getEmpates()+1);
                                }

                                break;
                            case 4:
                                jogo1.setEquipeA(equipe4.getNome());
                                equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo1.getGolsEquipeA());
                                equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo1.getGolsEquipeB());

                                if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                    equipe4.setVitorias(equipe4.getVitorias()+1);
                                } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                    equipe4.setDerrotas(equipe4.getDerrotas()+1);
                                }else {
                                    equipe4.setEmpates(equipe4.getEmpates()+1);
                                }
                                break;
                            default:
                                break;
                        }

                        Jogo jogo2 = new Jogo();
                        campeonato.InserirJogo(jogo1);
                        jogo2.setId(randomizar.nextInt(1000));
                        jogo2.setTemperatura(temperaturaDoJogo);
                        jogo2.setGolsEquipeA(randomizar.nextInt(5));
                        jogo2.setGolsEquipeB(randomizar.nextInt(5));
                        switch (equipeA){
                            case 1:
                                jogo2.setEquipeA(equipe1.getNome());
                                equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe1.setVitorias(equipe1.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe1.setDerrotas(equipe1.getDerrotas()+1);
                                }else {
                                    equipe1.setEmpates(equipe1.getEmpates()+1);
                                }

                                break;
                            case 2:
                                jogo2.setEquipeA(equipe2.getNome());
                                equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe2.setVitorias(equipe2.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe2.setDerrotas(equipe2.getDerrotas()+1);
                                }else {
                                    equipe2.setEmpates(equipe2.getEmpates()+1);
                                }

                                break;
                            case 3:
                                jogo2.setEquipeA(equipe3.getNome());
                                equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe3.setVitorias(equipe3.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe3.setDerrotas(equipe3.getDerrotas()+1);
                                }else {
                                    equipe3.setEmpates(equipe3.getEmpates()+1);
                                }

                                break;
                            case 4:
                                jogo2.setEquipeA(equipe4.getNome());
                                equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe4.setVitorias(equipe4.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe4.setDerrotas(equipe4.getDerrotas()+1);
                                }else {
                                    equipe4.setEmpates(equipe4.getEmpates()+1);
                                }
                                break;
                            default:
                                break;
                        }
                        switch (equipeB){
                            case 1:
                                jogo2.setEquipeA(equipe1.getNome());
                                equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe1.setVitorias(equipe1.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe1.setDerrotas(equipe1.getDerrotas()+1);
                                }else {
                                    equipe1.setEmpates(equipe1.getEmpates()+1);
                                }

                                break;
                            case 2:
                                jogo2.setEquipeA(equipe2.getNome());
                                equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe2.setVitorias(equipe2.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe2.setDerrotas(equipe2.getDerrotas()+1);
                                }else {
                                    equipe2.setEmpates(equipe2.getEmpates()+1);
                                }

                                break;
                            case 3:
                                jogo2.setEquipeA(equipe3.getNome());
                                equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe3.setVitorias(equipe3.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe3.setDerrotas(equipe3.getDerrotas()+1);
                                }else {
                                    equipe3.setEmpates(equipe3.getEmpates()+1);
                                }

                                break;
                            case 4:
                                jogo2.setEquipeA(equipe4.getNome());
                                equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo2.getGolsEquipeA());
                                equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo2.getGolsEquipeB());

                                if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                    equipe4.setVitorias(equipe4.getVitorias()+1);
                                } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                    equipe4.setDerrotas(equipe4.getDerrotas()+1);
                                }else {
                                    equipe4.setEmpates(equipe4.getEmpates()+1);
                                }
                                break;
                            default:
                                break;
                        }
                }else{
                    Jogo jogo1 = new Jogo();
                    campeonato.InserirJogo(jogo1);
                    jogo1.setId(randomizar.nextInt(1000));
                    jogo1.setTemperatura(temperaturaDoJogo);
                    jogo1.setGolsEquipeA(randomizar.nextInt(2));
                    jogo1.setGolsEquipeB(randomizar.nextInt(2));
                    switch (equipeA){
                        case 1:
                            jogo1.setEquipeA(equipe1.getNome());
                            equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe1.setVitorias(equipe1.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe1.setDerrotas(equipe1.getDerrotas()+1);
                            }else {
                                equipe1.setEmpates(equipe1.getEmpates()+1);
                            }

                            break;
                        case 2:
                            jogo1.setEquipeA(equipe2.getNome());
                            equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe2.setVitorias(equipe2.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe2.setDerrotas(equipe2.getDerrotas()+1);
                            }else {
                                equipe2.setEmpates(equipe2.getEmpates()+1);
                            }

                            break;
                        case 3:
                            jogo1.setEquipeA(equipe3.getNome());
                            equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe3.setVitorias(equipe3.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe3.setDerrotas(equipe3.getDerrotas()+1);
                            }else {
                                equipe3.setEmpates(equipe3.getEmpates()+1);
                            }

                            break;
                        case 4:
                            jogo1.setEquipeA(equipe4.getNome());
                            equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe4.setVitorias(equipe4.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe4.setDerrotas(equipe4.getDerrotas()+1);
                            }else {
                                equipe4.setEmpates(equipe4.getEmpates()+1);
                            }
                            break;
                        default:
                            break;
                    }
                    switch (equipeB){
                        case 1:
                            jogo1.setEquipeA(equipe1.getNome());
                            equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe1.setVitorias(equipe1.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe1.setDerrotas(equipe1.getDerrotas()+1);
                            }else {
                                equipe1.setEmpates(equipe1.getEmpates()+1);
                            }

                            break;
                        case 2:
                            jogo1.setEquipeA(equipe2.getNome());
                            equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe2.setVitorias(equipe2.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe2.setDerrotas(equipe2.getDerrotas()+1);
                            }else {
                                equipe2.setEmpates(equipe2.getEmpates()+1);
                            }

                            break;
                        case 3:
                            jogo1.setEquipeA(equipe3.getNome());
                            equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe3.setVitorias(equipe3.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe3.setDerrotas(equipe3.getDerrotas()+1);
                            }else {
                                equipe3.setEmpates(equipe3.getEmpates()+1);
                            }

                            break;
                        case 4:
                            jogo1.setEquipeA(equipe4.getNome());
                            equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo1.getGolsEquipeA());
                            equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo1.getGolsEquipeB());

                            if(jogo1.getGolsEquipeA()>jogo1.getGolsEquipeB()){
                                equipe4.setVitorias(equipe4.getVitorias()+1);
                            } else if (jogo1.getGolsEquipeA()<jogo1.getGolsEquipeB()) {
                                equipe4.setDerrotas(equipe4.getDerrotas()+1);
                            }else {
                                equipe4.setEmpates(equipe4.getEmpates()+1);
                            }
                            break;
                        default:
                            break;
                    }

                    Jogo jogo2 = new Jogo();
                    campeonato.InserirJogo(jogo1);
                    jogo2.setId(randomizar.nextInt(1000));
                    jogo2.setTemperatura(temperaturaDoJogo);
                    jogo2.setGolsEquipeA(randomizar.nextInt(2));
                    jogo2.setGolsEquipeB(randomizar.nextInt(2));
                    switch (equipeA){
                        case 1:
                            jogo2.setEquipeA(equipe1.getNome());
                            equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe1.setVitorias(equipe1.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe1.setDerrotas(equipe1.getDerrotas()+1);
                            }else {
                                equipe1.setEmpates(equipe1.getEmpates()+1);
                            }

                            break;
                        case 2:
                            jogo2.setEquipeA(equipe2.getNome());
                            equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe2.setVitorias(equipe2.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe2.setDerrotas(equipe2.getDerrotas()+1);
                            }else {
                                equipe2.setEmpates(equipe2.getEmpates()+1);
                            }

                            break;
                        case 3:
                            jogo2.setEquipeA(equipe3.getNome());
                            equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe3.setVitorias(equipe3.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe3.setDerrotas(equipe3.getDerrotas()+1);
                            }else {
                                equipe3.setEmpates(equipe3.getEmpates()+1);
                            }

                            break;
                        case 4:
                            jogo2.setEquipeA(equipe4.getNome());
                            equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe4.setVitorias(equipe4.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe4.setDerrotas(equipe4.getDerrotas()+1);
                            }else {
                                equipe4.setEmpates(equipe4.getEmpates()+1);
                            }
                            break;
                        default:
                            break;
                    }
                    switch (equipeB){
                        case 1:
                            jogo2.setEquipeA(equipe1.getNome());
                            equipe1.setGolsMarcados(equipe1.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe1.setGolsSofridos(equipe1.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe1.setVitorias(equipe1.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe1.setDerrotas(equipe1.getDerrotas()+1);
                            }else {
                                equipe1.setEmpates(equipe1.getEmpates()+1);
                            }

                            break;
                        case 2:
                            jogo2.setEquipeA(equipe2.getNome());
                            equipe2.setGolsMarcados(equipe2.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe2.setGolsSofridos(equipe2.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe2.setVitorias(equipe2.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe2.setDerrotas(equipe2.getDerrotas()+1);
                            }else {
                                equipe2.setEmpates(equipe2.getEmpates()+1);
                            }

                            break;
                        case 3:
                            jogo2.setEquipeA(equipe3.getNome());
                            equipe3.setGolsMarcados(equipe3.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe3.setGolsSofridos(equipe3.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe3.setVitorias(equipe3.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe3.setDerrotas(equipe3.getDerrotas()+1);
                            }else {
                                equipe3.setEmpates(equipe3.getEmpates()+1);
                            }

                            break;
                        case 4:
                            jogo2.setEquipeA(equipe4.getNome());
                            equipe4.setGolsMarcados(equipe4.getGolsMarcados()+jogo2.getGolsEquipeA());
                            equipe4.setGolsSofridos(equipe4.getGolsSofridos()+jogo2.getGolsEquipeB());

                            if(jogo2.getGolsEquipeA()>jogo2.getGolsEquipeB()){
                                equipe4.setVitorias(equipe4.getVitorias()+1);
                            } else if (jogo2.getGolsEquipeA()<jogo2.getGolsEquipeB()) {
                                equipe4.setDerrotas(equipe4.getDerrotas()+1);
                            }else {
                                equipe4.setEmpates(equipe4.getEmpates()+1);
                            }
                            break;
                        default:
                            break;
                    }
                }
            } else {
                    TemperaturasBaixasEmSequencia--;
            }
        }
        System.out.println("**********************************");
        System.out.println("FIM DA TEMPORADA");

        System.out.println("Equipe 1: "+equipe1.getNome());
        System.out.println("     Gols marcados: "+equipe1.getGolsMarcados());
        System.out.println("     Gols sofridos: "+equipe1.getGolsSofridos());
        System.out.println("     Vitórias: "+equipe1.getVitorias());
        System.out.println("     Empates: "+equipe1.getEmpates());
        System.out.println("     Derrotas: "+equipe1.getDerrotas());

        System.out.println("Equipe 2: "+equipe2.getNome());
        System.out.println("     Gols marcados: "+equipe2.getGolsMarcados());
        System.out.println("     Gols sofridos: "+equipe2.getGolsSofridos());
        System.out.println("     Vitórias: "+equipe2.getVitorias());
        System.out.println("     Empates: "+equipe2.getEmpates());
        System.out.println("     Derrotas: "+equipe2.getDerrotas());

        System.out.println("Equipe 3: "+equipe3.getNome());
        System.out.println("     Gols marcados: "+equipe3.getGolsMarcados());
        System.out.println("     Gols sofridos: "+equipe3.getGolsSofridos());
        System.out.println("     Vitórias: "+equipe3.getVitorias());
        System.out.println("     Empates: "+equipe3.getEmpates());
        System.out.println("     Derrotas: "+equipe3.getDerrotas());

        System.out.println("Equipe 5: "+equipe4.getNome());
        System.out.println("     Gols marcados: "+equipe4.getGolsMarcados());
        System.out.println("     Gols sofridos: "+equipe4.getGolsSofridos());
        System.out.println("     Vitórias: "+equipe4.getVitorias());
        System.out.println("     Empates: "+equipe4.getEmpates());
        System.out.println("     Derrotas: "+equipe4.getDerrotas());

        campeonato.ExibirJogos();
    }

}

