CREATE DEFINER=`root`@`localhost` PROCEDURE `insertFacultad`(
	IN nombre varchar(40)
)
BEGIN
	set @id_facultad = (select case when max(Id_facultad) is null then 0
    else max(Id_facultad) + 1 end from facultad);
    
    INSERT INTO facultad
    VALUES (@id_facultad, nombre); 
END