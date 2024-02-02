SELECT r.Name 국가명, r.GNP, l.`Language` 언어명 FROM countrylanguage l
JOIN country r
ON l.CountryCode = r.Code
WHERE l.IsOfficial = 'T'
ORDER BY r.GNP DESC
LIMIT 10;