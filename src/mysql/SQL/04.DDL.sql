
################################################
#
# 데이터 조작 언어 (DDL : Data Definition Language)
#
################################################




/* 1. 테이블 생성 
        ERMaster 활용
*/


#주소록 테이블 생성
CREATE TABLE addrBook (
	aid int NOT NULL AUTO_INCREMENT,
	name varchar(16) NOT NULL,
	tel varchar(16),
	email varchar(32),
	birthDay date,
	PRIMARY KEY (aid)
);

#사용자(users) 테이블 생성
CREATE TABLE users (
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);




/* 2. 테이블 조회 */
-- SHOW 사용

# 데이터베이스 내의 테이블 목록
SHOW TABLES

# 테이블 구조 
DESC users;                 -- #describe


/* 3. 테이블 삭제 */
-- DROP 사용

#largeCity 삭제
drop view largeCity 

#dateTable 삭제
drop TABLE dateTable;

#kcity 테이블의 모든 데이터 삭제
-- truncate : 전부삭제(추천안함)
-- 테이블 구조는 남기지만 정보를 모두 삭제
truncate kcity;


/* 4. 테이블 이름 변경 */


/* 5. 테이블 */