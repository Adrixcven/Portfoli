create DATABASE exemple_disparadors;
USE exemple_disparadors;
CREATE TABLE prova (codi INT);
CREATE TABLE suma (suma INT);
INSERT INTO suma VALUES (0);

DELIMITER //

CREATE TRIGGER actual AFTER INSERT ON prova FOR EACH ROW
BEGIN
	insert into suma values(new.codi);
    if((select count(*) from suma ) > 10)then 
    delete from suma limit 1;
    end if;
END //
DELIMITER ;
insert into prova values (1);
insert into prova values (2);
insert into prova values (3);
insert into prova values (4);
insert into prova values (5);
insert into prova values (6);
insert into prova values (7);
insert into prova values (8);
insert into prova values (9);
insert into prova values (10);
insert into prova values (11);
insert into prova values (12);
insert into prova values (13);
insert into prova values (14);
select suma from suma;