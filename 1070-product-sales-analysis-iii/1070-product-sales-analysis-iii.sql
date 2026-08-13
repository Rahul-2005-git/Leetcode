# Write your MySQL query statement below

select product_id, year as first_year,quantity, price
from sales 
 where (product_id ,year) in
(
    select s2.product_id ,min(s2.year) as year
from Sales s2 
group by s2.product_id
);
