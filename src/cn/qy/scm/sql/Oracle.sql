
CREATE table deptJDAY70(
  dept_id VARCHAR(10) PRIMARY KEY,
  dept_namedept_name VARCHAR(10),
  dept_phoneNum NUMBER (15)
);

insert into deptJDAY70(dept_id,dept_namedept_name,dept_phoneNum) VALUES ('asrjguth','研发部',62105749);
insert into deptJDAY70(dept_id,dept_namedept_name,dept_phoneNum) VALUES ('zsrjauth','人事部',62105729);
insert into deptJDAY70(dept_id,dept_namedept_name,dept_phoneNum) VALUES ('bsrjguth','法务部',62106799);
insert into deptJDAY70(dept_id,dept_namedept_name,dept_phoneNum) VALUES ('csrjguhh','财务部',62108799);
insert into deptJDAY70(dept_id,dept_namedept_name,dept_phoneNum) VALUES ('dsrjguth','事业部',62100799);
SELECT * from deptJDAY70;

/*============================*/
/* Table: 管理员表结构 		  */
/*============================*/
create table account
(
   /* 管理员编号,自动增长 */
   acc_id                  VARCHAR (100) PRIMARY KEY,
   /* 管理员登录名  */
   acc_login               VARCHAR(20),
   /* 管理员姓名  */
   acc_name                VARCHAR(20),
   /* 管理员密码 */
   acc_pass                VARCHAR(20)
);

/*==============================================================*/
/* Table: 供应商表	                                        */
/*==============================================================*/

create table supplier
(
   sup_id               VARCHAR (100) PRIMARY KEY ,
   sup_name             varchar(20),
   sup_linkman          varchar(20),
   sup_phone            varchar(11),
   sup_address          varchar(100),
   sup_remark           varchar(200)
);
/* 添加供应商数据, */
insert into account (acc_id,acc_login,acc_pass) values ('23323','admin','admin');
insert into account (acc_id,acc_login,acc_pass) values ('23324','admin2','admin2');
/* 添加供应商数据, */
insert into supplier (sup_id,sup_name,sup_linkman,sup_phone,sup_address,sup_remark) values ('23323a','苹果供应商','小张','12388888887','广州花都','普通供应商');
insert into supplier (sup_id,sup_name,sup_linkman,sup_phone,sup_address,sup_remark) values ('23323b','三星供应商','小王','12388888888','广州增城','普通供应商');
insert into supplier (sup_id,sup_name,sup_linkman,sup_phone,sup_address,sup_remark) values ('23323c','华为供应商','小王','12388888889','广东深圳','一级供应商');
