# Write your MySQL query statement below

select 
round((count(*) * 100)/
(select count(distinct customer_id) from delivery) ,2)
as immediate_percentage
from Delivery d2
right join
(
    select customer_id,min(order_date) as order_date from delivery 
    group by customer_id
    
) d1
on d1.order_date=d2.order_date and d1.customer_id=d2.customer_id
where d1.order_date=d2.customer_pref_delivery_date ;