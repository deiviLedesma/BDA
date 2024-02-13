create database BANCO;
use BANCO;

CREATE TABLE CLIENTE( 
idCliente int primary key auto_increment, 
nombre varchar(50) not null, 
apellidoPaterno varchar(50) not null, 
apelldioMaterno varchar(50), 
idDomicilio int, 
fechaNacimiento date, 
FOREIGN KEY (idDomicilio) REFERENCES DOMICILIO(idDomicilio) 
); 

 

CREATE TABLE DOMICILIO( 
idDomicilio int primary key auto_increment, 
calle varchar(25), 
colonia varchar(25), 
numero varchar(8) 
); 

 

CREATE TABLE CUENTA( 
idCuenta int primary key auto_increment,
fechaApertura date, 
Saldo DECIMAL(10,2), 
idCliente int, 
FOREIGN KEY (idCliente) REFERENCES CLIENTE(idCliente) 
); 

 

CREATE TABLE OPERACION( 
idOperacion int primary key auto_increment, 
tipoOperacion  ENUM('Deposito', 'Retiro', 'Retiro sin cuenta'), 
monto DECIMAL(10,2),
fechaOperacion DATETIME, 
idCuenta int, 
FOREIGN KEY (idCuenta) REFERENCES CUENTA(idCuenta)
); 