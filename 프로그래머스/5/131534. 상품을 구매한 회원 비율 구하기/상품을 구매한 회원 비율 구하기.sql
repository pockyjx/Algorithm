-- 코드를 입력하세요
SELECT YEAR, MONTH, COUNT(*) AS PUCHASED_USERS,ROUND(COUNT(*)/(SELECT COUNT(*) FROM USER_INFO WHERE EXTRACT(YEAR FROM JOINED) = 2021), 1) AS PUCHASED_RATIO
FROM (SELECT DISTINCT EXTRACT(YEAR FROM SALES_DATE) AS YEAR, EXTRACT(MONTH FROM SALES_DATE) AS MONTH, U.USER_ID
      FROM USER_INFO U JOIN ONLINE_SALE O
      ON U.USER_ID = O.USER_ID AND EXTRACT(YEAR FROM JOINED) = 2021) A
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH;