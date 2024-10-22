package com.kh.topgunFinal.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class WebsocketResponseVO {
	private String type = "chat";
	private String senderUsersId;
	private String senderUsersType;
	private String content;
	private LocalDateTime time;
}