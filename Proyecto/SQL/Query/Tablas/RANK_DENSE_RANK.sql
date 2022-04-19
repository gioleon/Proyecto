USE sistematickets;

DROP TABLE IF EXISTS prueba;

CREATE TABLE prueba(
	numero int NOT NULL, 
    nombre varchar(10)
)

INSERT INTO prueba(numero, nombre)
VALUES (2, "david");

INSERT INTO prueba(numero, nombre)
VALUES (2, "cristian");

INSERT INTO prueba(numero, nombre)
VALUES (3, "Gio");

INSERT INTO prueba(numero, nombre)
VALUES (4, "jose");

select *, RANK() OVER(ORDER BY numero) AS Ranked, DENSE_RANK() OVER(ORDER BY numero) as Dense_ranked from  prueba;

select MIN(numero), nombre from prueba;

select min(numero), nombre from prueba;