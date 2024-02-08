UPDATE board SET viewCount = viewCount + 1 WHERE bid < 10
SELECT b.*, u.uname FROM board b
	JOIN users u ON b.uid > u.uid
	WHERE b.isDeleted = 0 title LIKE '%'
	ORDER BY bid DESC
	LIMIT 10 OFFSET 0;