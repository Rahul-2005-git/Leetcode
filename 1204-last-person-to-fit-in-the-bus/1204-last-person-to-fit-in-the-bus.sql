# Write your MySQL query statement below
select q1.person_name 
from
(SELECT
    person_name,
    weight,
    turn,
    SUM(weight) OVER (ORDER BY turn) AS total_weight
FROM Queue
) q1
where q1.total_weight<=1000
order by total_weight desc limit 1;
