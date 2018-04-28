drop database if exists mbatis;
CREATE database mybatis CHARACTER SET "UTF-8";
use mybatis;

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