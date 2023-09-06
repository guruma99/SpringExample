package kr.kdata.member.vo;

import lombok.Data;

/*
 CREATE TABLE MEMBER(
	ID NUMBER PRIMARY KEY , --키피드
	USERID VARCHAR2(50) UNIQUE NOT NULL,
	PASSWORD VARCHAR2(50) NOT NULL,
	USERNAME VARCHAR2(50) NOT NULL,
	PHONE VARCHAR2(50) NOT NULL,
	EMAIL VARCHAR2(50) NOT NULL,
	POSTCODE VARCHAR2(10) NOT NULL,
	ADDR1 VARCHAR2(100) NOT NULL,
	ADDR2 VARCHAR2(100) NOT NULL,
	USE NUMBER DEFAULT 0 --(0은 미인증, 1은 인증, 2는 휴면계정을 나타냄)	
);*/

@Data
public class MemberVO {
	private int id;
	private String userid;
	private String password;
	private String username;
	private String phone;
	private String email;
	private String postcode;
	private String addr1;
	private String addr2;
	private int use;
	//테이블에는 없지만 로그인 화면에서 사용하기 위해서 등록
	private boolean saveID;
}
