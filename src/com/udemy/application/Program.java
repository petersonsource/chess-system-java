package com.udemy.application;

import com.udemy.boardgame.Board;
import com.udemy.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		Board board = new Board(8, 8);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
//		Position  position = new Position(1, 2);
//		System.out.println(position);

	}

}
