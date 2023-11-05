package com.udemy.chess;

import com.udemy.boardgame.Board;
import com.udemy.boardgame.Position;
import com.udemy.chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat =  new ChessPiece[board.getRows()][board.getColumns()];
		for(int i= 0; i < board.getRows(); i++) {
			for(int j=0; j< board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
			
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePeace(new Rook(board, Color.WRITE), new Position(2, 1));
	}
	
}
