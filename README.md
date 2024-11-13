En tu primer trabajo como programador experto te piden crear el software
de una máquina de expendedora.

Cada producto tendrá un nombre y un precio, estos datos estarán contenidos en las
siguientes matrices que ya te los da el proveedor:

String[][] productos = {
{“KitKat”, “Sandwich mixto”, “Kinder Bueno”, “Caña chocolate”},
{“Pringles”, “Coca cola”, “Monster”, “Agua”},
{“Aquarius”, “Patatas sabor jamón”, “Coca cola”, “Twix”},
{“Mars”, “Snickers”, “Monster”, “M&M’s”}
};

double[][] precios = {
{1.2, 1.6, 1.3, 1.8},
{1.55, 0.8, 0.95, 0.6},
{0.8, 0.65, 0.8, 1.2},
{1.25, 1.35, 0.95, 0.85}
};

Cada producto tendrá también un stock inicial, que en principio será de 3.
Deberás presentar al usuario un pequeño menú con las siguientes opciones:

1. Pedir producto
2. Mostrar productos
3. Recargar productos
4. Apagar máquina
   
A continuación, se explica qué hace cada opción del menú:

Pedir producto: Se pedirá al usuario la posición del producto que quiere comprar. La
máquina almacena cada producto según su fila y columna, que será lo que el usuario debe
introducir.
Por ejemplo, si el usuario introduce 34, estará pidiendo el producto que está en la fila 3
columna 4, que en nuestro caso será un “Twix”.

Habrá que comprobar que haya stock suficiente, en caso de que no quede, se avisará al
usuario.

El usuario solo podrá pedir un producto cada vez, y no importará el dinero a la hora de
comprar.

Recuerda disminuir el stock cuando el usuario haga una compra.

Mostrar productos: se mostrará al usuario todos los productos disponibles. Se mostrará el
código que debe introducir el usuario, el nombre y su precio. El stock no se mostrará.
Por ejemplo:

00. KitKat - Precio 1.2€
01. Sandwich Mixto - Precio: 1.6€
02. Kinder Bueno - Precio: 1.3€
…

Recargar productos: esta función es de uso exclusivo para los técnicos, así que pedirá una
contraseña al usuario al elegir esta opción. Si el usuario introduce “DAW20-21”, será
correcto y se le pedirá la posición del producto que va a recargar, y la cantidad a recargar.
Esta acción debe actualizar el stock que tenía el producto sumando la nueva recarga.

En caso de que se introduzca una contraseña incorrecta, se avisará al usuario.

Apagar máquina: esta acción hará que el programa termine. Al finalizar, se mostrará por
pantalla la suma total de las ventas durante la ejecución del programa, y, para terminar, un
mensaje avisando del apagado de la máquina.

Recuerda usar funciones para aquellas acciones que creas necesarias, o para esas partes de
código que se puedan repetir en distintas partes del programa.
