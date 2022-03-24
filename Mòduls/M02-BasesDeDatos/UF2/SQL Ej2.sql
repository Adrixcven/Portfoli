
DROP DATABASE prova1;
CREATE DATABASE prova1;

USE prova1;


CREATE table CIUTAT(
nom VARCHAR(25) PRIMARY KEY,
comarca VARCHAR(25) not null,
provincia VARCHAR(25) not null,
habitants int
);
