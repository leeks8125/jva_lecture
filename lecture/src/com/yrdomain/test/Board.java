package com.yrdomain.test;

public class Board {
	String name;
	int like;
	int time;
	String share;
	String comment;
	String more;
	
	public Board(String name,int like,String share,String comment,String more,int time) {
		this.name = name;
		this.like = like;
		this.share = share;
		this.comment = comment;
		this.more = more;	
		this.time = time;
		
	}
	//올린 시간
	public void cktime() {
		System.out.println();
	}
	//올린사람 
	public void ckname() {
		System.out.println();
	}
	//좋아요누름
	public void cklike() {
		System.out.println();
	}
	//댓글보기
	public void ckcomment() {
		System.out.println();
	}
	//댓글쓰기
	public void writcomment() {
		System.out.println();
	}
	//공유하기
	public void ckshare() {
		System.out.println();
	}
	//더보기
	public void ckmore() {
		System.out.println();
	}
}


