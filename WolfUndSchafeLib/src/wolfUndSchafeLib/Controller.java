package wolfUndSchafeLib;

/**
 * Controller interface for Wolf und Schafe.
 * 
 * @author Floeze
 */
public interface Controller {

	/**
	 * Class for setting the mode
	 */
	public static class Mode {

		/**
		 * sets, whether the game is singleplayer
		 */
		public final boolean single;
		/**
		 * sets, whether the computer is the wolf. only important when the game is
		 * multiplayer and thus {@link #single} = false. if the game is singleplayer,
		 * this has no meaning and can be ignored.
		 */
		public final boolean wolf;
		/**
		 * sets the starting position of the wolf
		 */
		public final Position2D position;

		/**
		 * Constructor for the mode
		 * 
		 * @param single   {@link #single}
		 * @param wolf     {@link #wolf}
		 * @param position {@link #position}
		 */
		public Mode(boolean single, boolean wolf, Position2D position) {
			this.single = single;
			this.wolf = wolf;
			this.position = position;
		}

		/**
		 * {@link Controller.Mode#Mode(boolean, boolean, Position2D)} <br>
		 * {@code new Mode(single, wolf, new Position2D(wx, wy));}
		 * 
		 * @param single {@link #single}
		 * @param wolf   {@link #wolf}
		 * @param wx     {@link #position}
		 * @param wy     {@link #position}
		 */
		public Mode(boolean single, boolean wolf, int wx, int wy) {
			this(single, wolf, new Position2D(wx, wy));
		}
	}

	// public void setMode(boolean single, boolean wolf, int wx, int wy);
	/**
	 * Sets the Mode for the game
	 * 
	 * @param mode {@link Controller.Mode}
	 */
	public void setMode(Mode mode);

	/**
	 * executes a zug for the wolf
	 * 
	 * @param pos position for the wolf to move to
	 */
	public void wolfsZug(Position2D pos);

	/**
	 * executes a zug for the schaf
	 * 
	 * @param sid id of the schaf to change the position for
	 * @param pos position for the schaf to move to
	 */
	public void schafsZug(int sid, Position2D pos);

	/**
	 * resets the game
	 */
	public void reset();
}