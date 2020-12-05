select name, count(referee_id)
from customer
group by name;
select name, bonus
from Employee E
         left outer join Bonus B on E.empId = B.empId;

select name, bonus
from Employee E
         left outer join Bonus B on E.empId = B.empId
where bonus < 1000
   or bonus is null;

select actor_id, director_id
from ActorDirector
group by actor_id, director_id
having count(actor_id) >= 3;

# 1435. 制作会话柱状图
select a.bin as bin, count(b.bin) as total
from (select '[0-5>' as bin
      union
      select '[5-10>' as bin
      union
      select '[10-15>' as bin
      union
      select '15 or more' as bin) a
         left join

     (select case
                 when duration >= 0
                     and duration < 5 * 60 then '[0-5>'
                 when duration >= 5 * 60 and duration < 10 * 60 then '[5-10>'
                 when duration >= 10 * 60 and duration < 15 * 60 then '[10-15>'
                 when duration >= 15 * 60 then '15 or more'
                 else 'other' end as bin
      from Sessions) b on a.bin = b.bin
group by a.bin;


# 175. 组合两个表
select FirstName, LastName, City, State
from Person P
         left outer join Address A on P.PersonId = A.PersonId;




