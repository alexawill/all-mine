import java.util.Scanner;
public class View extends Model {
	static Scanner input = new Scanner(System.in);
	public static void main (String [] args) {

		Model Model = new Model();

		while (Controller.moveCount() <=9 && Controller.getStatus() == Model.IN_PROGRESS){
			if (Controller.moveCount() % 2 == 0){
				System.out.println("Enter the row and column of your move: ");
				int row = input.nextInt();
				int col = input.nextInt();

				if ((row >= 0 && row <=2) && (col >= 0 && col <= 2)) {

					if (Controller.isEmpty(row,col) == true) {
						Controller.makeMove(Cell.X, row, col);
						System.out.print("=============\n| " + board[0][0].toString() + " | "
								+ board[0][1].toString() + " | " + board[0][2].toString()
								+ " |\n=============\n| " + board[1][0].toString() + " | "
								+ board[1][1].toString() + " | " + board[1][2].toString()
								+ " |\n=============\n| " + board[2][0].toString() + " | "
								+ board[2][1].toString() + " | " + board[2][2].toString()
								+ " |\n=============\n");

						if (Controller.getStatus() == Controller.X_WINS){
							System.out.println("X WINS!!!");
						}
						if (Controller.getStatus() == Controller.O_WINS){
							System.out.println("O WINS!!!");
						}
						if (Controller.getStatus() == Controller.DRAW){
							System.out.println("TIE");
						}
					}
					else System.out.println("OCCUPIED!");
				}
				else System.out.println("ILLEGAL LOCATION!");
			}
			else{
				System.out.println("Enter the row and column of your move: ");
				int row = input.nextInt();
				int col = input.nextInt();
				if ((row >= 0 && row <=2) && (col >= 0 && col <= 2)) {

					if (Controller.isEmpty(row,col) == true) {
						Controller.makeMove(Cell.O, row, col);
						System.out.print("=============\n| " + board[0][0].toString() + " | "
								+ board[0][1].toString() + " | " + board[0][2].toString()
								+ " |\n=============\n| " + board[1][0].toString() + " | "
								+ board[1][1].toString() + " | " + board[1][2].toString()
								+ " |\n=============\n| " + board[2][0].toString() + " | "
								+ board[2][1].toString() + " | " + board[2][2].toString()
								+ " |\n=============\n");
						if (Controller.getStatus() == Model.X_WINS){
							System.out.println("X WINS!!!");
						}
						if (Controller.getStatus() == Model.O_WINS){
							System.out.println("O WINS!!!");
						}
						if (Controller.getStatus() == Model.DRAW){
							System.out.println("TIE");
						}  
					}
					else System.out.println("OCCUPIED!");
				}
				else System.out.println("ILLEGAL LOCATION!");
			}   
		} 
	}// main
}//class
