# Empresa de Tauret
- - -
La empresa Tauret administrada por *Alejandro Castillo* Con el proposito de realizar,
mantenimiento preventivo y venta de equipos de computo.

Necesita realizar un software/api especializado para el calculo de un promedio del total
de ventas por cliente que se realizen por jornada.

El administrador necesita ingresar los siguiente datos del usuario:
* Identificacion
* Nombre
* El valor de los productos

- - -

Para el realize del software/api se requiere:
* Historia de usuario
* Caso de uso
* Diagrama del flujo del software
* Pseudocodigo del software
* Funcionamiento



- - -

#### Historia de usuario
***

![HistoriaUsuario](/img/Historia%20de%20Usuarios.png)
***

#### Casos de uso
***

![CasosDeUso](/img/Casos%20de%20uso.png)
Descripcion del caso de uso
Nombre: Calcular el promedio de ventas de computador
Actores: Aministrador
Proposito: Poder promediar las ventas de computadores diarias
###### Curso Normal de eventos:
* El administrador ingresa la cantidad de clientes.
* El administrador ingresa la cedula del cliente, nombre y el valor de venta de los computadores.
* Se calcula el promedio a partir de: (∑(Computador 1,Computador 2,Computador 3) / Cantidad de computadores) / Cantidad de clientes.
* Se calcula el promedio de ventas del dia.
***

#### Diaframa de flujo
***
![DiagramaDeFlujo](/img/Diagrama%20de%20fluyo.png)
***

#### Taller
***
![Taller](/img/Taller.png)
***
#### Funcionamiento
***
![Procedimiento](/img/Procedimiento1.png)
***

#### Taller Con Objetos
***
![Objetos](/img/Objetos2.png)
***
![Objetos2](/img/Objetos1.png)
***

#### Funcionamiento
***
![Procedimiento2](/img/Procedimiento2.png)

#### Pseudocodigo
***

     Algoritmo ventas
	Definir clientes,Prod1,Prod2,Prod3,promedio,ids Como Entero
	Definir nombre Como Caracter
	promedio <- 0
	Escribir 'Digite el numero de clientes'
	Leer clientes
	Dimension id[tam]
	Dimension produ1[tam]
	Dimension produ2[tam]
	Dimension produ3[tam]
	Dimension nombres[tam]
	Para i<-0 Hasta clientes Hacer
		Escribir 'Digite su numero de identidad'
		Leer ids
		Escribir 'Ingrese su nombre'
		Leer nombre
		Escribir 'Ingrese el valor del primer producto'
		Leer Prod1
		Escribir 'Ingrese el valor del segundo producto'
		Leer Prod2
		Escribir 'Ingrese el valor del tercer producto'
		Leer Prod3
		id[i] <- ids
		produ1[i] <- Prod1
		produ2[i] <- Prod2
		produ3[i] <- Prod3
		promedio <- (((produ1[i]+produ2[i]+produ3[i])/3)/clientes)+promedio
	FinPara
	Escribir 'El promedio de ventas fue: ',promedio
FinAlgoritmo
