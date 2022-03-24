drop database empresa;
create database empresa;
use empresa;

create table empleat(
codi int primary key,
nom varchar(15),
cognom varchar(30),
treball varchar(10),
codi_carrec int(4),
data_contracte date,
salari int(7),
comissio int(7),
departament int(2)
);

alter table empleat modify salari decimal(5, 2) NOT NULL;

CREATE table departament(
numero_dep int(2),
nom_dep char(9) primary key,
localitzacio char(10)
);
CREATE table departament2(
numero_dep int(2) primary key,
nom_dep char(9),
localitzacio char(10)
);

create table emplea2(
codi int,
nom varchar(15),
cognom varchar(30),
treball varchar(10),
codi_carrec int(4),
data_contracte date,
salari int(7),
comissio int(7),
departament int(2),
numero_dep int(2) primary key,
foreign key (numero_dep) references departament2(numero_dep)
);

alter table emplea2 add constraint unic_sal_communic_sal_comm unique(salari, comissio);
insert into departament (nom_dep) value ('adria'nom_depnom_dep);