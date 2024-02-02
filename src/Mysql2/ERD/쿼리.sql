SELECT l.Name, l.GNP, r.`Language` FROM country l
JOIN countrylanguage r ON l.Code = r.CountryCode
WHERE r.IsOfficial = 'T'
ORDER BY l.GNP desc
LIMIT 10;