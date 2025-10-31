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

--- Mostrar el nombre completo de los empleados junto con el del departamento donde trabajan.
--- Los empleados que no estén asignados, mostrarán el texto “Sin asignar”.
--- Los departamentos sin empleados, mostrarán el texto “Sin empleados”.
--- Ordenar los resultados por el nombre del departamento y el apellido del empleado

SELECT
    NVL(TRIM(e.first_name || ' ' || e.last_name), 'Sin empleados') AS NOMBRE_EMPLEADO,
    NVL(d.department_name,'Sin asignar') AS DEPARTAMENTO
FROM
       departments d
     FULL OUTER JOIN employees e on d.department_id = e.department_id
ORDER BY DEPARTAMENTO , e.last_name DESC;

-------------------------------------------------------------------------------------
SELECT
    first_name || ' ' || last_name AS empleado,
    hire_date,
    CASE
        WHEN TO_DATE(TO_CHAR(SYSDATE, 'YYYY') || TO_CHAR(hire_date, '/MM/DD'), 'YYYY/MM/DD') < SYSDATE
        THEN ADD_MONTHS(TO_DATE(TO_CHAR(SYSDATE, 'YYYY') || TO_CHAR(hire_date, '/MM/DD'), 'YYYY/MM/DD'), 12)
        ELSE TO_DATE(TO_CHAR(SYSDATE, 'YYYY') || TO_CHAR(hire_date, '/MM/DD'), 'YYYY/MM/DD')
    END AS proximo_cumple
FROM employees;


    