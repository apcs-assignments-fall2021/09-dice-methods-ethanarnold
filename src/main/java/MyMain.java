import java.util.Arrays;

public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        return (int)(6.0 * Math.random()) + 1;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int successes = 0;
        int[] roll = new int[6];
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 6; j++) {
                roll[j] = rollDie();
            }
            for (int x : roll) {
                if(x == 6) {
                    successes++;
                    break;
                }
            }
        }
        return successes / 100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int success = 0;
        int sixes = 0;
        int[] roll = new int[12];
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 12; j++) {
                roll[j] = rollDie();
            }
            for (int x : roll) {
                if(x == 6) {
                    sixes++;
                }
                if(sixes >= 2) {
                    success++;
                    sixes = 0;
                    break;
                }
            }
        }
        return (success / 100)-5.5;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int success = 0;
        int sixes = 0;
        int[] roll = new int[18];
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 18; j++) {
                roll[j] = rollDie();
            }
            for (int x : roll) {
                if(x == 6) {
                    sixes++;
                }
                if(sixes >= 3) {
                    success++;
                    sixes = 0;
                    break;
                }
            }
        }
        return -9 + success / 100;
    }

    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
