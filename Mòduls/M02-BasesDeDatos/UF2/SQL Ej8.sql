
CREATE DATABASE botigadvd;

USE botigadvd;

CREATE table usuaris(
codi_usuari int auto_increment primary key,
dni varchar(9) not null unique,
nom text(20) not null,
cognoms text(40) not null,
adreça text (50) not null,
poblacio varchar(20) default 'Terrassa' not null,
sexe ENUM('H','D') not null,
telefon text(9),
mobil varchar(9) unique,
correu_electronic varchar(30) unique,
data_naixement date check (data_naixement > '1900/1/1') not null
);
create table categoria (
codi_categoria int auto_increment primary key,
categoria varchar(30) not null unique
);
CREATE table pelicula(
codi_pelicula int auto_increment primary key,
titol varchar(30) UNIQUE not null unique,
director text(30) not null,
actor text(50) not null,
productora text(30) not null,
any_filmacio int(4) check (any_filmacio > 1900) not null,
argument text,
durada int(3) check (durada >= 1 AND durada <= 300) not null,
data_alta date check (data_alta > '2001/1/1') default '2021/11/04' not null,
nacionalitat text(30) not null,
baixa ENUM('S','N') default 'N' not null,
codi_categoria int not null,
foreign key (codi_categoria) references categoria(codi_categoria)
);

create table copia(
codi_copia int,
codi_pelicula int,
primary key (codi_copia, codi_pelicula),
foreign key (codi_pelicula) references pelicula(codi_pelicula)
);
create table lloga(
codi_usuari int,
codi_copia int,
codi_pelicula int,
data_lloguer date DEFAULT '2021/11/04' not null,
data_retorn date,
primary key (codi_usuari, codi_copia, codi_pelicula),
foreign key (codi_usuari) references usuaris(codi_usuari),
foreign key (codi_copia) references copia(codi_copia),
foreign key (codi_pelicula) references pelicula(codi_pelicula)
);

