
public class Controller extends Model{


	/**
	 * Makes a move in the indicated location
	 **/
	public static void makeMove(int player, int row, int col) {
		if (player != Cell.X && player != Cell.O)
			throw new IllegalArgumentException("Invalid player value: "
					+ player);
		else if (row < 0 || row > 2)
			throw new IllegalArgumentException("Illegal row value: " + row);
		else if (col < 0 || col > 2)
			throw new IllegalArgumentException("Illegal column value: " + col);
		else
			board[row][col].setCell(player);
	}

	/**
	 * indicates whether a given position is empty for a move
	 * 
	 * @param row
	 *            the zero-based row
	 * @param col
	 *            the zero-based column
	 * @return true if the position is vacant, false otherwise
	 **/
	public static boolean isEmpty(int row, int col) {
		return Model.board[row][col].getCell() == Cell.EMPTY;
	}

	
	 //indicates the current status of the game
	
	public static int getStatus() {

		// test for a row of all X's or O's
		for (int i = 0; i < 3; i++)
			if (board[i][0].equals(board[i][1])
					&& board[i][1].equals(board[i][2]))
				if (board[i][0].getCell() == Cell.X)
					return X_WINS;
				else if (board[i][0].getCell() == Cell.O)
					return O_WINS;

		// test for a column of all X's or O's
		for (int i = 0; i < 3; i++)
			if (board[0][i].equals(board[1][i])
					&& board[1][i].equals(board[2][i]))
				if (board[0][i].getCell() == Cell.X)
					return X_WINS;
				else if (board[0][i].getCell() == Cell.O)
					return O_WINS;

		// test for a diagonal of all X's or O's
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])
				|| board[0][2].equals(board[1][1])
				&& board[1][1].equals(board[2][0]))
			if (board[1][1].getCell() == Cell.X)
				return X_WINS;
			else if (board[1][1].getCell() == Cell.O)
				return O_WINS;

		// test for the existence of a EMPTY space
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (board[i][j].getCell() == Cell.EMPTY)
					return IN_PROGRESS;

		// if we hit this point in the method, we've ruled out a win
		// or IN_PROGRESS
		return DRAW;
	}

	/**
	 * Returns the number of moves made in the game so far.
	 * 
	 * @return number of occupied cells in the grid
	 */
	public static int moveCount() {
		int playedCellCount = 0;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (board[i][j].getCell() != Cell.EMPTY)
					playedCellCount++;
		return playedCellCount;
	}
}
