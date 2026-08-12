# Write your MySQL query statement below
select t1.id,
case
when t1.p_id is null then "Root"
when  t1.id in(select t2.p_id from Tree t2 ) then "Inner"
else "Leaf"
end
as type
from Tree t1;