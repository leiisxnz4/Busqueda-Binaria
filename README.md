# Busqueda-Binaria

¿Cómo funciona el programa de Búsqueda Binaria?

Este programa utiliza el algoritmo de búsqueda binaria para encontrar un número dentro de un arreglo ordenado. La lógica principal consiste en ir reduciendo el rango de búsqueda dividiéndolo a la mitad, hasta encontrar el valor o confirmar que no existe.

1. Uso de low, high y mid

Para controlar la búsqueda, el método utiliza tres variables importantes:

low : marca el inicio del rango donde estoy buscando.

high : marca el final del rango.

mid : es el punto medio, calculado como:

mid = (low + high) / 2;


Estas variables permiten ir “acercándome” al número buscado sin tener que revisar todo el arreglo.

Si el valor en arr[mid] es igual al objetivo, ya se encontró.
Si el valor en mid es menor, significa que el número debe estar a la derecha, así que se mueve low.
Si es mayor, debe estar a la izquierda, así que se mueve high.

2. Lectura del archivo de entrada

El programa pide el nombre del archivo donde están los números ordenados.
Luego:

Abre el archivo.

Lee cada número línea por línea.

Los imprime en pantalla y los guarda en una lista.

Convierte esa lista en un arreglo para aplicar la búsqueda binaria.

Este paso asegura que los datos estén listos y en orden para poder aplicar el algoritmo.

3. Búsqueda del número

Después de cargar los datos, el usuario escribe el número que desea buscar.

El programa llama a:

int resultado = binarySearch(numeros, objetivo);


y obtiene la posición donde se encuentra, o –1 si no existe.

4. Escritura del archivo de salida

Finalmente, el programa escribe el resultado:

Si se encontró:
Número encontrado en la posición: X

Si no se encontró:
Número NO encontrado.

Así se guarda evidencia de la ejecución del programa.

- Ventaja principal

La búsqueda binaria es muy eficiente porque no revisa los elementos uno por uno, sino que reduce el espacio de búsqueda a la mitad en cada paso. Esto la hace ideal para trabajar con listas grandes siempre y cuando estén ordenadas.