import java.util.List;

public class Time {

    private String nomeTime;
    private List<Jogador> time;

    public Time(String nomeTime, List<Jogador> time) {
        this.nomeTime = nomeTime;
        this.time = time;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public List<Jogador> getTime() {
        return time;
    }

    public void setTime(List<Jogador> time) {
        this.time = time;
    }

}
