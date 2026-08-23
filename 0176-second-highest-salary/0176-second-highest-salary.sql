# Write your MySQL query statement below

select max(e1.salary) as SecondHighestSalary from Employee e1
left join
(select max(salary)as salary from Employee) e2
on e1.salary=e2.salary
where e2.salary is null;
