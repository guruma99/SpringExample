SELECT * FROM tab;

-- 시퀀스를 만들자
CREATE SEQUENCE person_idx_seq;
-- 테이블을 만들자
CREATE TABLE person(
   idx NUMBER PRIMARY KEY,
   name varchar2(100) NOT NULL,
   age NUMBER DEFAULT 0
);

INSERT INTO person VALUES (person_idx_seq.nextval,'한사람',22);
INSERT INTO person VALUES (person_idx_seq.nextval,'두사람',18);
INSERT INTO person VALUES (person_idx_seq.nextval,'세사람',29);
INSERT INTO person VALUES (person_idx_seq.nextval,'네사람',31);
INSERT INTO person VALUES (person_idx_seq.nextval,'오사람',19);

SELECT * FROM person;

create table memo(
	id number primary key,
	name varchar2(60) not null,
	password varchar2(60) not null,
	content varchar2(300) not null,
	regDate timestamp default sysdate,
	ip varchar2(50) not null);
	
create sequence memo_id_seq;

INSERT INTO memo 
values(memo_id_seq.nextval, 
'한사람','1234','와 일빠다...',sysdate,'192.168.0.20');

INSERT INTO memo 
values(memo_id_seq.nextval, 
'두사람','1234','와 이빠다...',sysdate,'192.168.0.20');

INSERT INTO memo 
values(memo_id_seq.nextval, 
'세사람','1234','와 삼빠다...',sysdate,'192.168.0.20');

INSERT INTO memo 
values(memo_id_seq.nextval, 
'네사람','1234','와 사빠다...',sysdate,'192.168.0.20');









