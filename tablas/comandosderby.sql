-- ----------------------------
-- Table structure users
-- ----------------------------

CREATE TABLE users  (
    uid int primary key not null,
    uname varchar(30) not null,
    password varchar(30) not null)

-- ----------------------------
-- Table structure for tipos_id
-- ----------------------------

CREATE TABLE tipo_id  (
    tipo_id varchar(3) primary key not null,
    description varchar(30) not null unique);

-- ----------------------------
-- Table structure for clientes
-- ----------------------------

CREATE TABLE clientes  (
    id int primary key not null,
    tipo_id varchar(3) NOT NULL,
    nombres varchar(50) NOT NULL ,
    apellidos varchar(50) NOT NULL,
    fecha_ingreso date NOT NULL,
    direccion varchar(100) NOT NULL,
    telefono varchar(15) NOT NULL,
    foreign key (tipo_id) references tipos_id);

-- ----------------------------
-- Table structure for proveedores
-- ----------------------------

CREATE TABLE proveedores (
    id int primary key not null,
    tipo_id varchar(3) NOT NULL,
    nombres varchar(50) NOT NULL,
    fecha_ingreso date NOT NULL,
    direccion varchar(100) NOT NULL,
    telefono varchar(15) NOT NULL,
    foreign key (tipo_id) references tipos_id);


-- ----------------------------
-- Table structure for productos
-- ----------------------------

CREATE TABLE productos  (
    id varchar(10) primary key not null,
    descripcion varchar(200)  not null,
    costo int  not null,
    precio int  not null
);

-- ----------------------------
-- Table structure for productos_proveedores
-- ----------------------------

CREATE TABLE productos_proveedores  (
    id_producto varchar(10) primary key not null,
    id_proveedor int not null,
    foreign key (id_producto) references productos,
    foreign key (id_proveedor) references proveedores);


-- ----------------------------
-- Table structure for ventas
-- ----------------------------


CREATE TABLE ventas  (
    id_pago int primary key generated always as identity (start with 1,increment by 1),
    id_cliente int NOT NULL,
    fecha date NOT NULL,
    id_producto varchar(10) NOT NULL,
    cantidad int NOT NULL,
    foreign key (id_cliente) references clientes,
    foreign key (id_producto) references productos); 



-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO users VALUES (0214, 'jose','jose');
INSERT INTO users VALUES (1125, 'joseberrio','miguelito');
INSERT INTO users VALUES (2027, 'pinguinos','dbr');
INSERT INTO users VALUES (1999, 'rociodetodosloscampos','natalia');
INSERT INTO users VALUES (1993, 'sophie','infatuation');
INSERT INTO users VALUES (2021, 'reverie','arca');
INSERT INTO users VALUES (0418, 'mirandoelfuego','elbuho');
INSERT INTO users VALUES (0428, 'motoc','loscil');
INSERT INTO users VALUES (0413, 'mutant','arca');
INSERT INTO users VALUES (0902, 'axolotl','doonkanda');
INSERT INTO users VALUES (7777, 'florecer','nanosterm');
INSERT INTO users VALUES (666, 'siddhartha','naufrago');
INSERT INTO users VALUES (59, 'siembra','bombaestereo');
INSERT INTO users VALUES (1, 'ryancastro','kingcastro');
INSERT INTO users VALUES (0, 'quechimbaso','sagradorostro');

-- ----------------------------
-- Records of tipos_id
-- ----------------------------
INSERT INTO tipos_id VALUES ('CC', 'CEDULA DE CIUDADANIA');
INSERT INTO tipos_id VALUES ('CE', 'CEDULA DE EXTRANJERIA');
INSERT INTO tipos_id VALUES ('CN', 'CONTRASENA');
INSERT INTO tipos_id VALUES ('NIT', 'NIT');
INSERT INTO tipos_id VALUES ('PP', 'PASAPORTE');

-- ----------------------------
-- Records of clientes
-- ----------------------------
INSERT INTO clientes VALUES (11111, 'CE', 'BILL', 'GATES', '2018-08-16', 'CALLE 30 #20-10', '12340');
INSERT INTO clientes VALUES (22222, 'CE', 'STEVE', 'JOBS', '2018-08-16', 'DIAGONAL 74 #30-65', '12341');
INSERT INTO clientes VALUES (33333, 'CC', 'MARISSA', 'MAYER', '2018-08-16', 'CARRERA 42 #53-62', '12342');
INSERT INTO clientes VALUES (44444, 'PP', 'SATYA', 'NADELLA', '2018-08-16', 'CIRCULAR 3 # 64-54', '12343');
INSERT INTO clientes VALUES (55555, 'CC', 'JEFF', 'BEZOS', '2018-08-16', 'CALLE 50 #40-30', '12344');

-- ----------------------------
-- Records of proveedores
-- ----------------------------
INSERT INTO proveedores VALUES (10000, 'NIT', 'SAMSUNG', '2018-08-16', 'CENTRO COMERCIAL EL TESORO LOCAL 4530', '121350');
INSERT INTO proveedores VALUES (66666, 'NIT', 'HUAWEI', '2018-08-16', 'CENTRO COMERCIAL IDEO', '12346');
INSERT INTO proveedores VALUES (77777, 'NIT', 'INTEL', '2018-08-16', 'BARRIO TRISTE LOCAL 450', '12347');
INSERT INTO proveedores VALUES (88888, 'NIT', 'ARDUINO', '2018-08-16', 'CALLE 60 #56-28', '12348');
INSERT INTO proveedores VALUES (99999, 'CC', 'DUBERNEY RIOS', '2018-08-16', 'CARRERA 10 #34-235', '12349');

-- ----------------------------
-- Records of productos
-- ----------------------------
INSERT INTO productos VALUES ('LED_MULTI', 'LED MULTICOLOR', 7000, 9000);
INSERT INTO productos VALUES ('LED_ROJO', 'LED DE COLOR ROJO', 5000, 6000);
INSERT INTO productos VALUES ('LED_VERDE', 'LED DE COLOR VERDE', 3000, 3500);
INSERT INTO productos VALUES ('ROTARY_ENC', 'ROTARY ENCODER', 1800, 2100);
INSERT INTO productos VALUES ('S_HUMEDAD', 'SENSOR DE HUMEDAD', 4500, 5000);
INSERT INTO productos VALUES ('S_PRES_AGU', 'SENSOR DE PRESION DE AGUA', 950, 1100);
INSERT INTO productos VALUES ('S_PRES_AIR', 'SENSOR DE PRESION DE AIRE', 15000, 17500);
INSERT INTO productos VALUES ('S_SONIDO', 'SENSOR DE SONIDO', 11000, 14000);
INSERT INTO productos VALUES ('S_TEM_ANA', 'SENSOR DE TEMPERATURA ANALOGICO', 23500, 25000);
INSERT INTO productos VALUES ('S_TEM_DIG', 'SENSOR DE TEMPERATURA DIGITAL', 115000, 130000);

-- ----------------------------
-- Records of productos_proveedores
-- ----------------------------
INSERT INTO productos_proveedores VALUES ('LED_MULTI', 77777);
INSERT INTO productos_proveedores VALUES ('LED_ROJO', 66666);
INSERT INTO productos_proveedores VALUES ('LED_ROJO', 77777);
INSERT INTO productos_proveedores VALUES ('ROTARY_ENC', 99999);
INSERT INTO productos_proveedores VALUES ('S_HUMEDAD', 99999);
INSERT INTO productos_proveedores VALUES ('S_PRES_AGU', 99999);
INSERT INTO productos_proveedores VALUES ('S_PRES_AIR', 66666);
INSERT INTO productos_proveedores VALUES ('S_SONIDO', 10000);
INSERT INTO productos_proveedores VALUES ('S_SONIDO', 66666);
INSERT INTO productos_proveedores VALUES ('S_SONIDO', 77777);
INSERT INTO productos_proveedores VALUES ('S_SONIDO', 88888);
INSERT INTO productos_proveedores VALUES ('S_SONIDO', 99999);
INSERT INTO productos_proveedores VALUES ('S_TEM_ANA', 66666);
INSERT INTO productos_proveedores VALUES ('S_TEM_ANA', 77777);
INSERT INTO productos_proveedores VALUES ('S_TEM_ANA', 88888);
INSERT INTO productos_proveedores VALUES ('S_TEM_DIG', 99999);

-- ----------------------------
-- Records of ventas
-- ----------------------------
INSERT INTO ventas VALUES (1, 11111, '2018-08-13', 'S_TEM_DIG', 2);
INSERT INTO ventas VALUES (2, 22222, '2018-08-14', 'S_PRES_AIR', 20);
INSERT INTO ventas VALUES (3, 33333, '2018-08-08', 'S_PRES_AGU', 100);
INSERT INTO ventas VALUES (4, 44444, '2018-08-06', 'LED_MULTI', 5000);
INSERT INTO ventas VALUES (5, 44444, '2018-08-03', 'LED_ROJO', 100);
INSERT INTO ventas VALUES (6, 55555, '2018-07-18', 'S_HUMEDAD', 13);
INSERT INTO ventas VALUES (7, 55555, '2018-07-11', 'LED_VERDE', 24);
INSERT INTO ventas VALUES (8, 44444, '2018-07-22', 'S_SONIDO', 65);
INSERT INTO ventas VALUES (9, 33333, '2018-08-15', 'S_TEM_ANA', 23);
INSERT INTO ventas VALUES (10, 11111, '2018-07-12', 'S_PRES_AIR', 12);
INSERT INTO ventas VALUES (11, 55555, '2018-08-19', 'S_TEM_DIG', 42);
INSERT INTO ventas VALUES (12, 11111, '2018-07-03', 'S_TEM_DIG', 23);
INSERT INTO ventas VALUES (13, 11111, '2018-07-03', 'S_TEM_ANA', 1);
INSERT INTO ventas VALUES (14, 11111, '2018-07-03', 'S_TEM_ANA', 5);


