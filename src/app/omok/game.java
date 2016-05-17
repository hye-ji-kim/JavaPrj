package app.omok;

public class game {

	public static void main(String[] args) {

		Board board = new Board();

		while(true)
		{
			board.print();
			Stone stone = new Stone();
			stone.input();
			stone.put(board.getBuf());
			boolean duplicated = board.duplicate(stone);
			board.add(stone);
		}
	}

}
