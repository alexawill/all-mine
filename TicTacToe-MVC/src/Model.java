

public class Model {
	/** This value indicates that X has won the game **/
	public static final int X_WINS = 0;
	/** This value indicates that O has won the game **/
	public static final int O_WINS = 1;
	/** This value indicates that the game has ended in a tie **/
	public static final int DRAW = 2;
	/** This value indicates that the game is in progress **/
	public static final int IN_PROGRESS = 3;

	public static Cell[][] board;

	/**
	 * Constructs a tic-tac-toe board with no moves yet made.
	 **/
	public Model() {
		// allocate the board
		board = new Cell[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[i][j] = new Cell();
		// initialize the board
		reset();
	}
	public class Cell {
		/** This value means empty **/
		public static final int EMPTY = 0;
		/** This value means X **/
		public static final int X = 1;
		/** This value means O **/
		public static final int O = 2;

		private int c;

		/**
		 * constructs an empty cell, the content of which will be Cell.EMPTY
		 **/
		public Cell() {
			c = EMPTY;
		}

		/**
		 * sets the content of this cell
		 * 
		 * @param value
		 *            the desired content of the cell, either Cell.X, Cell.O, or
		 *            Cell.EMPTY
		 **/
		public void setCell(int value) {
			c = value;
		}

		/**
		 * gets the content of this cell
		 * 
		 * @returns an int containing the content of the cell, either Cell.X,
		 *          Cell.O, or Cell.EMPTY
		 **/
		public int getCell() {
			return c;
		}

		/**
		 * indicates whether the parameter contains the same content as this Cell.
		 * 
		 * @param c1
		 *            a cell
		 * @return true if c1 contains the same content as this Cell, false
		 *         otherwise
		 **/
		public boolean equals(Cell cl) {
			return this.c == cl.c;
		}

		/**
		 * returns the contents of a given cell as a String
		 * 
		 * @return a String containing X, O, or a space
		 **/
		public String toString() {
			if (c == X)
				return "X";
			else if (c == O)
				return "O";
			else
				return " ";
		}
	}
	/**
	 * Resets all 9 squares on the board
	 **/
	public void reset() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				board[i][j].setCell(Cell.EMPTY);
	}
}