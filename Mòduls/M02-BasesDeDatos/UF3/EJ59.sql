create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
CREATE TABLE prova_puntuacio(letra enum('A','B','C','D','E'), puntuacio int);
CREATE TABLE prova_puntuacio_seg(letra2 enum('A','B','C','D','E'), puntuacio2 int);
INSERT INTO prova_puntuacio_seg VALUES ('A', 0);
INSERT INTO prova_puntuacio_seg VALUES ('B', 0);
INSERT INTO prova_puntuacio_seg VALUES ('C', 0);
INSERT INTO prova_puntuacio_seg VALUES ('D', 0);
INSERT INTO prova_puntuacio_seg VALUES ('E', 0);

DELIMITER //

CREATE TRIGGER actual AFTER INSERT ON prova_puntuacio FOR EACH ROW
BEGIN
if((new.puntuacio < 10) && (new.puntuacio > 0)) then
update prova_puntuacio_seg set puntuacio2 = (select count(*) from prova_puntuacio where letra=new.letra) where letra2 = new.letra;
end if;
end
//
DELIMITER ;
insert into prova_puntuacio values ('A', 2);
insert into prova_puntuacio values ('B', 6);
insert into prova_puntuacio values ('A', 8);
select letra2, puntuacio2 from prova_puntuacio_seg;