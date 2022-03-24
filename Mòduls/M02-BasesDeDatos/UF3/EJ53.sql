create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
INSERT INTO suma VALUES (0);

DELIMITER //

CREATE TRIGGER actual AFTER INSERT ON prova FOR EACH ROW
BEGIN
    UPDATE suma SET suma=suma+1;
END //
CREATE TRIGGER remover AFTER delete ON prova FOR EACH ROW
BEGIN
    UPDATE suma SET suma=(select count(codi) from prova);
END //
DELIMITER ;
insert into prova values (1);
insert into prova values (2);
insert into prova values (3);
delete from prova where codi=1;
delete from prova where codi=2;
delete from prova where codi=3;
select suma from suma;
select codi from prova;