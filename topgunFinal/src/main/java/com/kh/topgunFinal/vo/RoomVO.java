package com.kh.topgunFinal.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class RoomVO { 
	private int roomNo;
	private String roomName;
	private Timestamp roomCreated;
	private String join; //채팅방 입장 여부를 알기 위해 추가
	private String airlineName; //채팅방 목록을 항공사별로 띄우기 위해 추가
}
