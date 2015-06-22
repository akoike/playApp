# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        bigint not null,
  name                      varchar(255) not null,
  age                       integer not null,
  sex                       integer not null,
  create_date               timestamp not null,
  update_date               timestamp not null,
  constraint ck_user_sex check (sex in (0,1)),
  constraint pk_user primary key (id))
;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;

