drop database entitat_bancaria;
CREATE DATABASE entitat_bancaria;

USE entitat_bancaria;


create table titol(
codi int primary key,
nom varchar(20)
);

create table categoria(
codi int primary key,
nom varchar(20),
sou_base decimal (5,2),
hores_extres time
);
create table central_sindical (
codi int primary key,
nom varchar(20),
quota decimal (5,2)
);

create table ciutat(
codi int primary key,
nom varchar(20)
);
create table agencia (
codi int primary key,
nom varchar(20),
adreça varchar(50),
telefon varchar(9),
codi_ciutat int,
foreign key (codi_ciutat) references ciutat(codi)
);
CREATE table empleat(
codi int primary key,
dni int,
nom varchar(20),
cognom varchar(30),
codi_categoria int,
codi_central_sindical int,
codi_ciutat int,
codi_agencia int,
foreign key (codi_categoria) references categoria(codi),
foreign key (codi_central_sindical) references central_sindical(codi),
foreign key (codi_ciutat) references ciutat(codi),
foreign key (codi_agencia) references agencia(codi)
);
create table titulacions(
codi_titol int,
codi_empleat int,
data_obtencio date,
primary key (codi_titol, codi_empleat),
foreign key (codi_empleat) references empleat(codi),
foreign key (codi_titol) references titol(codi)
);

