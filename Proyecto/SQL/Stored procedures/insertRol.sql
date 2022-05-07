CREATE DEFINER=`root`@`localhost` PROCEDURE `insertRol`(
	IN nombre varchar(40)
)
BEGIN
	SET @rol_id = (SELECT CASE WHEN
								MAX(rol_id) IS NULL THEN 1
                                ELSE MAX(rol_id) + 1 end from rol);
                                
    INSERT INTO rol
    VALUES (@rol_id, nombre);
END