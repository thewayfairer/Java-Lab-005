import java.util.Scanner;

/**
 * A class representing a game of dice between two players.
 * Allows players to take turns rolling a dice to score points,
 * and determines the winner based on who has the highest score.
 *
 * @author [Trevor Hartman] [Ricky Gutierrez]
 * @version 1.0
 * @since [02/24/2023]
 */

public class Game {
    private Player p1;
    private Player p2;
    private Dice die;

    /**
     * Creates a new game with two players and a dice.
     * @param p1 the first player
     * @param p2 the second player
     * @param die the dice used in the game
     */
    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }

    /**
     * Plays the game, alternating between players until a winner is determined.
     */
    public void play() {
        Player current = this.p1;
        while (true) {
            takeTurn(current);
            current = nextPlayer(current);
            if (p1.getScore() >= 100 || p2.getScore() >= 100) {
                break;
            }
        }
        System.out.println(announceWinner());
    }

    /**
     * Determines the next player, given the current player.
     * @param current the current player
     * @return the next player
     */
    public Player nextPlayer(Player current) {
        if (current == p1) {
            return p2;
        } else {
            return p1;
        }
    }

    /**
     * Takes a turn for the given player, rolling the dice and updating their score.
     *
     * @param player the player taking the turn
     */
    public void takeTurn(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + "'s turn. Press enter to roll the dice.");
        scanner.nextLine();
        int roll = this.die.roll();
        System.out.println(player.getName() + " rolled a " + roll);
        player.addScore(roll);
        System.out.println(player.getName() + "'s score is now " + player.getScore());
    }

    /**
     * Determines the winner of the game based on the players' scores.
     * @return the name of the winning player
     */
    public String announceWinner() {
        System.out.println("Game over!");
        System.out.println(p1.getName() + " scored " + p1.getScore() + " points.");
        System.out.println(p2.getName() + " scored " + p2.getScore() + " points.");

        if (p1.getScore() > p2.getScore()) {
            return p1.getName() + " wins!";
        } else if (p2.getScore() > p1.getScore()) {
            return p2.getName() + " wins!";
        } else {
            return "The game is a tie!";
        }
    }

    /**
     * Main method for running the game.
     * Prompts the user for the number of sides on the dice,
     * creates two players, creates a dice with the given number of sides,
     * and creates a game with the two players and the dice.
     * Finally, calls the play method to start the game.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides on the dice: ");
        int sides = scanner.nextInt();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Dice die = new Dice(sides);
        Game game = new Game(p1, p2, die);

        game.play();
    }
}

