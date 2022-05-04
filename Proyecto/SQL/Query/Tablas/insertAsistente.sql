CREATE DEFINER=`root`@`localhost` PROCEDURE `insertAsistente`(
	IN identificacion varchar(10),
    IN nombre varchar(20),
    IN apellido varchar(20),
    IN correo varchar(40),
    IN contraseña varchar(15),
    IN facultad varchar(40),
    IN programa varchar(40),
    IN rol_id smallint
)
BEGIN
	set @id_asistente= (select 
    case when max(Id_asistente) is null then 0
    else max(Id_asistente) + 1 end from asistente);
    
    insert into estudiante
    values(@id_asistente, identificacion, nombre, apellido, correo, SHA1(contraseña),
	facultad, programa, rol_id);
END