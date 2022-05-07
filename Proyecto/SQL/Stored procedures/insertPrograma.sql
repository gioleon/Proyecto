CREATE DEFINER=`root`@`localhost` PROCEDURE `insertPrograma`(
	IN programa varchar(40),
    IN facultad varchar(40)
)
BEGIN
	set @id_programa = (select case when max(Id_programa) is null then 0
    else max(Id_programa) + 1 end from programa);
    
    set @id_facultad = (select Id_facultad from facultad where Facultad = facultad);
    
    INSERT INTO programa 
    VALUES (@id_programa, @id_facultad, facultad, programa); 
END