select d.department_name,e.name,e.salary
from employees as e
 join departments as d
 on e.department_id=d.department_id
  where e.salary =(select max(e1.salary)
                  from employees as e1
                   where e1.department_id=d.department_id);
                   
select e.name,e.employee_id,count(project_id)
 from employees as e
  join employeeprojects as p
   on e.employee_id=p.employee_id
    group by e.employee_id,e.name
     having count(project_id) >1;	
     
select project_name,e.name
 from projects as p
  join employeeprojects as ep 
   on p.project_id=ep.project_id
    join employees e
     on e.employee_id=ep.employee_id;
     
select c.customer_name,count(c.customer_name)
 from customers as c
  join orders as o
   on c.customer_id=o.customer_id
    group by c.customer_name
     having count(c.customer_name)>1;

select c.customer_name,sum(ord.quantity*p.price) as final
  from customers as c 
   join orders as o
    on c.customer_id=o.customer_id
     join orderdetails as ord
       on ord.order_id=o.order_id
        join products as p
         on p.product_id=ord.product_id
          group by c.customer_name
          order by final desc
           limit 1;
          

