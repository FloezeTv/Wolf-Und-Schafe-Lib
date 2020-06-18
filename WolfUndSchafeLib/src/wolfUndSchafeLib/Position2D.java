package wolfUndSchafeLib;

/**
 * Position for WolfUndSchafe
 * 
 * @author Floeze
 *
 */
public class Position2D {
	/**
	 * the positions x coordinate
	 */
	private final int x;
	/**
	 * the positions y coordinate
	 */
	private final int y;

	/**
	 * creates a new position object
	 * @param x {@link #x}
	 * @param y {@link #y}
	 */
	public Position2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return {@link #x}
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return {@link #y}
	 */
	public int getY() {
		return y;
	}
}