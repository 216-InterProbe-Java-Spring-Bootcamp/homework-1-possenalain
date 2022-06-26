# first-homework
216-InterProbe-Java-Spring-Bootcamp First Homework


## Querries used to create tabbles


### product
```
create table product 
(id bigint not null, 
expiration_date date, 
name varchar(255) not null, 
price double not null, 
primary key (id))
```

### product_comment

```
create table product_comment 
(id bigint not null, 
comment varchar(500) not null, 
comment_date date, 
product_id bigint not null, 
usr_id bigint not null, 
primary key (id))
```

### users tables

```
create table usr 
(id bigint not null, 
email varchar(50) not null, 
name varchar(50) not null, 
telephone varchar(15) not null, 
surname varchar(50) not null, 
primary key (id))
```

#### FK
```
alter table product_comment add constraint FK_PRODUCT_COMMENT foreign key (product_id) references product
alter table product_comment add constraint FK_USR_COMMENT foreign key (usr_id) references usr
```