################################################
#
# 데이터 조작 언어 (DML : Data Manipulation Language)
#
################################################

SHOW DATABASES;
USE world;
SHOW TABLES;
DESC city;

/*
    1. Select
*/

/*
SELECT 필드명       (대문자는 KEYWORD)
    FROM 테이블명
    JOIN 테이블명
    ON 조인(JOIN) 조건
    WHERE 조회 조건 
    GROUP BY 필드명
    HAVING 그룹(GROUP) 조건
    ORDER BY 필드명 순서
    LIMIT 숫자 OFFSET 숫자;

    (다 써도 되고 일부만 써도 가능)
*/
    

SELECT * FROM(필드명) city
* => 모든 정보를 가져온다.

SELECT `name`, population FROM city LIMIT 10;
`name` => name 부분을 소문자로 출력



/* 1-1. 조회 조건 : WHERE */
SELECT * FROM city 
    WHERE countrycode='KOR';

SELECT * FROM city 
    WHERE population >= 900000;

SELECT * FROM city 
    WHERE countrycode='KOR' AND population >= 1000000;


SELECT DISTINCT district FROM city WHERE countrycode = 'KOR';
-- # 고유한 값 - DISTINCT

# 수도권 도시(서울, 인천, 경기)
SELECT * FROM city 
    WHERE district = 'Seoul' or district = 'Inchon' or district = 'Kyonggi';

SELECT * FROM city 
    WHERE district In ('Seoul' , 'Inchon' , 'Kyonggi');
-- 둘 중 하나 동일한 방법

# 경기도에서 인구수가 홀수인 도시
SELECT * FROM city 
    WHERE district = 'Kyonggi' AND population % 2 = 1;
-- 경기에서 그리구 인구수가 2로 나눴을떄 1로 나누어 떨어지는 도시(홀수)

# 국내에서 인구수가 50만 ~ 100만 
SELECT * FROM city WHERE countrycode = 'KOR' AND
    population >= 500000 AND population <= 1000000;

SELECT * FROM city WHERE countrycode = 'KOR' AND population between 500000 AND 1000000;

# 충청남북도의 도시
SELECT * FROM city WHERE district = "Chungchongbuk" or district = 'Chungchongnam';

SELECT * FROM city WHERE district LIKE "Chungchong%" ;
--  % = 임의의 문자, 이때는 LIKE를 사용한다


/*
1-2. 순서 (ORDER BY) - ASC(Ascending : 오름차순, default), DESC(Descending : 내림차순)
*/

# 인구수가 900만 이상인 도시르 인구수의 내림차순으로 조회
SELECT * FROM city 
    WHERE population >= 9000000 
    ORDER BY population DESC;

# 국내에서 인구수가 50만 ~ 100만 도시를 지역 오름차순, 인구수는 내림차순을 조히
SELECT * FROM city 
    WHERE countrycode = 'KOR' AND population between 500000 AND 1000000
    ORDER BY district ASC, population DESC; 
    -- ASC가 없어도 됨 -> 기본값이기 떄문에 


/* 1-3. 갯수 */
# 전세계 인구수 TOP 10 도시
SELECT * FROM city ORDER BY population DESC LIMIT 10;

# 국내 인구수 TOP 5 도시
SELECT * FROM city WHERE countrycode = 'KOR' ORDER BY population DESC LIMIT 5;

-- LIMIT > ORDER BY > WHERE 
-- WHERE -> ORDER BY -> LIMIT

# 국내 인구수 TOP 11 ~ 20까지 의 도시
SELECT * FROM city
    WHERE countrycode = 'KOR'
    ORDER BY population
    ESC LIMIT 10 OFFSET 10;
-- 앞에서 10개를 건너뛰고, 10개를 보여준다.


/* 1-4. 함수 */
# 현자 날짜와 시각
SELECT NOW();       #2024-02-01 13:44:48

# 국내 도시의 갯수 - 레코드의 갯수
SELECT count(*) FROM city 
    WHERE countrycode = 'KOR';

# 최대, 최소 - 국내 도시 중 인구 수 최대, 최소 도시
SELECT MAX(population), MIN(population) FROM city 
    WHERE countrycode = 'KOR';

# 국내 도시의 인구 평균
SELECT AVG(population)FROM city 
    WHERE countrycode = 'KOR';

SELECT ROUND(AVG(population))FROM city 
    WHERE countrycode = 'KOR';

# Aliasing
SELECT ROUND(AVG(population)) AS avgPop FROM city
    WHERE countrycode = 'KOR';
-- AS를 이용하여 이름을 바꿀 수 있음(생략가능 하지만 알아보기 쉽기 위해 적자)
-- AS는 어디서든 이름을 다 바꿀 수 있음
SELECT count(*) numCity FROM city 
    WHERE countrycode = 'KOR';


/* 1-5. 그룹핑 */
# 국내 광역시도별 인구수의 평균을 내림차순으로 조회
SELECT district, ROUND(AVG (population)) AS avgPop FROM city  
    WHERE countrycode = 'KOR' 
    GROUP BY district 
    ORDER BY avgPop DESC;

# 도시의 갯수가 많은 나라 Top 10
SELECT countrycode, count(*) numCity FROM city
    GROUP BY countrycode
    ORDER BY numCity DESC
    LIMIT 10;

# 경기도의 도시 이름
SELECT `name` FROM city 
    WHERE district = "Chungchongnam";
SELECT GROUP_CONCAT(`name`) cities FROM city 
    WHERE district = "Chungchongnam";

# 국내 광역도시 이름
SELECT DISTINCT district FROM city
    WHERE countrycode = 'KOR'

SELECT GROUP_CONCAT(district) districts FROM city
    WHERE countrycode = 'KOR'


/* 1-5. 그룹핑 조건 */
# 국내 도별(도시의 갯수가 2개 이상) 평균을 내림차순으로 조회
SELECT district, ROUND(AVG (population)) AS avgPop FROM city 
    WHERE countrycode = 'KOR'
    GROUP BY district
    HAVING count(*) >= 2        -- 그룹핑 조건 : 도시의 개수가 2개 이상
    ORDER BY avgPop DESC;

# 국내 도시의 갯수가 5개 이상인 도
SELECT district, count(*) AS numCity FROM city
    WHERE countrycode = 'KOR'
    GROUP BY district
    HAVING numCity >= 5
    -- ORDER BY numCity DESC;, 내림차순으로 정렬

# 국내 도시의 갯수가 5개 이상인 도의 평균 도시 인구수를 내림차순으로 정렬
SELECT district, ROUND(AVG (population)) AS avgPop FROM city
    WHERE countrycode = 'KOR'
    GROUP BY district
    HAVING count(*) >= 5
    ORDER BY avgPop DESC;

#도시의 갯수가 100개 이상인 도의 평균 도시 인구평균을 내림차순으로 정렬
SELECT countrycode, ROUND(AVG (population)) AS avgPop FROM city
    GROUP BY countrycode
    HAVING count(*) >= 100 
    ORDER BY avgPop DESC;

    #도시의 갯수가 100개 이상인 도의 평균 도시 인구평균을 내림차순으로 정렬(강사님 답)
        SELECT countrycode, count(*) numCity, ROUND(AVG (population)) AS avgPop FROM city
        GROUP BY countrycode
        HAVING count(*) >= 100 
        ORDER BY avgPop DESC;


/* 1-7. Join */
# 인구수가 800만 보다 큰 도시의 국가명, 도시명, 인구수
SELECT country.Name, city.Name, city.population FROM city 
    INNER JOIN country      --INNER는 생략가능
    ON city.countrycode=country.Code
    WHERE city.population > 8000000;

SELECT r.Name countryName, l.Name cityName, l.Population FROM city l
	JOIN country r
	ON l.CountryCode = r.Code
	WHERE l.Population > 8000000;

# 양쪽 테이블에서 필드명이 고유한 필드는 테이블 이름을 생략가능 할 수 있음(Continent)
SELECT r.Continent, r.Name countryName, l.Name cityName, l.Population FROM city l
	JOIN country r
	ON l.CountryCode = r.Code
	WHERE l.Population > 8000000;


# 아시아 대륙에서 인구수가 많은 도시 TOP 10
SELECT r.Continent, r.Name countryName, l.Name cityName, l.Population 
	FROM city l
	JOIN country r
	ON l.CountryCode = r.Code
	WHERE r.Continent = 'Asia'
	ORDER BY l.Population desc
	LIMIT 10;

#국가 언어
    SELECT * FROM countrylanguage WHERE countrycode = 'KOR';

# 아시아 국가의 국가명과 공식언어
SELECT l.name, r.`Language` FROM country l
	JOIN countrylanguage r
	ON l.code = r.CountryCode
	WHERE l.Continent = 'Asia' AND r.IsOfficial = 'T';
    -- 'T' = TRUE

# 3개의 테이블 조인
# 아시아 대륙에서 인구수가 가장 많은 Top 10 도시에서 사용하는 공식언어
SELECT r.Name countryName, l.Name cityName, l.Population, o.`Language` FROM city l
	JOIN country r ON l.CountryCode=r.Code
	JOIN countrylanguage o ON l.CountryCode=o.CountryCode
	WHERE r.Continent='Asia' AND o.IsOfficial='T'
	ORDER BY l.Population DESC 
	LIMIT 10;