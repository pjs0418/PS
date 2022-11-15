SELECT FIRST_HALF.FLAVOR
FROM FIRST_HALF
inner join (select FLAVOR from ICECREAM_INFO where INGREDIENT_TYPE = "fruit_based") ICECREAM
on ICECREAM.FLAVOR = FIRST_HALF.FLAVOR
WHERE TOTAL_ORDER > 3000;