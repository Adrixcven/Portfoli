CREATE DATABASE botiga;

USE botiga;

CREATE table FABRICANT(
codi_fabricant smallint primary key,
nom varchar(20),
adreça varchar(20),
telefon varchar(9)
);

CREATE table Producte(
codi smallint primary key,
nom varchar(20),
descripcio varchar(20),
categoria varchar(20),
preu decimal (5,2),
codi_fabricant int,
foreign key (codi_fabricant) references FABRICANT(codi_fabricant)
);

DROP DATABASE botiga;