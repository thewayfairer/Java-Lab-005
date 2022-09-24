import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public void play() {
    }

    public Player nextPlayer(Player current) {
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }

    public static void main(String[] args) {
    }
}
