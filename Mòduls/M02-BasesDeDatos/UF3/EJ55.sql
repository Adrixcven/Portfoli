create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
CREATE TABLE suma_text (suma varchar(200));
create table prova_log (dia DATETIME, usuari varchar(20), accio varchar(40));
INSERT INTO suma_text VALUES (0);

DELIMITER //

CREATE TRIGGER actual AFTER INSERT ON prova FOR EACH ROW
BEGIN
    insert into prova_log values (now(), current_user() , concat("Insert ", new.codi) );
END //
CREATE TRIGGER actual2 AFTER DELETE ON prova FOR EACH ROW
BEGIN
    insert into prova_log values (now(), current_user(), concat("Delete ", old.codi));
END //
CREATE TRIGGER actual3 AFTER UPDATE ON prova FOR EACH ROW
BEGIN
    insert into prova_log values (now(), current_user(), concat("Cambi ",old.codi," > ",new.codi) );
END //
DELIMITER ;
insert into prova values (1);
insert into prova values (2);
insert into prova values (3);
delete from prova where codi=1;
delete from prova where codi=2;
delete from prova where codi=3;
select dia, usuari, accio from prova_log;