package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int line;
	public ChessPosition(char column, int line) {
		if(column<'a' || column>'h' || line<1 || line>8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.line = line;
	}
	
	public char getColumn() {
		return column;
	}
	
	public int getLine() {
		return line;
	}
	
	protected Position toPosition() {
		return new Position(8 - line, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getLine());
	}
	
	@Override
	public String toString() {
		return "" + column + line;
	}

}
