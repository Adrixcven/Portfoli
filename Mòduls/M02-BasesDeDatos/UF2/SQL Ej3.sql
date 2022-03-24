DROP DATABASE prova1;
CREATE DATABASE prova1;

USE prova1;

CREATE table CLIENT(
idclient int AUTO_INCREMENT PRIMARY KEY,
nom varchar(20),
cognom varchar(20),
data_naixement date,
tipus varchar(25) DEFAULT 'Habitual',
UNIQUE(nom, cognom)
);

DROP DATABASE prova1;