package com.ss.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ss.util.DBConnector;

public class BoardDAO {
	
	ArrayList<BoardDTO> ar = new ArrayList<BoardDTO>();
	public ArrayList<BoardDTO> getList() throws Exception{
		DBConnector db = new DBConnector();
		Connection con = db.getConnect();
		
		String sql = "select * from board order by num desc";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();

		while(rs.next()) {
			BoardDTO boardDTO= new BoardDTO();
			boardDTO.setNum(rs.getLong(1));
			boardDTO.setTitle(rs.getString(2));
			boardDTO.setWriter(rs.getString(3));
			boardDTO.setContents(rs.getString(4));
			boardDTO.setDate(rs.getDate(5));
			boardDTO.setHit(rs.getLong(6));
			ar.add(boardDTO);
		}
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}
}
