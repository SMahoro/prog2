package uebungen.uebung2;

public class TestTicTacToe {

	public static void main(String[] args) {
TicTacToe ttt= new TicTacToe();
ttt.print();
ttt.makeMove(1, 1, State.RED);
ttt.print();
ttt.makeMove(1, 2, State.BLACK);
ttt.print();
ttt.makeMove(1, 1, State.BLACK);
ttt.print();
ttt.makeMove(0, 0, State.RED);
ttt.print();
ttt.makeMove(2, 2, State.RED);
ttt.print();


	}

}
