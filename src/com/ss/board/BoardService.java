package com.ss.board;

import java.util.ArrayList;

public class BoardService {

	public ArrayList<BoardDTO> boardList() throws Exception {
		
		BoardDAO boardDAO = new BoardDAO();
		ArrayList<BoardDTO> ar=boardDAO.getList();
		return ar;
	}
}
