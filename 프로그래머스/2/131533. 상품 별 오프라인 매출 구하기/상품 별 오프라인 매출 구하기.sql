SELECT PRODUCT_CODE, (SUM(SALES_AMOUNT) * PRICE) AS SALES
FROM PRODUCT P JOIN OFFLINE_SALE AS OS
ON P.PRODUCT_ID = OS.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE ASC;
