CREATE DEFINER=`root`@`localhost` PROCEDURE `insertEstudiante`(
	IN identificacion varchar(10),
    IN nombre varchar(20),
    IN apellido varchar(20),
    IN correo varchar(40),
    IN contraseña varchar(15),
    IN semestre smallint,
    IN facultad varchar(40),
    IN programa varchar(40),
    IN rol_id smallint
)
BEGIN
	set @id_estudiante= (select 
    case when max(Id_estudiante) is null then 0
    else max(Id_estudiante) + 1 end from estudiante);
    
    insert into estudiante
    values(@id_estudiante, identificacion, nombre, apellido, correo, SHA1(contraseña),
    semestre, facultad, programa, rol_id);
END