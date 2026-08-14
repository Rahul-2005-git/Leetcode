# Write your MySQL query statement below
select Round( sum(
    case
    when a1.event_date=DATE_ADD(a2.event_date, INTERVAL 1 DAY) then 1
    else 0
    end

)/ count(distinct a1.player_id)
,2)
as fraction
 from activity 
a1
left join
(
    select player_id , min(event_date) as event_date from activity 
group by player_id
) a2
on a1.player_id = a2.player_id ;