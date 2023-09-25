package models;
import java.util.List;

import enums.gameComplexity;
import enums.gameType;

public class boardGame {
    private String name;
    private gameType type;
    private int minPlayers;
    private int maxPlayers;
    private int playingTime;
    private gameComplexity complexity;
    private boolean singlePlayer;
    private boolean free;
    private boolean storytelling;
    private boolean onlinePlay;
    private boolean onsitePlay;
    private String location;
    private boolean active;
    private boolean finished;

    public boardGame(String name, gameType type, int minPlayers, int maxPlayers, int playingTime, gameComplexity complexity, boolean onlinePlay, boolean onsitePlay, String location) {
        this.name = name;
        this.type = type;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.playingTime = playingTime;
        this.complexity = complexity;
        this.onlinePlay = onlinePlay;
        this.onsitePlay = onsitePlay;
        this.location = location;
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public boolean isStorytellingGameActive() {
        return this.type == gameType.STORYTELLING && this.active;
    }
    public boolean isFinished() {
        return finished;
    }

    public boolean canStartGame(List<player> players) {
        if (free && players.size() >= minPlayers && players.size() <= maxPlayers) {
            if (singlePlayer && players.size() == 1) {
                return true;
            } else return !storytelling && !isStorytellingGameActive();
        }
        return false;
    }

    public String toString() {
        String onlinePlayStatus = onlinePlay ? "Yes" : "No";
        String onsitePlayStatus = onsitePlay ? "Yes" : "No";
        return "Name: " + name + "\nType: " + type +
                "\nMin Players: " + minPlayers + "\nMax Players: " + maxPlayers +
                "\nPlaying Time: " + playingTime + " minutes" + "\nComplexity: " + complexity +
                "\nOnline Play: " + onlinePlayStatus + "\nOnsite Play: " + onsitePlayStatus +
                (onsitePlay ? "\nLocation: " + location : "") +
                "\nActive: " + active;
    }
}

