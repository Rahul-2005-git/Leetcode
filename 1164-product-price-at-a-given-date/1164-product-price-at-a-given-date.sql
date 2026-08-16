# Write your MySQL query statement below
select p1.product_id ,case
when p2.change_date then p1.new_price
else 10
end
 as price from products p1
left join
(select product_id,max(change_date)as change_date from Products 
where change_date<'2019-08-17'
group by product_id

)
p2 
on p1.product_id=p2.product_id
where p2.change_date=p1.change_date or p2.change_date is null

group by p1.product_id
;