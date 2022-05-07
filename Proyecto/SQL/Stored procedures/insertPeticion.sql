CREATE DEFINER=`root`@`localhost` PROCEDURE `insertPeticion`(
	IN id_estudiante bigint,
	IN facultad varchar(100),
    IN programa varchar(100),
    IN asunto varchar(100),
    IN informacion varchar(1000)
)
BEGIN
	SET @id_peticion = (SELECT CASE 
									WHEN MAX(Id_peticion) IS NULL THEN 1
                                    ELSE MAX(Id_peticion) + 1 end from peticion);

	INSERT INTO peticion (Id_peticion, Id_estudiante, Facultad, Programa,
    Asunto, Informacion, Fecha_creacion)
    VALUES (@id_peticion, id_estudiante, facultad, programa, asunto, informacion, (SELECT NOW()));    
END