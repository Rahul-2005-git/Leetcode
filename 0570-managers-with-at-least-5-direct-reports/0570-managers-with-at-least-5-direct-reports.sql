# Write your MySQL query statement below

select e.name from employee e right join employee m 
on m.managerId=e.id group by e.id having count(e.id)>=5;