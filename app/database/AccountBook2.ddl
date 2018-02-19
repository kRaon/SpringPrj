DROP TABLE COMMENTS CASCADE CONSTRAINTS;
DROP TABLE BOARD CASCADE CONSTRAINTS;
DROP TABLE TARGET CASCADE CONSTRAINTS;
DROP TABLE ACTIVITY CASCADE CONSTRAINTS;
DROP TABLE CATEGORIES CASCADE CONSTRAINTS;
DROP TABLE USERS CASCADE CONSTRAINTS;

/**********************************/
/* Table Name: USER_TABLE */
/**********************************/
CREATE TABLE USERS(
		ID                            		VARCHAR2(30)		 NULL ,
		PW                            		VARCHAR2(30)		 NULL ,
		AGE                           		NUMBER(10)		 NULL ,
		GENDER                        		VARCHAR2(10)		 NULL ,
		JOB                           		VARCHAR2(20)		 NULL ,
		POINT                         		NUMBER(10)		 DEFAULT 0		 NULL 
);


CREATE TABLE CATEGORIES(
		CATEGORY_NUM                  		NUMBER(10)		 NULL ,
		CATEGORY_NAME                 		VARCHAR2(20)		 NULL 
);


CREATE TABLE ACTIVITY(
		INDEXNUMBER                   		NUMBER(10)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		CATEGORY_NUM                  		NUMBER(10)		 NULL ,
		CON_DATE                      		DATE		 NULL ,
		FIXED                         		NUMBER(10)		 NULL ,
		A_TYPE                          		NUMBER(10)		 NULL 
);


CREATE TABLE TARGET(
		INDEXNUMBER                   		NUMBER(10)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		REASON                        		VARCHAR2(30)		 NULL ,
		AMOUNT                        		NUMBER(20)		 NULL ,
		DEADLINE                      		DATE		 NULL 
);

CREATE TABLE BOARD(
		BOARD_ID                      		VARCHAR2(30)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		CONTENTS                      		VARCHAR2(1000)		 NULL ,
		REG_DATE                      		DATE		 NULL ,
		ACTIVITY_NUMBERS                       		VARCHAR2(100)		 NULL 
);

CREATE TABLE COMMENTS(
		INDEXNUMBER                   		NUMBER(10)		 NULL ,
		BOARD_ID                      		VARCHAR2(30)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		CONTENTS                      		VARCHAR2(200)		 NULL ,
		REG_DATE                      		DATE		 NULL ,
		ACCEPT                        		NUMBER(10)		 NULL 
);


ALTER TABLE USERS ADD CONSTRAINT IDX_USERS_PK PRIMARY KEY (ID);

ALTER TABLE CATEGORIES ADD CONSTRAINT IDX_CATEGORIES_PK PRIMARY KEY (CATEGORY_NUM);

ALTER TABLE ACTIVITY ADD CONSTRAINT IDX_ACTIVITY_PK PRIMARY KEY (INDEXNUMBER);
ALTER TABLE ACTIVITY ADD CONSTRAINT IDX_ACTIVITY_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);
ALTER TABLE ACTIVITY ADD CONSTRAINT IDX_ACTIVITY_FK1 FOREIGN KEY (CATEGORY_NUM) REFERENCES CATEGORIES (CATEGORY_NUM);

ALTER TABLE TARGET ADD CONSTRAINT IDX_TARGET_PK PRIMARY KEY (INDEXNUMBER);
ALTER TABLE TARGET ADD CONSTRAINT IDX_TARGET_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);

ALTER TABLE BOARD ADD CONSTRAINT IDX_BOARD_PK PRIMARY KEY (BOARD_ID);
ALTER TABLE BOARD ADD CONSTRAINT IDX_BOARD_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);

ALTER TABLE COMMENTS ADD CONSTRAINT IDX_COMMENTS_PK PRIMARY KEY (INDEXNUMBER);
ALTER TABLE COMMENTS ADD CONSTRAINT IDX_COMMENTS_FK0 FOREIGN KEY (BOARD_ID) REFERENCES BOARD (BOARD_ID);


insert into users values('qwq713','1234',28,'man','student',0);
insert into categories values(1,'식품구매');
insert into activity values(1,'qwq713',1,sysdate,1,1);



insert into activity values(1,'qwq713',1,sysdate,1,1); 우리은행 입금
insert into activity values(2,'qwq713',1,sysdate,1,1); 과자사먹음
insert into activity values(3,'qwq713',1,sysdate,1,1); 월세 냄


insert into board values'bid','qwq713','dfdf',sysdate,'1,3,5');

select * from board where=?;







