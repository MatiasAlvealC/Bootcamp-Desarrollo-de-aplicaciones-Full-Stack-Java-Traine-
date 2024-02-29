-- Database: desafio-Matias-Alveal-616

-- DROP DATABASE IF EXISTS "desafio-Matias-Alveal-616";

CREATE DATABASE "desafio-Matias-Alveal-616"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	

-- crea tabla clientes	
create table clientes(
	email varchar(50),
	nombre varchar,
	telefono varchar(16),
	empresa varchar(50),
	prioridad smallint check (prioridad between 1 and 10)
	);

-- ingresar 5 datos de clientes

insert into clientes values ('cliente1@example.com', 'Diego de Almagro', '+56988747574', 'ABC Inc.', 5);
insert into clientes values ('cliente2@example.com', 'María González', '+56987654321', 'Tech Sol', 8);
insert into clientes values ('cliente3@example.com', 'Carlos Lagos', '+56955512367', 'Global C.', 3);
insert into clientes values ('cliente4@example.com', 'Ana Maria Martínez', '+56988364547', 'Evil Corp', 10);
insert into clientes values ('cliente5@example.com', 'Pedro Torres', '+56960665854', 'Home House', 2);

-- seleccionar 3 clientes de mayor prioridad

select * from clientes
order by prioridad desc limit 3

-- Selecciona, de la tabla clientes, una prioridad o una empresa, de forma que el
-- resultado devuelva 2 registros

select empresa from clientes
where telefono like '+5698%' limit 2

