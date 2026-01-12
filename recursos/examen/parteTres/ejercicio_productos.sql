-- crear una tabla TB_Productos que almacena: id, nombre, tipo, precio, stock
CREATE TABLE TB_Productos(
        id NUMBER GENERATED ALWAYS AS IDENTITY,
        nombre VARCHAR2(50) NOT NULL,
        tipo VARCHAR(12) NOT NULL,
        precio NUMBER(8,2) NOT NULL,
        stock NUMBER(6) DEFAULT 0 NOT NULL,
        --Restricciones
        CONSTRAINT ck_productos_tipo CHECK (tipo IN('Alimentacion','Electronica','Ropa')),
        CONSTRAINT ck_productos_precio CHECK(precio >= 0),
        CONSTRAINT pk_productos PRIMARY KEY (id)
    );
    
    --insertar productos en la tabla
    INSERT INTO TB_Productos(nombre,tipo,precio,stock) VALUES('Pan tajado','Alimentacion',1.50,30);
    INSERT INTO TB_Productos(nombre,tipo,precio,stock) VALUES('Cerveza estrella galicia pack','Alimentacion',4.0,40);
    INSERT INTO TB_Productos(nombre,tipo,precio,stock) VALUES('Lavadora LG','Electronica',150.0,10);
    INSERT INTO TB_Productos(nombre,tipo,precio,stock) VALUES('Portatil Asus','Electronica',700.0,50);
    INSERT INTO TB_Productos(nombre,tipo,precio,stock) VALUES('Camisa','Ropa',14.50,70);
    INSERT INTO TB_Productos(nombre,tipo,precio,stock) VALUES('Pantalon','Ropa',12.50,30);
    
    -- calcular el precio medio y cuantos productos por cada tipo
    SELECT tipo,
            ROUND(AVG(precio),1) as precio_medio,
            COUNT(*)             as total
    FROM    TB_Productos
    GROUP BY tipo;