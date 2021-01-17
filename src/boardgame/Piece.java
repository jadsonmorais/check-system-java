package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
		/*position = null apenas para enfatizar, pois quando n�o 
		 * atribu�do o valor, a IDE do Java j� determina o valor como NULL*/
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
