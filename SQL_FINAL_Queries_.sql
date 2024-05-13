create database carDealership2;

use carDealership2;

create table department ( 
    dep_id int identity(1,1) primary key,
    dep_name varchar(50) not null ,
    max_emp_num int not null,
);

create table employee (
    emp_id int identity(2000,1) primary key,
    emp_nid BIGINT unique not null,
    emp_fname varchar(20) not null,
    emp_lname varchar(20) not null,
    emp_email varchar(100) unique not null,
    hire_date date not null,
    contract_duration int not null, --number of months
    salary int not null,
    bonus int not null,
    dep_id int not null foreign key references department (dep_id),
	Manager_ID int foreign key references employee (emp_id)
 
);

create table emp_phone (
    emp_id int not null foreign key references employee(emp_id) on update cascade,
    phone_num BIGINT unique,
    constraint emp_phone_pk primary key(emp_id, phone_num)
);

alter table department add Manager_ID int foreign key references employee (emp_id) on update cascade on delete set null; 

create table account (
    emp_id int not null foreign key references employee(emp_id) on update cascade,
    emp_password varchar(20) not null,
    constraint account_pk primary key(emp_id, emp_password)
);

create table branch (
    branch_id  int identity(1,1) primary key,
    no_of_cars int,
    city varchar(50) not null,
    street varchar(255) not null,
    Manager_ID int foreign key references employee(emp_id) on update cascade
on delete set null,
    constraint branch_unq unique (city, street)
);

alter table employee
add branch_id int not null foreign key references branch(branch_id)


create table client (
    client_nid BIGINT primary key,
    client_fname varchar(20) not null,
    client_lname varchar(20) not null,
    client_email varchar(100) unique not null 
);

create table client_phone (
    client_nid BIGINT not null foreign key references client(client_nid) on update cascade,
    client_phone_num BIGINT unique,
    constraint client_phone_pk primary key(client_nid, client_phone_num)
);

create table car (
    chasis_num varchar(10) primary key,
    car_name varchar(50), 
    car_type varchar(50),
    car_model varchar(50),
    car_year int not null,
    engine varchar(50),
    eng_cap int,
    no_seats int,
    region varchar(50),
    price int not null,
    gear_box varchar(50),
    tyre_size varchar(50),
    headlight_type varchar(50),
    branch_id int foreign key references branch (branch_id) on update cascade
on delete set null
);

create table order_car (
    order_id BIGINT identity(8000,1) primary key,
    order_date date not null,
    emp_id int not null foreign key references employee(emp_id), 
    chasis_num varchar(10) foreign key references car (chasis_num) on update cascade on delete set null,
    client_nid BIGINT not null foreign key references client (client_nid)
);

create table maintenance_order (
    maint_id BIGINT identity(7000,1) primary key,
    maint_date date not null,
    client_nid BIGINT not null foreign key references client(client_nid),
    chasis_num varchar(10)  null foreign key references car(chasis_num) on update cascade on delete set null,
    car_problems varchar(1000),
    maint_price int not null,
    warranty int not null check (warranty in (0, 1)) --boolean value
);

---login check ( sales  &&  HR  && Maintain ) return the department name


SELECT a.*, d.dep_name
FROM account a
LEFT JOIN employee e ON a.emp_id = e.emp_id
LEFT JOIN department d ON e.dep_id = d.dep_id
WHERE a.emp_id = 2004 AND a.emp_password = 'sis';

-- login check (manager)

SELECT 
    a.*, 
    (SELECT e.Manager_ID FROM employee e WHERE e.emp_id = 2004) AS Manager_ID
FROM 
    account a 
WHERE 
    a.emp_id = 2006 AND a.emp_password = 'sis';


--add departments

insert into department (dep_name, max_emp_num)
values('sales', 100);

insert into department (dep_name, max_emp_num)
values('hr', 10);

insert into department (dep_name, max_emp_num)
values('maintenance', 100);

insert into department (dep_name, max_emp_num)
values('testing', 34);

--add branch
insert into branch ( no_of_cars, city, street)
values ( 50, 'nasr city', 'nadi ahli');

insert into branch ( no_of_cars, city, street)
values ( 50, 'heliopolis', 'korba');


-- add manager
select branch_id from branch
where branch_id = 1

select dep_id from department
where dep_id = 3

insert into employee (emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, branch_id)
values ( 2324567658, 'John', 'Doe', 'johndoe@gmail.com', '2020-07-16', 12, 50000, 2000, 1, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),01015344705)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'de7a_trix')



--manager 2
select branch_id from branch
where branch_id = 2

select dep_id from department
where dep_id = 1

insert into employee (emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, branch_id)
values ( 2300567658, 'John', 'Silvestre', 'josil@gmail.com', '2020-07-16', 22, 50000, 2000, 1, 2);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),01279999700)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'pass')

--manager 3
select branch_id from branch
where branch_id = 1

select dep_id from department
where dep_id = 3

insert into employee (emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, branch_id)
values ( 230056767, 'Nadia', 'Daou', 'naddaou@gmail.com', '2020-07-16', 28, 7000, 2000, 3, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),012765444333)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'passw')

--manager 4
select branch_id from branch
where branch_id = 1

select dep_id from department
where dep_id = 2

insert into employee (emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, branch_id)
values ( 938719740, 'Bashmohandesa', 'Dalia', 'Dalia@gmail.com', '2020-07-16', 28, 7000, 2000, 2, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),33287878903)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'dal123')


--add employee
select branch_id from branch
where branch_id = 1

select Manager_ID from employee
where emp_id = 2000 and Manager_ID=null 

select dep_id from department
where dep_id = 1

insert into employee ( emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, Manager_ID,branch_id)
values ( 378652652625, 'Omar', 'Fadel', 'omaarfadel@gmail.com', '2020-09-16', 15, 50000, 2000, 1, 2000, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),01278801088)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'fasel')


select branch_id from branch
where branch_id = 1

select Manager_ID from employee
where emp_id = 2000 and Manager_ID=null 

select dep_id from department
where dep_id = 1

insert into employee ( emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, Manager_ID,branch_id)
values ( 123652652625, 'Youssef', 'Sakr', 'youssefsakr@gmail.com', '2018-09-16', 15, 50000, 2000, 1, 2000, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),0127884589)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'sis')



select branch_id from branch
where branch_id = 1

select Manager_ID from employee
where emp_id = 2000 and Manager_ID=null 

select dep_id from department
where dep_id = 1

insert into employee ( emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, Manager_ID,branch_id)
values ( 123652650000, 'Ralph', 'Inesson', 'ri@gmail.com', '2018-09-16', 15, 50000, 2000, 1, 2000, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),0127996548)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'ran')


select branch_id from branch
where branch_id = 1

select Manager_ID from employee
where emp_id = 2000 and Manager_ID=null 

select dep_id from department
where dep_id = 1

insert into employee ( emp_nid, emp_fname, emp_lname, emp_email, hire_date, contract_duration, salary, bonus, dep_id, Manager_ID,branch_id)
values ( 123782650000, 'Karim', 'Jamil', 'ki@gmail.com', '2018-09-16', 15, 50000, 2000, 1, 2000, 1);

insert  into emp_phone (emp_id,phone_num) values ((SELECT IDENT_CURRENT('employee')),0124578985)

insert into account (emp_id, emp_password) values ((SELECT IDENT_CURRENT('employee')),'karim')



--add car 
select branch_id from branch
where branch_id = 1;
select chasis_num from car
where chasis_num = 'ABC123XYZ';
insert into car (chasis_num, car_name, car_type, car_model, car_year, engine, eng_cap, no_seats, region, price, gear_box, tyre_size, headlight_type, branch_id)
values ('ABC123XYZ', 'Kia', 'Sedan', 'ModelX', 2012, 'V6 Turbo', 2500, 4, 'North', 35000, 'Automatic', '205/60R16', 'LED', 1);

select branch_id from branch
where branch_id = 1;
select chasis_num from car
where chasis_num = 'DEF123XYZ';
insert into car (chasis_num, car_name, car_type, car_model, car_year, engine, eng_cap, no_seats, region, price, gear_box, tyre_size, headlight_type, branch_id)
values ('DEF123XYZ', 'Kia', 'Sedan', 'ModelA', 2022, 'V4 Turbo', 2500, 4, 'south', 85000, 'Automatic', '205/6898R16', 'LED', 1);

select branch_id from branch
where branch_id = 1;
select chasis_num from car
where chasis_num = 'FGH123XYZ';
insert into car (chasis_num, car_name, car_type, car_model, car_year, engine, eng_cap, no_seats, region, price, gear_box, tyre_size, headlight_type, branch_id)
values ('FGH123XYZ', 'Hyundai', 'Sedan', 'ModelB', 2022, 'V4 Turbo', 2500, 4, 'south', 85000, 'Automatic', '205/6898R16', 'LED', 1);

select branch_id from branch
where branch_id = 1;
select chasis_num from car
where chasis_num = 'JHQ123XYZ';
insert into car (chasis_num, car_name, car_type, car_model, car_year, engine, eng_cap, no_seats, region, price, gear_box, tyre_size, headlight_type, branch_id)
values ('JHQ123XYZ', 'BWM', 'Sedan', 'ModelG', 2022, 'V4 Turbo', 2500, 4, 'south', 85000, 'Automatic', '205/6898R16', 'LED', 1);




--new car sale

select client_nid from client
where client_nid = 23456732823;

insert into client (client_nid, client_fname, client_lname, client_email)
values (234567823, 'motaz', 'ahmed', 'mamama@gmail.com');

select chasis_num from car
where chasis_num = 'JHQ123XYZ';

select emp_id from employee
where emp_id = 2004 and dep_id= 1;

insert into order_car (order_date, emp_id, chasis_num, client_nid)
values ( '2024-01-08', 2004, 'JHQ123XYZ', 234567823);


select client_nid from client
where client_nid = 34567890234;

insert into client (client_nid, client_fname, client_lname, client_email)
values (34567890234, 'youssef', 'sakr', 'sakor@gmail.com');

select chasis_num from car
where chasis_num = 'ABC123XYZ';

select emp_id from employee
where emp_id = 2002 and dep_id= 1;

insert into order_car (order_date, emp_id, chasis_num, client_nid)
values ( '2024-01-08', 2002, 'ABC123XYZ', 34567890234);



select client_nid from client
where client_nid = 34567890200;

insert into client (client_nid, client_fname, client_lname, client_email)
values (34567890200, 'jimmy', 'hel', 'jh@gmail.com');

select chasis_num from car
where chasis_num = 'DEF123XYZ';

select emp_id from employee
where emp_id = 2002  and dep_id= 1;;

insert into order_car (order_date, emp_id, chasis_num, client_nid)
values ( '2024-01-08', 2002, 'DEF123XYZ', 34567890200);




select client_nid from client
where client_nid = 345673456;

insert into client (client_nid, client_fname, client_lname, client_email)
values (345673456, 'jimmy', 'hel', 'jerrtt@gmail.com');

select chasis_num from car
where chasis_num = 'FGH123XYZ';

select emp_id from employee
where emp_id = 2004 and dep_id= 1;

insert into order_car (order_date, emp_id, chasis_num, client_nid)
values ( '2024-01-08', 2002, 'FGH123XYZ', 345673456);

--add car maintain new order 

select client_nid from client
where client_nid = 34567890234;

select chasis_num from car
where chasis_num = 'ABC123XYZ';

insert into maintenance_order ( maint_date, client_nid, chasis_num, car_problems, maint_price, warranty)
values ( '2024-01-07', 34567890234, 'ABC123XYZ', 'Engine issues', 500000, 1);

--search car
select * from car
where chasis_num = 'ABC123XYZ';

--list sold cars by employee
select car.* from order_car
join car on order_car.chasis_num = car.chasis_num
where emp_id = 2004;

--list sold cars
select car.* from order_car
join car on order_car.chasis_num = car.chasis_num;

--list of all employees under manager
select * from employee
where Manager_ID = 2000;

-- search maintain order
select * from maintenance_order
where chasis_num = 'ABC123XYZ';

--list of all employees in a branch
select employee.* from employee
join branch on employee.branch_id = branch.branch_id
where branch.city = 'nasr city' and branch.street = 'nadi ahli';





--delete car
---question
select chasis_num from car where chasis_num = 'ABC123XYZ';
		delete from car where chasis_num = 'ABC123XYZ';
		



--delete branch
--delete all employees then delete the branch
---question
	select city,street from branch where city = 'heliopolis' and street = 'korba';
		--if(Branch(city,street) == user_input_city&street)

delete from emp_phone where emp_id in (
    select emp_id from employee
    where branch_id in (
        select branch_id from branch
        where city = 'heliopolis' and street = 'korba'
    )
);

delete from account where emp_id in (
    select emp_id from employee
    where branch_id in (
        select branch_id from branch
        where city = 'heliopolis' and street = 'korba'
    )
);

delete from employee where branch_id in (
    select branch_id from branch
    where city = 'heliopolis' and street = 'korba'
);


delete from branch where city = 'heliopolis' and street = 'korba';

--delete department
---question
select dep_name from department where dep_name = 'testing';
	--if(departname == user_input_department_name)

	delete from emp_phone where emp_id in (
    select emp_id from employee
    where dep_id in (
        select dep_id from department
        where dep_name = 'testing'
    )
);

delete from account where emp_id in (
    select emp_id from employee
    where dep_id in (
        select dep_id from department
        where dep_name = 'testing'
    )
);

delete from employee where dep_id in (
    select dep_id from department
    where dep_name = 'testing'
);

delete from department where dep_name = 'testing';


--delete employee
---question
select Manager_ID from employee where Manager_ID = null and emp_id = 2008;

		-----if ( employee manager == null) then the  employee that will be deleted is Manager---
		update employee set Manager_ID=80000 where Manager_ID = 2008 --rakam el Manager elly hayetmese7

		select emp_id from employee where emp_id = 2008;

		delete from emp_phone where emp_id = 2008

		delete from account where emp_id = 2008

		delete from employee where emp_id = 2008;

		-----if ( employee manager == any id) then the  employee that will be deleted is Normar Employee---
		select emp_id from employee where emp_id = 3;

		delete from emp_phone where emp_id = 2008

		delete from account where emp_id = 2008

		delete from employee where emp_id = 2008;


---------NOT YET TESTED------------

--Hire Manager_Branch
---question
select Manager_ID from employee where Manager_ID = null and emp_id = 2004 and dep_id = 3 and branch_id = 1
		--if true
		update branch set Manager_ID = 2004 


--Hire Manager_Department
---question
select Manager_ID from employee where Manager_ID = null and emp_id = 2006 and dep_id = 3 and branch_id = 1
		--if true
		update department set Manager_ID = 2006


--Hire Manager_Emloyee
---question
select Manager_ID from employee where Manager_ID = null and emp_id = 2004 and dep_id = 3 and branch_id = 1
		--if true
		update employee set Manager_ID = 2004  where Manager_ID=80000 and dep_id = 3 and branch_id = 1
