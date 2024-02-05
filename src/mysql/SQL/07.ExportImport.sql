##################################################
#
#   테이블 Export/Import
#
##################################################



/* 1. secure_file_priv 확인*/
    출력결과 : C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\  
                ;파일이 이 위치에 있어야 업로드/다운로드가 가능
    SHOW VARIABLES LIKE 'secure_file_priv'




/* 2. Export (Table -> File) */
SELECT * FROM song INTO OUTFILE
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song.csv'
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n'
    

/* 3. Import (file -> Table) */

#데이터 삭제
truncate song;
    
SELECT * FROM song INTO OUTFILE
	'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/song2.csv'
    INTO TABLE song
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\n'
    