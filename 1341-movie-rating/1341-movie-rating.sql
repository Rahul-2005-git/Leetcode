# Write your MySQL query statement below
(
    select t1.name as results from

(select count(*) as count,u.user_id,u.name 

from MovieRating mr
left join users u
on mr.user_id=u.user_id

group by u.user_id
 ) t1
ORDER BY t1.count DESC, t1.name ASC
LIMIT 1
)

union all

(
select t2.title 
from 
(select avg(mr.rating) as avg,m.movie_id,m.title ,created_at

from MovieRating mr
left join Movies m
on mr.movie_id=m.movie_id

where month(mr.created_at)=2 and year(mr.created_at)=2020
-- where mr.created_at >= '2020-02-01' AND mr.created_at <= '2020-02-29'
group by m.movie_id

) t2

order by t2.avg desc , t2.title asc
LIMIT 1
)
;

 
