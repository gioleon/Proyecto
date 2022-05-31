CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminarUser`(
	identificacion varchar(10),
    tabla varchar(30)
)
BEGIN
	DELETE FROM tabla
    WHERE identificacion = identificacion;
END