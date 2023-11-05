package com.udemy.chess.pieces;

import com.udemy.boardgame.Board;
import com.udemy.chess.ChessPiece;
import com.udemy.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "R";
	}
	
	
}
