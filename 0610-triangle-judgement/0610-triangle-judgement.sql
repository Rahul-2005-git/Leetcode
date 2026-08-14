# Write your MySQL query statement below
select x,y,z,
-- case
-- when (x<y+z and y<x+z and z<x+y) then "Yes"
-- else "No"
-- END

if(x+y>z and y+z>x and z+x>y,'Yes','No') 
as triangle 

from triangle ;