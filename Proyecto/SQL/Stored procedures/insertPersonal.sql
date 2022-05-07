CREATE DEFINER=`root`@`localhost` PROCEDURE `insertPersonal`(
	IN identificacion varchar(10),
    IN nombre varchar(20),
    IN apellido varchar(20),
    IN correo varchar(60),
    IN contraseña varchar(15),
    IN facultad varchar(100),
    IN programa varchar(100),
    IN rol_id smallint
)
BEGIN
	set @id_personal= (select 
    case when max(Id_personal) is null then 1
    else max(Id_personal) + 1 end from personal);
    
    insert into personal
    values(@id_personal, identificacion, nombre, apellido, correo, SHA1(contraseña),
	facultad, programa, rol_id);
END