CREATE TABLE FIRMS_MASTER(firm_id NUMBER(8) PRIMARY KEY, owner_name VARCHAR2(100), business_name VARCHAR2(100), 
email VARCHAR2(80) UNIQUE, mobile_no VARCHAR2(10), 
isactive CHAR(1));
CREATE SEQUENCE seq_firm_master;
