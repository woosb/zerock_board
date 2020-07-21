package org.zerock.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data // lombok을 이용해서 getter/setter, toString() 등을 생성한다.
public class BoardVO {
	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	
	private int replyCnt;
	
	private List<BoardAttachVO> attachList;
	
}
