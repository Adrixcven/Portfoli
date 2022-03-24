create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
CREATE TABLE suma_valors (codi int, vegades int);
INSERT INTO suma VALUES (0);
INSERT INTO suma_valors VALUES (1, 0);
INSERT INTO suma_valors VALUES (2, 0);
INSERT INTO suma_valors VALUES (3, 0);
INSERT INTO suma_valors VALUES (4, 0);
INSERT INTO suma_valors VALUES (5, 0);
INSERT INTO suma_valors VALUES (6, 0);
INSERT INTO suma_valors VALUES (7, 0);
INSERT INTO suma_valors VALUES (8, 0);
INSERT INTO suma_valors VALUES (9, 0);
INSERT INTO suma_valors VALUES (10, 0);

DELIMITER //

CREATE TRIGGER trigg1 AFTER INSERT ON prova FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades = (select count(*) from prova where codi=new.codi) WHERE codi = new.codi;
 
END //
CREATE TRIGGER trigg2 AFTER DELETE ON prova FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades = (select count(*) from prova where codi=old.codi) WHERE codi = old.codi;
 
END //
CREATE TRIGGER trigg3 AFTER UPDATE ON prova FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades = (select count(*) from prova where codi=new.codi) WHERE codi = new.codi;
	UPDATE suma_valors SET vegades = (select count(*) from prova where codi=old.codi) WHERE codi = old.codi;
END //
DELIMITER ;
insert into prova values (2);
insert into prova values (3);
delete from prova where codi=3;
update prova set codi=4 where codi=2;
select suma from suma;
select codi, vegades from suma_valors;