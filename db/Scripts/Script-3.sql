-- 오라클의 새로운 유저 생성하기
-- CREATE user [id] identified by [pw]
CREATE USER bootuser IDENTIFIED BY 123456;

-- 접속 권한 지정해줘야만 접속이 가능하다.
-- grant [권한] to id;
GRANT CONNECT, resource TO bootuser;