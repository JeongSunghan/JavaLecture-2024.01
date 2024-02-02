################################################
#
# 데이터 조작 언어 (DML : Data Manipulation Language)
#
################################################

/* 2. Update */
UPDATE 테이블 
    SET 필드명1 = 값1, 필드명2 = 값2, ..., 필드명n = 값n;
    WHERE 조건식;                   -- 조건 - 프라미머리 키 = 값


UPDATE kcity SET name = '수원', population = 1200000 WHERE id = 2340;
UPDATE kcity SET name = '용인', population = 1100000 WHERE id = 2362;

# ID가 2391 이상인 도시의 인구를 100,000 추가

UPDATE kcity SET population = population + 100000 WHERE id >2390;
-- kcity의 population를 population + 100000만큼 더하는데 id가 2391 이상인 곳만
-- ID값은 절대절대 바꾸지 말 것!


/*3. Insert */

INSERT INTO 테이블(필드명1, 필드명2, ..... ,필드명n)
VALUES (값1, 값2, .... , 값n)  -- , (값1, 값2, ... 값n)
-- 몇개의 필드만 선택해서 값 지정
--  이러한 값들은 ,를 통해서 여러개를 넣는게 가능


INSERT INTO 테이블 VALUES (모든 필드의 값) -- ,(모든 필드의 값);
-- 모든 필드에 값 지정

# 경기도 화성시, 의정부시 추가
-- ID = Auto increment => default
INSERT INTO kcity
    VALUES (default, '화성', 'KOR', 'Kyonggi', 900000),
            (default, '의정부', 'KOR', 'Kyonggi', 200000),

# 강원도 속초시 추가 - default value 활용(auto_increment 포함 )
INSERT INTO kcity(name, countrycode, district) VALUES('속초', 'KOR', 'Kang-won');

# 경기도 광주시 추가 - auto_increment 속성이 설정되어 있어도 ID 값을 임의로 부여 가능
INSERT INTO kcity VALUES (2600, '광주', 'KOR', 'Kyonggi', 300000);
-- 아이다가 중복되면 추가가 안됨!


/* 4. Delete */
DELETE FROM 테이블명 WHERE 조건
-- #조건 - primary key = value

#강원도 속초시 삭제
DELETE FROM kcity WHERE id=2503;