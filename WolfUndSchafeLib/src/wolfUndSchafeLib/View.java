package wolfUndSchafeLib;

/**
 * View interface for Wolf und Schafe
 * 
 * @author Floeze
 */
public interface View {

	/**
	 * sets the position of the wolf
	 * 
	 * @param pos {@link Position2D} to set the position of the wolf to
	 */
	public void setWolf(Position2D pos);

	/**
	 * sets the position of the schaf
	 * 
	 * @param sid id of the schaf to change the position for
	 * @param pos {@link Position2D} to set the position of the schaf with id
	 *            {@code sid} to
	 */
	public void setSchaf(int sid, Position2D pos);

	/**
	 * sets the active player
	 * 
	 * @param player {@link Player} active player
	 */
	public void activePlayer(Player player);

	/**
	 * shows the winner
	 * 
	 * @param player {@link Player} winner
	 */
	public void showWinner(Player player);
}