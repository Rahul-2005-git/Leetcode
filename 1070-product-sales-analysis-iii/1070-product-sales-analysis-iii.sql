# Write your MySQL query statement below

select s1.product_id, s.year as first_year,s1.quantity, s1.price
from sales s1
join 
(
    select s2.product_id ,min(s2.year) as year
from Sales s2 
group by s2.product_id
) s
on s1.product_id=s.product_id and
s.year=s1.year;
