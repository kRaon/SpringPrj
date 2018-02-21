select id from users;
select * from users;


select id from users where id='qwq713'

INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES ('java01','1234',66,'kk','kk',0)
INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES ('java02','1234',66,'kk','kk',0)
INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES ('java03','1234',66,'kk','kk',0)
<<<<<<< HEAD
INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES ('java04','1234',66,'kk','kk',0)
INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES ('java05','1234',66,'kk','kk',0)
INSERT INTO USERS (ID,PW,AGE,GENDER,JOB,POINT) VALUES ('java06','1234',66,'kk','kk',0)


select * from board;


INSERT INTO board (BOARD_ID,ID,CONTENTS,BILLSCONTENTS,REG_DATE) 
VALUES ('01','java01','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','sdfjosddsf',SYSDATE)
INSERT INTO board (BOARD_ID,ID,CONTENTS,BILLSCONTENTS,REG_DATE) 
VALUES ('02','java02','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','sdfjosddsf',SYSDATE)
INSERT INTO board (BOARD_ID,ID,CONTENTS,BILLSCONTENTS,REG_DATE) 
VALUES ('03','java03','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','sdfjosddsf',SYSDATE)
INSERT INTO board (BOARD_ID,ID,CONTENTS,BILLSCONTENTS,REG_DATE) 
VALUES ('04','java04','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','sdfjosddsf',SYSDATE)
INSERT INTO board (BOARD_ID,ID,CONTENTS,BILLSCONTENTS,REG_DATE) 
VALUES ('05','java05','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','sdfjosddsf',SYSDATE)
INSERT INTO board (BOARD_ID,ID,CONTENTS,BILLSCONTENTS,REG_DATE) 
VALUES ('06','java06','Lorem Ipsum is simply dummy text of the printing and typesetting industry.','sdfjosddsf',SYSDATE)


=======


SELECT INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME 
FROM(SELECT INDEXNUMBER,ID,A.CATEGORY_NUM, CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME
FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM)
>>>>>>> branch 'master' of https://github.com/kRaon/SpringPrj.git
