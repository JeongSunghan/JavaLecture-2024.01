# 1. 2009년도에 데뷔한 걸그룹의 히트송은? (걸그룹 이름, 데뷔일자, 히트송 제목)
SELECT r.name 그룹명, r.debut 데뷔일자, l.title 제목 FROM song l
        JOIN girl_group r
        ON r.hit_song_id = l.sid
        WHERE YEAR(debut) = '2009'
=========================================================================================
*강사님 답안
SELECT l.name, l.debut, r.title FROM girl_group l
	JOIN song r ON l.hit_song_id = r.sid
	WHERE l.debut BETWEEN DATE('2009-01-01') AND DATE ('2009-12-31');

SELECT l.name, l.debut, r.title FROM girl_group l
	JOIN song r ON l.hit_song_id = r.sid
	WHERE l.debut LIKE '2009%' ;
=========================================================================================
# 2. 데뷔일자가 빠른 5개 그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)
SELECT DISTINCT r.name 그룹명, r.debut 데뷔일자, l.title 제목 FROM song l
        JOIN girl_group r
        ON l.sid = r.hit_song_id
        ORDER BY r.debut
        LIMIT 5;
=========================================================================================
# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?
SELECT Continent, COUNT(*), SUM(GNP), AVG(GNP) 
        FROM country
        GROUP BY Continent
        ORDER BY AVG(GNP) DESC;
=========================================================================================
*강사님 답안
SELECT Continent, COUNT(*) num, SUM(GNP), AVG(GNP) 
        FROM country
        GROUP BY Continent

=========================================================================================
# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
        (대륙명, 국가명, 도시명 ,인구수)     
        SELECT r.Continent 대륙명, r.name 국가명, l.district 도시명, l.population 인구수 from city l
        JOIN country r ON l.CountryCode = r.Code
        WHERE r.Continent = 'Asia'
        ORDER BY l.Population DESC
        LIMIT 10;
=========================================================================================
# 5. 전 세게에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
        (국가명, GNP, 언어명)
SELECT r.Name 국가명, r.GNP, l.`Language` 언어명 FROM countrylanguage l
        JOIN country r
        ON l.CountryCode = r.Code
        WHERE l.IsOfficial = 'T'
        ORDER BY r.GNP DESC
        LIMIT 10;
=========================================================================================
*강사님 답안
SELECT l.Name, l.GNP, r.`Language` FROM country l
        JOIN countrylanguage r 
        ON l.code = r.CountryCode
        WHERE r.IsOfficial = 'T'
	ORDER BY l.GNP DESC
	LIMIT 10;
=========================================================================================





