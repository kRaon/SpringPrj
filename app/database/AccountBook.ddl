DROP TABLE COMMENTS CASCADE CONSTRAINTS;
DROP TABLE BOARD CASCADE CONSTRAINTS;
DROP TABLE TARGET CASCADE CONSTRAINTS;
DROP TABLE ASSET_ACTIVITY CASCADE CONSTRAINTS;
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

COMMENT ON TABLE USERS is 'USER_TABLE';
COMMENT ON COLUMN USERS.ID is 'USER_ID';
COMMENT ON COLUMN USERS.PW is 'PASSWORD';
COMMENT ON COLUMN USERS.AGE is 'USER_AGE';
COMMENT ON COLUMN USERS.GENDER is 'USER_GENDER';
COMMENT ON COLUMN USERS.JOB is 'JOB';
COMMENT ON COLUMN USERS.POINT is 'GREAT';


/**********************************/
/* Table Name: CATEGORIS */
/**********************************/
CREATE TABLE CATEGORIES(
		CATEGORY_NUM                  		NUMBER(10)		 NULL ,
		CATEGORY_NAME                 		VARCHAR2(20)		 NULL 
);

COMMENT ON TABLE CATEGORIES is 'CATEGORIS';
COMMENT ON COLUMN CATEGORIES.CATEGORY_NUM is 'NUMBER';
COMMENT ON COLUMN CATEGORIES.CATEGORY_NAME is 'CATEGORIEY_NAME';


/**********************************/
/* Table Name: ACTIVITY_HISTORY */
/**********************************/
CREATE TABLE ASSET_ACTIVITY(
		INDEXNUMBER                   		NUMBER(10)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		CATEGORY_NUM                  		NUMBER(10)		 NULL ,
		AMOUNT                        		NUMBER(10)		 NULL ,
		CONTENTS                      		VARCHAR2(500)		 NULL ,
		FIXED                         		VARCHAR2(20)		 NULL ,
		A_DATE                        		DATE		 NULL ,
		A_TYPE                        		VARCHAR2(20)		 NULL 
);

COMMENT ON TABLE ASSET_ACTIVITY is 'ACTIVITY_HISTORY';
COMMENT ON COLUMN ASSET_ACTIVITY.INDEXNUMBER is 'INDEX_OF_LIST';
COMMENT ON COLUMN ASSET_ACTIVITY.ID is 'USER_ID';
COMMENT ON COLUMN ASSET_ACTIVITY.CATEGORY_NUM is 'CATEGORY_OF_CONSUMPTION';
COMMENT ON COLUMN ASSET_ACTIVITY.AMOUNT is 'Column8';
COMMENT ON COLUMN ASSET_ACTIVITY.CONTENTS is 'Column7';
COMMENT ON COLUMN ASSET_ACTIVITY.FIXED is 'FIXED';
COMMENT ON COLUMN ASSET_ACTIVITY.A_DATE is 'DATE';
COMMENT ON COLUMN ASSET_ACTIVITY.A_TYPE is 'TYPE_OF_ACTIVITY';


/**********************************/
/* Table Name: TARGET_AMOUNT */
/**********************************/
CREATE TABLE TARGET(
		INDEXNUMBER                   		NUMBER(10)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		REASON                        		VARCHAR2(30)		 NULL ,
		AMOUNT                        		NUMBER(20)		 NULL ,
		DEADLINE                      		DATE		 NULL 
);

COMMENT ON TABLE TARGET is 'TARGET_AMOUNT';
COMMENT ON COLUMN TARGET.INDEXNUMBER is 'INDEX_OF_LIST';
COMMENT ON COLUMN TARGET.ID is 'USER_ID';
COMMENT ON COLUMN TARGET.REASON is 'REASON';
COMMENT ON COLUMN TARGET.AMOUNT is 'TARGET_AMOUNT';
COMMENT ON COLUMN TARGET.DEADLINE is 'DEADLINE_OF_GOAL';


/**********************************/
/* Table Name: BOARD_TABLE */
/**********************************/
CREATE TABLE BOARD(
		BOARD_ID                      		VARCHAR2(100)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		CONTENTS                      		VARCHAR2(1000)		 NULL ,
		BILLSCONTENTS                 		VARCHAR2(1000)		 NULL ,
		REG_DATE                      		DATE		 NULL 
);

COMMENT ON TABLE BOARD is 'BOARD_TABLE';
COMMENT ON COLUMN BOARD.BOARD_ID is 'BOARD_ID';
COMMENT ON COLUMN BOARD.ID is 'USER_ID';
COMMENT ON COLUMN BOARD.CONTENTS is 'CONTENTS';
COMMENT ON COLUMN BOARD.BILLSCONTENTS is 'Column5';
COMMENT ON COLUMN BOARD.REG_DATE is 'BOARD_DATE';


/**********************************/
/* Table Name: COMMENT_TABLE */
/**********************************/
CREATE TABLE COMMENTS(
		INDEXNUMBER                   		NUMBER(10)		 NULL ,
		BOARD_ID                      		VARCHAR2(100)		 NULL ,
		ID                            		VARCHAR2(30)		 NULL ,
		CONTENTS                      		VARCHAR2(200)		 NULL ,
		REG_DATE                      		DATE		 NULL ,
		ACCEPT                        		NUMBER(10)		 NULL 
);

COMMENT ON TABLE COMMENTS is 'COMMENT_TABLE';
COMMENT ON COLUMN COMMENTS.INDEXNUMBER is 'INDEX';
COMMENT ON COLUMN COMMENTS.BOARD_ID is 'BOARD_ID';
COMMENT ON COLUMN COMMENTS.ID is 'USER_ID';
COMMENT ON COLUMN COMMENTS.CONTENTS is 'CONTENTS';
COMMENT ON COLUMN COMMENTS.REG_DATE is 'DATE_OF_COMMENT';
COMMENT ON COLUMN COMMENTS.ACCEPT is 'POINT';



ALTER TABLE USERS ADD CONSTRAINT IDX_USERS_PK PRIMARY KEY (ID);

ALTER TABLE CATEGORIES ADD CONSTRAINT IDX_CATEGORIES_PK PRIMARY KEY (CATEGORY_NUM);

ALTER TABLE ASSET_ACTIVITY ADD CONSTRAINT IDX_ASSET_ACTIVITY_PK PRIMARY KEY (INDEXNUMBER);
ALTER TABLE ASSET_ACTIVITY ADD CONSTRAINT IDX_ASSET_ACTIVITY_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);
ALTER TABLE ASSET_ACTIVITY ADD CONSTRAINT IDX_ASSET_ACTIVITY_FK1 FOREIGN KEY (CATEGORY_NUM) REFERENCES CATEGORIES (CATEGORY_NUM);

ALTER TABLE TARGET ADD CONSTRAINT IDX_TARGET_PK PRIMARY KEY (INDEXNUMBER);
ALTER TABLE TARGET ADD CONSTRAINT IDX_TARGET_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);

ALTER TABLE BOARD ADD CONSTRAINT IDX_BOARD_PK PRIMARY KEY (BOARD_ID);
ALTER TABLE BOARD ADD CONSTRAINT IDX_BOARD_FK0 FOREIGN KEY (ID) REFERENCES USERS (ID);

ALTER TABLE COMMENTS ADD CONSTRAINT IDX_COMMENTS_PK PRIMARY KEY (INDEXNUMBER);
ALTER TABLE COMMENTS ADD CONSTRAINT IDX_COMMENTS_FK0 FOREIGN KEY (BOARD_ID) REFERENCES BOARD (BOARD_ID);

