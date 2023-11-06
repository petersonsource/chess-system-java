package com.udemy.chess;

import com.udemy.boardgame.BoardException;

public class ChessException extends BoardException{

	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}

}
