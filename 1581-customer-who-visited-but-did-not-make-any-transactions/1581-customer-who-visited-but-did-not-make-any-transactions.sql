# Write your MySQL query statement below
SELECT v.customer_id , count(v.visit_id) AS count_no_trans FROM Visits v Left JOIN 
Transactions t ON t.visit_id=v.visit_id 
WHERE amount is NULL GROUP BY v.customer_id;