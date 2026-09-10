# Write your MySQL query statement below

select d.name as Department ,e2.name as Employee , e2.salary from Employee e2

join Department d
on d.id=e2.departmentId
where e2.salary =
(
    select max(salary) from employee e1
where e1.departmentId=e2.departmentId
) 




-- having e.salary=max(e.salary)
;