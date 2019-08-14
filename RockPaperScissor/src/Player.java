/**
 *	A class that represents player. 
 */

/**
 * @author janika
 *
 */
public class Player {
	
	private String name;
	private int guess;
	private int score;
	
	public Player() {
		name = "Steven Basic";
		guess = gesture();
	}
	
	public Player(String n) {
		name = n;
		guess = gesture();
	}
	
	public Player(String n, int g) {
		name = n;
		guess = g;
	}
	
	public Player(String n, int g, int s) {
		name = n;
		guess = g;
		score = s;
	}
	
	/**
	 *Generates random number between 0 and 2 
	 * 
	 * @return the num random number 0,1,2
	 */
	public int gesture() {
		int num = (int) (Math.random() * 3);
		return num;
	}

	/**
	 * Return the name of the player.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return the guess of the player
	 * @return the guess
	 */
	public int getGuess() {
		return guess;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	public void addScore(int i) {
		score += i;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
