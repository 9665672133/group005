drop procedure if exist prog1;/* grop if esxist*/
delimiter $
create procedure prog1(in x int)/* input paramer*/
begin
  declare a int;
 select id into a from student where id=x;
 if a is not null then
       call p5(x);
	else	
       select "student not found ..", "message";
	end if;   
 end $
delimiter ;

drop procedure if exists p5;
delimiter $
create procedure p5(x int)
begin
select * from student, student_qualifications where student.id=student_qualifications.studentid;
end $ 
delimiter ;


