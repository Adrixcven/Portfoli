DROP DATABASE IF EXISTS banco;
CREATE DATABASE banco;
USE banco;
CREATE TABLE moviment
(compte VARCHAR(10) NOT NULL,
data datetime NOT NULL DEFAULT now(),
descripcio VARCHAR(30) NOT NULL,
tipus ENUM('H','D') NOT NULL,
valor DECIMAL(7,2) NOT NULL
);
CREATE TABLE seguretat
(compte VARCHAR(10) NOT NULL,
data TIMESTAMP NOT NULL,
usuari VARCHAR(20) NOT NULL,
descripcio_valor VARCHAR(30) NOT NULL
);
CREATE TABLE saldo
(compte VARCHAR(10) PRIMARY KEY,
saldo DECIMAL(7,2) NOT NULL
);
CREATE TABLE saldo_diari
(data  DATE PRIMARY KEY,
saldo DECIMAL(7,2) NOT NULL
);
DELIMITER //
CREATE TRIGGER inserte after insert ON moviment FOR EACH ROW
BEGIN 
declare suel DECIMAL(7,2);
if ((select count(*) from saldo where compte = new.compte) = 0) then
insert into saldo value (new.compte, 0);
end if;
if ((select count(*) from saldo_diari where data = date(new.data)) = 0) then
insert into saldo_diari value (date(new.data), 0);
set suel= select saldo from saldo_diari
end if;
if(new.tipus = "H") then
insert into seguretat value (new.compte, new.data, current_user(), concat(new.descripcio, new.valor));
update saldo set saldo = saldo + new.valor where compte = new.compte;
update saldo_diari set saldo = suel + new.valor where data = date(new.data);
set suel=saldo_diari.saldo;
elseif (new.tipus = "D") then
insert into seguretat value (new.compte, new.data, current_user(), concat(new.descripcio, new.valor));
update saldo set saldo = saldo - new.valor where compte = new.compte;
update saldo_diari set saldo = suel - new.valor where data = date(new.data);
set suel=saldo_diari.saldo;
end if;
end
//
DELIMITER ;
INSERT INTO moviment VALUES ('aloha', now(), 'Ingrés ', 'H', 30);
INSERT INTO moviment VALUES ('aloha', now(), 'Ingrés ', 'H', 30);
INSERT INTO moviment VALUES ('aloha', now(), 'Reintegrament -', 'D', 30);
INSERT INTO moviment VALUES ('aloha', '2022-03-22', 'Reintegrament -', 'D', 30);
select * from seguretat;
select * from saldo;
select * from saldo_diari;