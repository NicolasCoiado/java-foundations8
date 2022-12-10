package LIGAFUTEBOL;

public class Jogo {
    int id;
    private String equipeA;
    private String equipeB;
    private int golsEquipeA;
    private int golsEquipeB;
    private double temperatura;

    //ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //EQUIPE A
    public String getEquipeA() {
        return equipeA;
    }
    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }

    //EQUIPE B
    public String getEquipeB() {
        return equipeB;
    }
    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }

    //GOLS EQUIPE A
    public int getGolsEquipeA() {
        return golsEquipeA;
    }
    public void setGolsEquipeA(int golsEquipeA) {
        this.golsEquipeA = golsEquipeA;
    }

    //GOLS EQUIPE B
    public int getGolsEquipeB() {
        return golsEquipeB;
    }
    public void setGolsEquipeB(int golsEquipeB) {
        this.golsEquipeB = golsEquipeB;
    }

    //TEMPERATURA
    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}
