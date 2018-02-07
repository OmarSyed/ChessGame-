import java.util.ArrayList;

public class ChessGameTreeNode {
	private Pieces[] Board; 
	private double winProb; 
	private double loseProb;
	private double drawProb; 
	private int currentTurn; //0 = white, 1 = black
	private int gameWon; //0 = no, 1 = yes
	private int winner; //0 = white, 1 = black
	private int player; //0 = white, 1 = black
	private ArrayList<Pieces[]> configurations; 
	
	public ChessGameTreeNode(){
		
	}
	public ChessGameTreeNode(Pieces[] Board, double winProb, double loseProb, double drawProb, int currentTurn, int gameWon, int winner, ArrayList<Pieces[]> configurations){
		this.Board = Board; 
		this.winProb = winProb;
		this.loseProb = loseProb; 
		this.drawProb = drawProb; 
		this.currentTurn = currentTurn; 
		this.gameWon = gameWon; 
		this.winner = winner; 
		this.configurations = configurations; 
	}
	
	public void movePiece(Pieces piece, int currentposition, int nextposition){
		if (player == 0){
			switch(piece){
			case blackPawn:
				//if ()
				break;
			case blackKnight:
				break;
			case blackBishop:
				break; 
			case blackKing:
				break;
			case blackQueen:
				break;
			case whitePawn:
				break;
			case whiteKnight:
				break;
			case whiteBishop:
				break;
			case whiteKing:
				break;
			case whiteQueen:
				break;
			case empty:
				break;
			}
		}
		else{
			switch(piece){
			case blackPawn:
				
				break;
			case blackKnight:
				break;
			case blackBishop:
				break; 
			case blackKing:
				break;
			case blackQueen:
				break;
			case whitePawn:
				break;
			case whiteKnight:
				break;
			case whiteBishop:
				break;
			case whiteKing:
				break;
			case whiteQueen:
				break;
			case empty:
				break;
			}
		}
	}
	public void newMoves(Pieces[] Board){
		if (currentTurn == 0){
			
		}
		else{
			
		}
	}
	
}
