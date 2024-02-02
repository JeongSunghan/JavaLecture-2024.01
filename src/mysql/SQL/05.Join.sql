################################################
# 테이블 조인(Table join)
################################################



/* 1. 테이블 생성 */

# song Table
create table if not exists song (
    sid int primary key auto_increment,
    title varchar(32) not null,
    lyrics varchar(64)
)  auto_increment=101;              #시작번호 지정


# girl-group table
create table if not exists girl_group (
    git int primary key auto_increment,
    name varchar(32) not null,
    debut date not null,
    hit_song_id int
)   auto_increment=1001; 



/* 2. 데이터 입력 */
# song table
insert into song (title, lyrics) values
('Tell Me', 'tell me tell me tetetete tel me'),
   ('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
   ('미스터', '이름이 뭐야 미스터'), 
   ('Abracadabra', '이러다 미쳐 내가 여리여리'),
   ('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
   ('I Dont care', '다른 여자들의 다리를'), 
   ('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
   ('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
   ('A', 'A 워오우 워오우워 우우우'),
   ('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요 '),
   ('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
   ('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');


#girl_group table
insert into girl_group (name, debut, hit_song_id) values
    ('원더걸스', '2007-02-10', 101),
   ('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
   ('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
   ('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
   ('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
   ('애프터 스쿨', '2009-11-25', 120), ('포미닛', '2009-08-28', 121);


/* 3. Table join */
# Inner Join
SELECT r.name, r.debut, l.title, l.lyrics FROM song l
	INNER JOIN girl_group r                 -- INNER 생략 가능
	ON l.sid = r.hit_song_id;

# Left outer Right
SELECT r.name, r.debut, l.title, l.lyrics FROM song l
	LEFT OUTER JOIN girl_group r                -- OUTER만 생략 가능
	ON l.sid = r.hit_song_id;

SELECT r.name, r.debut, l.title, l.lyrics FROM song l
RIGHT OUTER JOIN girl_group r                -- OUTER만 생략 가능
ON l.sid = r.hit_song_id;


# Full outer join   - MySql에서는 Left join 과 Right join을 union(합집합)
SELECT r.name, r.debut, l.title, l.lyrics FROM song l
	LEFT OUTER JOIN girl_group r               
	ON l.sid = r.hit_song_id;
UNION
SELECT r.name, r.debut, l.title, l.lyrics FROM song l
RIGHT OUTER JOIN girl_group r               
ON l.sid = r.hit_song_id;