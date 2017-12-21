drop table if exists user;

create table user
(
   user_account         varchar(20) not null,
   user_password        varchar(20),
   user_email           varchar(40),
   user_name            varchar(10),
   user_level           varchar(30000),
   user_class           varchar(20),
   user_studentid       varchar(10),
   primary key (user_account)
);

