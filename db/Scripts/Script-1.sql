SELECT *  FROM tab;

begin
dbms_xdb.sethttpport('22222');
end;

select dbms_xdb.gethttpport as "HTTP-Port" from dual;

