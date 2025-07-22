# Write your MySQL query statement below
-- select e.name from Employee as e
-- join Employee as m
-- on e.id = m.id;

select name from employee where id in
(select managerId from employee group by managerId
having (count(distinct id)>=5));