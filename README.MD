Simulacion de carrera de caballos creada en el lenguaje java, representada por una matriz de nxm
y de x cantidad de caballos 

variables de entrada:
c=cantidad de caballos
m=largo del hipodromo(se recomienda un valor entero entre 40 a 70 para una correcta visualizacion)

el programa consiste en poner los caballos en el punto de partida y que estos avancen en turnos una cantidad randomicas de posiciones hacia adelante, el o los primeros en pasar la meta son los ganadores

ejemplo 
meta 45
☻=Caballo  0=pocicion vacia  1=Meta 

1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  

Corriendo... 

☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  

Corriendo... 

0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 

Corriendo... 

0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  

Corriendo... 

0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 1 0 0 0 0  

 primer caballo en llegar a la meta 4
 
resultado final  

0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 ☻ 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ☻ 0 0 0 1 0 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 ☻ 0 0 0  
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 ☻ 0 0 0

Para la ejecución del algoritmo se deben seguir los siguientes pasos:

- Primero abrir la terminal de Linux

- Luego se debe clonar el repositorio remoto en el repositorio local utilizando el siguiente comando:
 
          git clone https://github.com/likanmaster/caballos.git

- Para poder clonar el repositorio luego de ejecutar el comando anterior, se solicitara el nombre de usuario y contraseña que deben ser ingresados por la persona que esta ejecutando el algoritmo
 
- El siguiente paso es acceder a la carpeta del repositorio local que se creo inicialmente, para esto es necesario cambiarse de directorio con el comando cd, como el siguiente ejemplo, en caso de que la carpeta se llame n_reinas se de usar el comando de la siguiente forma:
 
           cd n_reinas/src/caballos

- Luego primero se debe compilar el programa con la siguiente instrucción

                javac Caballos.java
               
- Una vez compilado el programa se debe ejecutar ingresando los parametros de entrada cantidad de caballos y lago del hipodromo como por ejemplo:

                java Main 4 50

Con la realización de todos los pasos mencionados anteriormente es posbible ejecutar el programa.
