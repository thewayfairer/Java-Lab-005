public class Player {
    private String name;
    private int score;

    /**
     * Creates a new Player object with the specified name and score of zero.
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    /**
     * Returns the name of the player.
     * @return the name instance variable
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the score of the player.
     * @return the score instance variable
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Adds the specified amount to the player's score.
     * @param amount the amount to add to the score
     */
    public void addScore(int amount) {
        this.score += amount;
    }

    /**
     * Rolls the dice, adding the result to the player's score.
     * @param dice the Dice object to roll
     */
    public void toss(Dice dice) {
        dice.roll();
        addScore(dice.view());
    }
}
