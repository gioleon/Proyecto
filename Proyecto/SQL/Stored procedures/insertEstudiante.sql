CREATE DEFINER=`root`@`localhost` PROCEDURE `insertEstudiante`(
	IN identificacion varchar(10),
    IN nombre varchar(20),
    IN apellido varchar(20),
    IN correo varchar(60),
    IN contraseña varchar(15),
    IN semestre smallint,
    IN facultad varchar(100),
    IN programa varchar(100)
)
BEGIN
	set @id_estudiante= (select 
    case when max(Id_estudiante) is null then 1
    else max(Id_estudiante) + 1 end from estudiante);
    
    insert into estudiante
    values(@id_estudiante, identificacion, nombre, apellido, correo, SHA1(contraseña),
    semestre, facultad, programa, 1);
END