create database BodegaApp;
use BodegaApp;

create table Empleado (
Id_Empleado integer auto_increment,
Nombre varchar (20) not null,
Apellido varchar (20) not null,
Area_de_trabajo varchar (20) not null,
primary key (Id_empleado,Area_de_trabajo)
);

create table Empleado_Bodega(
Numero integer auto_increment,
Empleado varchar (40) not null,
primary key (Numero),
foreign key (Empleado) references Empleado (Id_Empleado,Area_de_trabajo)
);

create table Empleado_Cliente(
Numero integer auto_increment,
Empleado varchar (40) not null,
primary key (Numero),
foreign key (Empleado) references Empleado (Id_Empleado,Area_de_trabajo)
);

create table Bodega(
Id_Bodega integer auto_increment,
Nombre varchar (20) not null,
Id_Empleado integer (40) not null,
primary key (Id_Bodega,Nombre),
foreign key (Id_Empleado) references Empleado_Bodega (Empleado)
);

create table Producto(
Codigo_Producto integer auto_increment,
Nombre varchar (30) not null,
Id_Producto Varchar (30) not null,
primary key (Codigo_Producto)
);

create table Salida(
Id_Salida integer auto_increment,
fecha_salida timestamp not null,
Id_Empleado integer (40) not null,
Codigo_Producto integer auto_increment,
Id_Bodega integer auto_increment,
Cantidad integer (1000) not null,
primary key (Id_Salida),
foreign key (Id_Empleado) references Empleado_Cliente (Empleado),
foreign key (Codigo_Producto) references Producto (Codigo_Producto),
foreign key (Id_Bodega) references Bodega (Id_Bodega)
);

create table Detalle_Orden_de_Compra (
Id_Detalle_Orden_de_Compra integer auto_increment,
Id_Producto integer auto_increment,
cantidad integer (40) not null,
primary key (Id_Detalle_Orden_de_Compra),
foreign key (Id_Producto) references Producto (Codigo_Producto)
);

create table Proveedor (
Id_Proveedor integer auto_increment,
Nombre varchar (40) not null,
Direccion varchar (40) not null,
Telefono integer (10),
primary key (ID_Proveedor)
);

create table Orden_de_Compra(
Id_Orden_de_Compra integer auto_increment,
Id_Proveedor integer auto_increment,
Id_Detalle_Orden_de_Compra integer auto_increment,
Fecha_de_compra timestamp not null,
primary key (Id_Orden_de_Compra),
foreign key (Id_Proveedor ) references Proveedor (ID_Proveedor),
foreign key (Id_Detalle_Orden_de_Compra) references Detalle_Orden_de_Compra (Id_Detalle_Orde_de_Compra)
);

create table Ingreso(
Id_Ingreso integer auto_increment,
fecha_de_ingreso timestamp not null,
Id_Empleado integer (40) not null,
Id_Orden_de_Compra integer auto_increment,
ID_Bodega integer auto_increment,
primary key (Id_Ingreso),
foreign key (Id_Empleado) references Empleado_Bodega (Empleado),
foreign key (Id_Orden_de_Compra ) references Orden_de_Compra (ID_Orden_de_Compra),
foreign key (Id_Bodega) references Bodega (Id_Bodega)
);

create table Stock(
Numero_Stock integer auto_increment,
Id_Bodega integer auto_increment,
Id_Codigo_Producto integer auto_increment,
primary key (Numero_Stock),
foreign key (Id_Bodega) references Bodega (Id_Bodega),
foreign key (Id_Codigo_Producto ) references Producto (Codigo_Producto)
);