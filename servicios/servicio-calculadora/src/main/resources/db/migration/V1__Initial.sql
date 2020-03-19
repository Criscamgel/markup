create table aliado(
	id serial primary key not null,
	nombre_aliado varchar(100),
	activo boolean DEFAULT true
);

create table usuario(
	id serial primary key not null,
	nombre_usuario varchar(100),
	id_aliado integer not null,
	activo boolean DEFAULT true,
	FOREIGN KEY (id_aliado) REFERENCES aliado (id)
);

create table parametro(
	id serial primary key not null,
	id_aliado integer not null,
	nombre varchar(100),
	tipo varchar(100),
	valor_numerico decimal,
	valor_texto text,
	activo boolean DEFAULT true,
	FOREIGN KEY (id_aliado) REFERENCES aliado (id)
);

create table simulacion_cuota(
	id serial primary key not null,
	id_usuario integer not null,
	id_solicitud_credito integer not null,
	monto decimal(100,2),
	cuotas integer,
	cuota_con_seguro decimal(100,2),
	cuota_sin_seguro decimal(100,2),
	valor_seguro decimal(100,2),
	costo_mensual_seguro decimal(100,2),
	monto_total decimal(100,2),
	fecha_simulacion timestamp WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (id_usuario) REFERENCES usuario (id)
);

insert into aliado(nombre_aliado) values('colsanitas');
insert into aliado(nombre_aliado) values('gaes');
insert into usuario(nombre_usuario, id_aliado) values('colsanitas', 1);
insert into usuario(nombre_usuario, id_aliado) values('gaes', 2);

insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'tasa','Eps', 0.0000000001);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'tasa','Cuota36', 0.0604);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'tasa','Prepagada', 0.24);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(2, 'tasa','estandar', 0.0000000000001);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'descuento','cuota6', 0.0);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'descuento','cuota12', 0.0);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'descuento','cuota18', 0.0);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'descuento','cuota24', 0.0);
insert into parametro(id_aliado,tipo,nombre,valor_numerico) values(1, 'descuento','cuota36', 0.0);