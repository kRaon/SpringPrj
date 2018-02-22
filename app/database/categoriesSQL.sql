insert into CATEGORIES values(1,'소고기');
insert into CATEGORIES values(2,'돼지고기');
insert into CATEGORIES values(3,'양고기');

(select MAX(NVL(INDEXNUMBER,0))+1 from ASSET_ACTIVITY)

SELECT * FROM ASSET_ACTIVITY;

SELECT INDEXNUMBER,ID,AMOUNT,CONTENTS,FIXED,A_DATE,A_TYPE,CATEGORY_NAME FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM;

SELECT INDEXNUMBER,ID,A.CATEGORY_NUM AS CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE,CATEGORY_NAME FROM ASSET_ACTIVITY A,CATEGORIES C WHERE A.CATEGORY_NUM=C.CATEGORY_NUM;


INSERT INTO ASSET_ACTIVITY (INDEXNUMBER,ID,CATEGORY_NUM,CONTENTS,AMOUNT,FIXED,A_DATE,A_TYPE) VALUES ((select MAX(NVL(INDEXNUMBER,0))+1 from ASSET_ACTIVITY),'qwq713',1,'비용비용',10000,'Regular',sysdate,'yes');


select NVL(INDEXNUMBER,0) from ASSET_ACTIVITY;



select id,month,round(avg(amount)*12,-4) as amount 
from (
select id,to_char(A_DATE,'MM') as MONTH, amount from asset_activity where id = 'qwq713' and a_type = 'income' and to_char(a_date,'yyyy')=to_char(sysdate,'yyyy')
) group by month,id;


select TO_CHAR(birth_date,'YYYY') AS BIRTH_DATE,amount from  (select id,month,round(avg(amount)*12,-4) as amount from (select id,to_char(A_DATE,'MM') as MONTH, amount from asset_activity where id = 'qwq713' and a_type = 'income' and to_char(a_date,'yyyy')=to_char(sysdate,'yyyy') ) group by month,id) N,USERS U WHERE N.id=U.id;



