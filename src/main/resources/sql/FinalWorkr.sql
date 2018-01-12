drop table if exists groups;

drop table if exists lable;

drop table if exists moudle;

drop table if exists share;

drop table if exists user;

drop table if exists work;

create table groups
(
   group_id             int not null auto_increment,
   group_leaderid       varchar(20),
   group_memberid       varchar(2000),
   group_rmemberid      varchar(2000),
   primary key (group_id)
);

create table lable
(
   label_id             int not null auto_increment,
   label_name           varchar(20),
   primary key (label_id)
);

create table moudle
(
   moudle_id            int not null auto_increment,
   moudle_name          varchar(40),
   moudle_groupid       int,
   primary key (moudle_id)
);

create table share
(
   share_id             int not null auto_increment,
   share_groupid        int,
   share_tiltle         varchar(40),
   share_text           varchar(300),
   primary key (share_id)
);

create table user
(
   user_account         varchar(20) not null,
   user_password        varchar(40),
   user_email           varchar(40),
   user_name            varchar(10),
   user_level           varchar(20000),
   user_class           varchar(20),
   user_studentid       varchar(10),
   user_banned          datetime,
   user_state           varchar(20),
   user_note            varchar(400),
   primary key (user_account)
);

create table work
(
   work_id              int not null auto_increment,
   work_name            varchar(40),
   work_user            varchar(20),
   work_start           datetime,
   work_end             datetime,
   work_msg             varchar(100),
   work_level           varchar(8),
   work_beforid         int,
   work_state           varchar(8),
   work_createid        varchar(20),
   work_moduleid        int,
   primary key (work_id)
);

