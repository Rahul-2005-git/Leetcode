# Write your MySQL query statement below

select query_name,
 ROUND(avg(rating/position) ,2)
 as quality,
round(
-- (((
--     select count(*) from queries q2 
--     where q2.rating < 3 
--     and q1.query_name=q2.query_name))
-- *100/count(q1.result)),2) 
SUM(rating < 3) * 100.0 / COUNT(*),
        2
        )
as poor_query_percentage
from queries q1
group by query_name;