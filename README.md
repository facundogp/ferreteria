# REDIS

### ¿Qué es Redis?

Redis es un almacén de estructura de datos en memoria de código abierto (licencia BSD), que se utiliza como base de datos, caché y mensaje.

### Beneficios de Redis
-Almacén de datos en memoria
-Estructuras de datos flexibles
-Simplicidad y facilidad de uso
-Replicación y persistencia
-Alto nivel de disponibilidad y escalabilidad
-Extensibilidad

##### Almacén de datos en memoria

Todos los datos de Redis residen en la memoria principal del servidor, a diferencia de bases de datos como PostgreSQL, Cassandra, MongoDB, entre otras, que almacenan la mayor parte de los datos en discos o SSD. Por lo tanto, pueden admitir una orden de magnitud, más operaciones y tiempos de respuesta más rápidos. reducir la latencia de los datos, incrementar la capacidad de procesamiento y aliviar la carga de la aplicación y de la base de datos relacional o NoSQL, capacidad para procesar millones de operaciones por segundo.

##### Replicación y persistencia
Redis utiliza una arquitectura con el servidor principal y réplica y admite la replicación asíncrona en la que los datos se replican en numerosos servidores de réplicas. De este modo, se logra un mejor nivel de rendimiento de lectura (ya que las solicitudes se pueden repartir entre varios servidores) y haya menos tiempo de recuperación cuando el servidor principal sufre un corte.

##### Alto nivel de disponibilidad y escalabilidad

Redis ofrece una arquitectura con servidor principal y réplica en una topología principal con un único nodo. Esto permite crear soluciones con un alto nivel de disponibilidad, lo que ofrece fiabilidad y rendimiento estables. Cuando se necesita ajustar el tamaño de un clúster, se encuentran disponibles diferentes opciones de escalado. Esto permite que el tamaño del clúster se ajuste a sus necesidades.

##### Extensibilidad

Redis es un proyecto de código abierto que cuenta con el apoyo de una comunidad activa. No hay limitaciones de proveedores ni tecnología porque Redis está basado en estándares abiertos.

### ¿como instalar redis?

###### En windows:
paso 1: ir a https://github.com/microsoftarchive/redis/releases y descargar el instalador
paso 2: descomprimir el archivo .zip
paso 3: ejecutar redis server.exe o dentro de la terminal escribir el comando: redis-cli
paso 4: ir a Redis Manager: http://redisdesktop.com/download y descargar el instalador para windows
paso 5: ejecutar redis desktop manager y conectar  la bd con el servidor

###### En ubuntu:
paso 1: entrar en la consola y escribir los siguientes comandos: 
sudo apt update
sudo apt install redis-server
paso 2: configurar para que se inicie el servicio al arrancar el sistema
sudo systemctl enable redis-server
paso 3: ir a Redis Manager: http://redisdesktop.com/download y descargar el instalador para ubuntu

### ¿Qué lenguajes soporta?

Los lenguajes soportados por Redis son los siguientes: Lua, PHP, Ruby, Python, ActionScript, C, C++, C#, Clojure, Common Lisp, Erlang, Go, Haskell, haXe, Io, Java, Node.js, Objective-C, Perl, Pure Data, Scala, Smalltalk y Tcl.
