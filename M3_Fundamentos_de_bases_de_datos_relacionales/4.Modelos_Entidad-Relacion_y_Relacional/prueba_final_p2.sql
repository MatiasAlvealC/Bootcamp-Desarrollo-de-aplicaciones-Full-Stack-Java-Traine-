-- Database: Questionario

-- DROP DATABASE IF EXISTS "Questionario";

CREATE DATABASE "Questionario"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
-- 4. Crea las tablas respetando los nombres, tipos, claves primarias y foráneas y tipos de datos.

-- Crear la tabla Preguntas

create table Preguntas (
	id integer primary key,
	pregunta varchar(255),
	respuesta_correcta varchar(255)
);

-- Crear la tabla Usuarios
create table Usuarios (
	id integer primary key,
	nombre varchar(255),
	edad integer
);

-- Crear la tabla Respuestas
create table Respuestas (
	id integer primary key,
	respuestas varchar(255),
	usuario_id integer references Usuarios(id) ON DELETE CASCADE,
	pregunta_id integer references Preguntas(id)
);

-- 5. Agrega datos, 5 usuarios y 5 preguntas, la primera pregunta debe estar contestada
-- dos veces correctamente por distintos usuarios, la pregunta 2 debe estar contestada
-- correctamente sólo por un usuario, y las otras 2 respuestas deben estar incorrectas.
--		a. Contestada correctamente significa que la respuesta indicada en la tabla
--		respuestas es exactamente igual al texto indicado en la tabla de preguntas.

-- Insertar 5 usuarios
insert into Usuarios (id, nombre, edad) values
	(1,'Juan Delgado', 25),
    (2,'Diego de Almagro', 30),
    (3,'Sebastian Diaz', 22),
    (4,'Javiera Carrera', 40),
    (5,'Ines del Carmen', 18);


-- Insertar 5 preguntas
insert into Preguntas (id, pregunta, respuesta_correcta) values
    (1,'¿Cuál es la capital de Francia?', 'París'),
    (2,'¿Cuál es el resultado de 2+2?', '4'),
    (3,'¿Cuál es el planeta más grande del sistema solar?', 'Júpiter'),
    (4,'¿En qué año ocurrió la Revolución Francesa?', '1789'),
    (5,'¿Quién escribió "Don Quijote de la Mancha"?', 'Cervantes');

-- Insertar respuestas
insert into Respuestas (id,respuestas,usuario_id,pregunta_id) values
    (1,'París', 1, 1),
    (2,'París', 2, 1),
    (3,'Madrid', 3, 1),
    (4,'4', 5, 2),
    (5,'Mercurio', 2, 3),
    (6,'1189', 1, 4),
    (7,'Allende', 1, 5);

-- 6. Cuenta la cantidad de respuestas correctas totales por usuario (independiente de la
-- pregunta).

SELECT u.nombre AS nombre_usuario, COUNT(*) AS respuestas_correctas_totales
FROM Usuarios u
JOIN Respuestas r ON u.id = r.usuario_id
JOIN Preguntas p ON r.pregunta_id = p.id
WHERE r.respuestas = p.respuesta_correcta
GROUP BY u.id;

-- 7. Por cada pregunta, en la tabla preguntas, cuenta cuántos usuarios tuvieron la
-- respuesta correcta.
SELECT p.pregunta AS pregunta, COUNT(*) AS usuarios_con_respuesta_correcta
FROM Preguntas p
JOIN Respuestas r ON p.id = r.pregunta_id
JOIN Usuarios u ON r.usuario_id = u.id
WHERE r.respuestas = p.respuesta_correcta
GROUP BY p.id;


-- 8. Implementa borrado en cascada de las respuestas al borrar un usuario y borrar el
-- primer usuario para probar la implementación.
select * from Usuarios
DELETE FROM Usuarios WHERE id = 1;

-- 9. Crea una restricción que impida insertar usuarios menores de 18 años en la base de datos.

ALTER TABLE Usuarios ADD CONSTRAINT edad_mayor_de_18 CHECK (edad >= 18);

-- 10. Altera la tabla existente de usuarios agregando el campo email con la restricción de único.

ALTER TABLE Usuarios ADD COLUMN email VARCHAR(255) UNIQUE;