CREATE OR REPLACE PROCEDURE  tomul(x IN number,y out number)
AS 
BEGIN
     y:=x*x;
end;
/