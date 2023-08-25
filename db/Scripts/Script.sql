select dbms_xdb.gethttpport as "HTTP-Port" from dual;
 begin
dbms_xdb.sethttpport('22222');
end;
-- hr 계정 락 해제
alter user hr account unlock;
-- hr 계정 암호 변경
alter user hr identified by "123456";