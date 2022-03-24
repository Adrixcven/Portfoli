create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
INSERT INTO suma VALUES (0);

DELIMITER //

CREATE TRIGGER actual AFTER INSERT ON prova FOR EACH ROW
BEGIN
    UPDATE suma SET suma=new.codi;
END //
DELIMITER ;
insert into prova values (1);
insert into prova values (2);
insert into prova values (3);
select suma from suma;
select codi from prova;