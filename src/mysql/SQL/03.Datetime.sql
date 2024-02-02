#################################
# 날짜/시간 조작
#################################


/* 1. 테이블 생성 */
CREATE TABLE if NOT EXISTS dateTable (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    regDate DATE DEFAULT (CURRENT_DATE),
    modTime datetime DEFAULT CURRENT_TIMESTAMP
);


/* 2. 데이터 입력 */
INSERT INTO dateTable VALUES (default, default, DEFAULT);
INSERT INTO dateTable(id) VALUES (DEFAULT);
INSERT INTO dateTable(regDate, modTime) VALUES
    ('2024-01-01', '2024-01-31 10:25:00'),
    ('2024-02-01', '2024-02-02 16:45:00');


/* 3. 데이터 조회 */
#2024-02-02 형식
SELECT regDate, date_format(modTime, '%Y-%m-%d') FROM dateTable;

#10:45:00 AM 형식
SELECT DATE_FORMAT (modTime, '%h:%i:%s %p') FROM dateTable;


#24H-02-02 16:45 형식
SELECT DATE_FORMAT (modTime, '%y-%m-%d %H:%i:%s %p') FROM dateTable;

#날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();

/* 4. 데이터 수정 */

#날짜 현재로 바꾸기
UPDATE dateTable SET regDate = CURDATE() WHERE id = 3;
SELECT * FROM dateTable;

#날짜 및 시각 현재로 바꾸기
UPDATE dateTable SET modTime = CURDATE(), modTime=NOW() WHERE id = 3;
-- 테이블을 만들때 기본값으로 설정을 하지 못한다.


/* 5. 날짜 계산 */
-- DAY, MONTH, YEAR 로 설정 가능 

#날짜 더하기 / 뺴기
SELECT DATE_ADD(NOW(), INTERVAL 40 DAY);
-- 현재 날짜에 40일 더하기

SELECT DATE_SUB(NOW(), INTERVAL 3 MONTH);
-- 현재 날짜에 3개월 뺴기

SELECT DATE_SUB(CURDATE(), INTERVAL 3 MONTH);

#D-DAY 계산
SELECT TO_DAYS('2024-11-14') - TO_DAYS(CURDATE());

# 요일 : 1 - 일요일, 2 - 월요일, 3 - 화 4 - 수 5 - 목 6 - 금 
SELECT DAYOFWEEK(regDate) FROM dateTable;


/* 6. 뷰 생성*/
CREATE VIEW largeCity AS SELECT * FROM city
WHERE Population > 8000000;

-- view = 실체가 없다(조회용)