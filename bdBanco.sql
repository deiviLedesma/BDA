create database banco;
use banco;

CREATE TABLE CLIENTE( 
idCliente int primary key auto_increment, 
nombre varchar(50) not null, 
apellidoPaterno varchar(50) not null, 
apelldioMaterno varchar(50), 
idDomicilio int, 
fechaNacimiento date not null, 
FOREIGN KEY (idDomicilio) REFERENCES DOMICILIO(idDomicilio) 
); 

 

CREATE TABLE DOMICILIO( 
idDomicilio int primary key auto_increment, 
calle varchar(25) not null, 
colonia varchar(25) not null, 
numero varchar(8) not null 
); 

 

CREATE TABLE CUENTA( 
idCuenta int primary key auto_increment, 
fechaApertura date, 
Saldo DECIMAL(10,2) not null, 
idCliente int, 
FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente) 
); 

 
CREATE TABLE TRANSFERENCIA( 
IdTransferencia int primary key auto_increment, 
FechaTransferencia date, 
Monto DECIMAL(10,2) not null, 
IdCuentaRecibe int not null, 
IdCuentaEnvia int not null,
FOREIGN KEY (idCuentaRecibe) REFERENCES CLIENTE(idCliente), 
FOREIGN KEY (idCuentaEnvia) REFERENCES CLIENTE(idCliente) 
); 

CREATE TABLE RETIROSINCUENTA( 
IdRetiro int primary key auto_increment, 
FechaExpiracion datetime, 
Folio varchar(25), 
Contraseña varchar(25) not null, 
Saldo DECIMAL(10,2) not null, 
IdCuenta int, 
FOREIGN KEY (idCuenta) REFERENCES CLIENTE(idCliente)
); 

 

CREATE TABLE RETIRO( 
IdRetiro int primary key auto_increment, 
Cantidad decimal(10,2) not null, 
Fecha date, 
IdCuenta int, 
FOREIGN KEY (idCuenta) REFERENCES CLIENTE(idCliente)
); 
