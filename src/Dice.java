/**
 * A class representing a dice with a given number of sides.
 * Allows the dice to be rolled to produce a random number between 1 and the number of sides.
 */
import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    /**
     * Creates a new dice with the given number of sides.
     * Initializes an instance of the Random class for generating random numbers.
     * @param sides the number of sides on the dice
     */
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random();
    }

    /**
     * Rolls the dice, generating a random number between 1 and the number of sides.
     * Assigns the result to the instance variable sideFacingUp.
     *
     * @return
     */
    public int roll() {
        this.sideFacingUp = randomGenerator.nextInt(sides) + 1;
        return this.sideFacingUp;
    }

    /**
     * Returns the value currently facing up on the dice.
     * @return the value of the instance variable sideFacingUp
     */
    public int view() {
        return this.sideFacingUp;
    }
}
