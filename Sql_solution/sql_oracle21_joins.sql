---- Get all the countries of the Europe region ----------
SELECT
    c.country_name 
FROM
    regions r inner join countries c on  r.region_id = c.region_id
WHERE
    r.region_name = 'Europe'
ORDER BY c.country_name;
--------------------------------------------------------
--------------------- Get locations of the contries that are in europe -------------------------------
SELECT
    r.region_name,
    l.city
FROM
        regions r
    inner join countries c on r.region_id = c.region_id
    inner join locations l on c.country_id = l.country_id

WHERE
    r.region_name = 'Europe'
ORDER BY c.country_name;
---------- Name of all departments of location ----------
SELECT
    d.department_name,
    r.region_name
FROM
        regions r
    inner join countries c on r.region_id = c.region_id
    inner join locations l on c.country_id = l.country_id
    inner join departments d on l.location_id = d.location_id
WHERE
    r.region_name = 'Europe'
ORDER BY d.department_name;
--------- how many employees works on that department (using the previous) -------
SELECT
    r.region_name,
    d.department_name,
    count (*) as CANTIDAD_EMPLEADOS--agregacion, cada vez que se use esto, hay que hacer un group by
FROM
        regions r
    inner join countries c on r.region_id = c.region_id
    inner join locations l on c.country_id = l.country_id
    inner join departments d on l.location_id = d.location_id
    inner join employees e on d.department_id = e.department_id
WHERE
    r.region_name = 'Europe'
GROUP BY
    r.region_name,
    d.department_name
ORDER BY d.department_name;
----------- salario que se paga a esos empleados
SELECT
    r.region_name,
    d.department_name,
    count (*) as CANTIDAD_EMPLEADOS,--agregacion, cada vez que se use esto, hay que hacer un group by
    TO_CHAR(SUM(e.salary *( 1+ NVL(e.commission_pct,0))),'999G999D99L') as SALARIO_TOTAL
FROM
        regions r
    inner join countries c on r.region_id = c.region_id
    inner join locations l on c.country_id = l.country_id
    inner join departments d on l.location_id = d.location_id
    inner join employees e on d.department_id = e.department_id
WHERE
    r.region_name = 'Europe'
GROUP BY
    r.region_name,
    d.department_name
ORDER BY d.department_name;
    