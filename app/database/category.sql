insert into CATEGORIES values (1, '식비');
insert into CATEGORIES values (2, '주거/통신');
insert into CATEGORIES values (3, '생활용품');
insert into CATEGORIES values (4, '의복/미용');
insert into CATEGORIES values (5, '건강/문화');
insert into CATEGORIES values (6, '교육/육아');
insert into CATEGORIES values (7, '교통/차량');
insert into CATEGORIES values (8, '경조사/회비');
insert into CATEGORIES values (9, '세금/이자');
insert into CATEGORIES values (10, '용돈/기타');


select * from board;


"SELECT AGE, sum(AMOUNT) as AMOUNT FROM USERS U, ASSET_ACTIVITY AA WHERE U.ID = AA.ID AND A_TYPE = 'income' AND U.ID = #{id} AND TO_CHAR(AA.A_DATE,'YYYY')=#{date} GROUP BY AGE