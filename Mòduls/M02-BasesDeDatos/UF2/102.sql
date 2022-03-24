/*ej1*/
select a.nom_popular from planta a, exemplar_planta b
where b.nom_planta = a.nom_cientific
group by b.nom_planta
having count(b.num_exemplar) = 1;
/*ej 2*/
select distinct a.nom_popular from planta a, exemplar_planta b
where a.nom_cientific not in (select nom_planta from exemplar_planta);

/* ej 3*/
select nom_planta, nom_estacio, count(nom_estacio) from dosi_adob group by nom_estacio;

/*ej 4*/
select a.nom_popular, b.num_exemplar from planta a, exemplar_planta b, planta_interior c
where c.temperatura = 17 and b.nom_planta = a.nom_cientific and c.nom_planta = a.nom_cientific 
union
select a.nom_popular, b.num_exemplar from planta a, exemplar_planta b, planta_exterior c
where b.nom_planta = a.nom_cientific and c.nom_planta = a.nom_cientific;

/*ej 5*/
select nom_planta, nom_estacio from dosi_adob 
group by nom_planta
having nom_estacio not in ("Primavera");

/*ej 6*/
select a.nom_popular, count(b.metode_reproduccio) from planta a, reproduccio b
where a.nom_cientific = b.nom_planta
group by nom_planta;

/*ej7*/
select a.nom_popular, count(b.metode_reproduccio) from planta a, reproduccio b
where b.grau_exit = "Alt" and a.nom_cientific = b.nom_planta
group by nom_planta;

/*ej8*/
select a.nom_popular from planta a, reproduccio b
where b.metode_reproduccio != "Esqueix" and a.nom_cientific = b.nom_planta
group by nom_planta;

/*ej9*/
select a.nom_popular from planta a, planta_interior b
where a.floracio = "Primavera" and b.nom_planta = a.nom_cientific;

/*ej10*/
select a.nom_firma, count(b.quantitat_adob) from adob a, dosi_adob b
where a.nom_adob = b.nom_adob 
group by nom_firma