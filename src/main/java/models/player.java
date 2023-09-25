package models;
import java.util.List;

public class player {
    private String nickname;
    private int currentAge;
    private List<boardGame> gameHistory;

    public player(String nickname, int currentAge, List<boardGame> gameHistory){
        this.nickname = nickname;
        this.currentAge = currentAge;
        this.gameHistory = gameHistory;
    }
}
