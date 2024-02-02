
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

-- 사용자 테이블 필기
/* 사용자(users)
    uid =  
    pwd = 
    uname =
    regDate = 
    isDeleted =



*/
