-- Database: films

-- DROP DATABASE IF EXISTS films;

CREATE DATABASE films
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	
-- 1. Crea el modelo (revisa bien cuál es el tipo de relación antes de crearlo), respeta las
-- claves primarias, foráneas y tipos de datos.

-- Crear la tabla Peliculas
create table Peliculas (
	id integer primary key,
	nombre varchar(255),
	anno integer
);

-- Crear la tabla Tags
create table Tags (
	id integer primary key,
	tag varchar(32)
);

-- Crear la tabla Pelicula_tags
create  table Pelicula_tags (
	id integer primary key,
	fecha_asignacion date,
	relevancia integer,
	pelicula_id integer references Peliculas(id),
	tag_id integer references Tags(id)
);


-- 2. Inserta 5 películas y 5 tags, la primera película tiene que tener 3 tags asociados, la
-- segunda película debe tener dos tags asociados.

-- Insertar 5 películas
insert into Peliculas (id,nombre,anno) values
	(1,'Titanic',1999),
	(2,'Harry Potter 1',2001),
	(3,'Blade Runner',1973),
	(4,'El dia despues de mañana',2003),
	(5,'Peter Pan',2005);

-- Insertar 5 tags
insert into Tags (id,tag) values
	(1,'Drama'),
	(2,'Comedia'),
	(3,'Acción'),
	(4,'Ciencia ficción'),
	(5,'Romance');
	
	
-- Asignar tags a las películas

insert into Pelicula_tags (id,fecha_asignacion,relevancia,pelicula_id,tag_id) values
	(1,'2024-03-11',10,1,1),
	(2,'2023-02-15',9,1,5),
	(3,'2022-05-25',5,1,2),
	(4,'2020-03-16',10,2,4),
	(5,'2021-06-15',8,2,3);

    


-- 3. Cuenta la cantidad de tags que tiene cada película. Si una película no tiene tags debe
-- mostrar 0.

select Peliculas.id as id_pelicula, Peliculas.nombre as nombre_pelicula, count(Pelicula_tags.tag_id) as Cantidad_tags
from Peliculas left join Pelicula_tags on Peliculas.id = Pelicula_tags.pelicula_id 
group by Peliculas.id, Peliculas.nombre
order by Peliculas.id asc;


