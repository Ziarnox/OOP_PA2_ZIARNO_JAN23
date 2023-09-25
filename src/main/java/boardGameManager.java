import java.util.ArrayList;
import java.util.List;

import enums.gameComplexity;
import enums.gameType;
import models.boardGame;
import models.player;

public class boardGameManager {
    public static void main(String[] args) {
        boardGame game1 = new boardGame("Game 1", gameType.PUZZLE, 1, 1, 30, gameComplexity.EASY, true, false, "Krakow");
        boardGame game2 = new boardGame("Game 2", gameType.STORYTELLING, 2, 6, 60, gameComplexity.HARD, true, true, "Warszawa");

        List<boardGame> player1GameHistory = new ArrayList<>();
        player1GameHistory.add(game1);
        player1GameHistory.add(game2);
        player player1 = new player("Michal", 25, player1GameHistory);

        List<boardGame> player2GameHistory = new ArrayList<>();
        player2GameHistory.add(game1);
        player player2 = new player("Norbert", 24, player2GameHistory);

        if (game1.canStartGame(List.of(player1))) {
            System.out.println("Game 1 can start.");
        } else {
            System.out.println("Game 1 can't start.");
        }

        if (game2.canStartGame(List.of(player1, player2))) {
            System.out.println("Game 2 can start.");
        } else {
            System.out.println("Game 2 can't start.");
        }

        System.out.println("\nGame 1 Details:\n" + game1);
        System.out.println("\nGame 2 Details:\n" + game2);
        System.out.println("\nPlayer 1 Details:\n" + player1);
        System.out.println("\nPlayer 2 Details:\n" + player2);
    }
}
