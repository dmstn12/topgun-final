package com.kh.topgunFinal.vo;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class WebsocketMessageVO {
	private int no;
	private int roomNo;
	private String type;
	private String senderUsersId; //발신자
	private String senderUsersType; //발신자의 등급
	private String receiverUsersId; //수신자
	private String content; //내용
	private Timestamp time; //보낸 시각
}
