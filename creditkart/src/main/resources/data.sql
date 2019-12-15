insert into t_customer (customer_id, name, address, username, password, is_admin)
values (1, 'Amit', 'Delhi', 'amit', 'amit@123', true);

insert into t_customer (customer_id, name, address, username, password, is_admin)
values (2, 'Rohit', 'Mumbai', 'rohit', 'rohit@123', false);

insert into t_account (account_id, customer_id, bank_name, balance, credit)
values (101, 1, 'HDFC', 1000, 230);

insert into t_account (account_id, customer_id, bank_name, balance, credit)
values (102, 1, 'SBI', 5000, 267);

insert into t_account (account_id, customer_id, bank_name, balance, credit)
values (103, 2, 'SBI', 7000, 450);
