-- Database: pelicula_db

-- DROP DATABASE IF EXISTS pelicula_db;

CREATE DATABASE pelicula_db
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
-- 3.	Obtener el ID de la película “Titanic”.
select id from peliculas
where pelicula_nombre = 'Titanic';

-- 4.	Listar a todos los actores que aparecen en la película "Titanic".

SELECT reparto.actor as actor_titanic
FROM reparto
JOIN peliculas ON reparto.id = peliculas.id
WHERE peliculas.pelicula_nombre = 'Titanic';


-- 5.	Consultar en cuántas películas del top 100 participa Harrison Ford.

select count(pelicula_nombre) as pelicula_Harrison_Ford
from peliculas 
join reparto on reparto.id = peliculas.id
where reparto.actor= 'Harrison Ford';

-- 6.	Indicar las películas estrenadas entre los años 1990 y 1999 ordenadas por título de manera ascendente.

select pelicula_nombre,estreno from peliculas
where estreno between 1990 and 1999
order by pelicula_nombre asc;

-- 7.	Hacer una consulta SQL que muestre los títulos con su longitud, la longitud debe ser nombrado para
-- la consulta como “longitud_titulo”.

select pelicula_nombre,length(pelicula_nombre) as longitud_titulo 
from peliculas


-- 8.	Consultar cual es la longitud más grande entre todos los títulos de las películas.

select max(length(pelicula_nombre)) as longitud_titulo
from peliculas;
