package boardgame;

public class Position {
	
	private int line;
	private int column;
	
	public Position() {
		
	}

	public Position(int line, int column) {
		this.line = line;
		this.column = column;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return line + ", " + column;
	}

	
}
