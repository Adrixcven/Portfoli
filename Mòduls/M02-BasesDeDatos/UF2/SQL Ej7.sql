CREATE DATABASE institut;

USE institut;

CREATE table assignatures(
codi smallint(3) primary key,
nom varchar(20),
cicle varchar(20),
curs varchar(20)
);

CREATE table professor(
codi_profesor smallint primary key,
nom varchar(20),
cognom varchar(20),
data_naixement date,
adreça varchar(20),
telefon varchar(20)
);

CREATE table alumne(
codi_alumne smallint primary key,
nom varchar(20),
cognom varchar(20),
data_naixement date,
adreça varchar(20),
telefon varchar(20),
primera_matricula date
);

CREATE table alumne_assig_prof(
codi_alumne smallint,
codi_assignatura smallint,
codi_prof smallint,
primary key(codi_alumne, codi_assignatura, codi_prof),
foreign key(codi_alumne) references alumne(codi_alumne),
foreign key(codi_assignatura) references assignatures(codi),
foreign key(codi_prof) references professor(codi_profesor)
);


DROP DATABASE institut;