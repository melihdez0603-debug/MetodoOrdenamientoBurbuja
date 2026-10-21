Practica:Algoritmo de Ordenamiento Burbuja
Alumno:Jesus Meliton Hernandez Hernandez
Grado:4Cuatrimestre Grupo:B
El código implementa correctamente ambas variantes del algoritmo de ordenamiento por burbuja en Java, destacando la diferencia clave entre la versión clásica y la optimizada mediante el uso de una bandera booleana.Análisis del CódigoordenamientoBurbuja (Versión Tradicional): Ejecuta de forma estricta los ciclos anidados sin importar el estado del arreglo. Su complejidad temporal se mantiene siempre en $O(n^2)$, incluso si los elementos ya se encuentran ordenados desde el inicio.
ordenamientoBurbujaMejorado (Versión Optimizada): Incorpora la variable booleana intercambio. Si una pasada completa finaliza sin realizar ningún movimiento, se asume que el arreglo está ordenado y la instrucción break detiene la ejecución inmediatamente, logrando un mejor caso de $O(n)$ para arreglos parcialmente ordenados.
<img width="805" height="338" alt="image" src="https://github.com/user-attachments/assets/508daac4-4af6-49a1-a07a-5707166dc82b" />


