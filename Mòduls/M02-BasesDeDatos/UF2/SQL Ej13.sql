CREATE DATABASE IF NOT EXISTS entitatbancaria;

USE entitatbancaria;

CREATE TABLE IF NOT EXISTS entitatbancaria.centralsindical 
   ( codCen  TINYINT(2) PRIMARY KEY,
     nomCen VARCHAR(45) NOT NULL UNIQUE,
     quota DECIMAL(8,2)
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.categoria
   ( codCat TINYINT(2) PRIMARY KEY,
     nomCat VARCHAR(45),
     souBase DECIMAL(8,2) NOT NULL,
     horaExtra DECIMAL(8,2)
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.ciutat
   ( codCiu TINYINT(2) PRIMARY KEY,
     nomCiu VARCHAR(30) NOT NULL
   ) engine=InnoDB;

CREATE TABLE IF NOT EXISTS entitatbancaria.agencia
   ( codAg TINYINT(2) PRIMARY KEY,
     nom VARCHAR(45) NOT NULL,
     adreca VARCHAR(30),
     telefon CHAR(9),
     codCiu TINYINT(2),
     FOREIGN KEY (codCiu) REFERENCES entitatbancaria.ciutat (codCiu) ON DELETE SET NULL ON UPDATE CASCADE
   ) engine=InnoDB;


CREATE TABLE IF NOT EXISTS entitatbancaria.empleat
   ( codemp SMALLINT(3) PRIMARY KEY, 
     dni CHAR(9) UNIQUE NOT NULL,
     nom VARCHAR(45) NOT NULL,
     cognom VARCHAR(45) NOT NULL,
     codCiu TINYINT(2),
     codCen TINYINT(2),
     codCat TINYINT(2),
     codAg TINYINT(2),
     FOREIGN KEY (codCiu) REFERENCES entitatbancaria.ciutat (codCiu),
     FOREIGN KEY (codCen) REFERENCES entitatbancaria.centralsindical (codCen),
     FOREIGN KEY (codCat) REFERENCES entitatbancaria.categoria (codCat),
     FOREIGN KEY (codAg) REFERENCES entitatbancaria.agencia (codAg)
   ) engine=InnoDB;


CREATE TABLE IF NOT EXISTS entitatbancaria.titol
   ( codTit TINYINT(2) PRIMARY KEY,
     nomTit CHAR(45) NOT NULL
   ) engine=InnoDB;


CREATE TABLE IF NOT EXISTS entitatbancaria.titulacions
   (  codEmp SMALLINT(3),
      codTit TINYINT(2), 
      dataObt DATE,
      PRIMARY KEY (codEmp, codTit),
      FOREIGN KEY (codEmp) REFERENCES entitatbancaria.empleat (codEmp) ON DELETE CASCADE ON UPDATE CASCADE,
      FOREIGN KEY (codTit) REFERENCES entitatbancaria.titol (codTit) ON DELETE CASCADE ON UPDATE CASCADE
    ) engine=InnoDB;
    
    insert into entitatbancaria.titol(codTit, nomTit) values (12,'Adria');
    insert into entitatbancaria.centralsindical(codCen, nomCen, quota) values (22, 'Nombrealeatorio', 5);
    insert into entitatbancaria.ciutat(codCiu, nomCiu) values (53, 'Terrassa');
    insert into entitatbancaria.categoria(codCat, nomCat, souBase, horaExtra) values (66, 'Categoria1', 70, 1.25);