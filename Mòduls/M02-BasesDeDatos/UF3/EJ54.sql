create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
CREATE TABLE suma_text (suma varchar(200));
INSERT INTO suma_text VALUES (0);

DELIMITER //

CREATE TRIGGER actual AFTER INSERT ON prova FOR EACH ROW
BEGIN
    UPDATE suma_text SET suma=concat(suma, "+" , new.codi);
END //
DELIMITER ;
insert into prova values (1);
insert into prova values (2);
insert into prova values (3);
delete from prova where codi=1;
delete from prova where codi=2;
delete from prova where codi=3;
select suma from suma_text;