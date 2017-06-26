package board.model;

import java.util.Date;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardArticle;
	private Date boardDate;
	
	
	@Override
	public String toString() {
		return "board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardArticle=" + boardArticle
				+ ", boardDate=" + boardDate + "]";
	}
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardArticle() {
		return boardArticle;
	}
	public void setBoardArticle(String boardArticle) {
		this.boardArticle = boardArticle;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	
}
