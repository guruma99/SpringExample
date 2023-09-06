-- 회원관리
-- 시퀀스
CREATE SEQUENCE MEMBER_ID_SEQ;

--테이블
--사용자 아이디
--비밀번호
--이름
--전화
--이메일
--우편번호
--일반주소1
--상세주소

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
);

DELETE FROM MEMBER;

INSERT INTO MEMBER VALUES (
	MEMBER_ID_SEQ.NEXTVAL, 'admin', 'admin', '최고관리자', ' ',' ',' ',' ',' ', 0
);

INSERT INTO MEMBER VALUES (
	MEMBER_ID_SEQ.NEXTVAL, 'root', 'root', '최고관리자', ' ',' ',' ',' ',' ',0
);

INSERT INTO MEMBER VALUES (
	MEMBER_ID_SEQ.NEXTVAL, 'master', 'master', '최고관리자', ' ',' ',' ',' ',' ',0
);

INSERT INTO MEMBER VALUES (
	MEMBER_ID_SEQ.NEXTVAL, 'webmaster', 'webmaster', '최고관리자', ' ',' ',' ',' ',' ',0
);

SELECT * FROM MEMBER;


