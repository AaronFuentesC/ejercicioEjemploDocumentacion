# SECURITY.md

## 1. Protección de datos sensibles

El objetivo de este documento es establecer las medidas de seguridad necesarias para proteger el código fuente, la documentación y los datos del proyecto, evitando la exposición de información sensible y facilitando la colaboración entre los miembros del equipo.

Para ello, se utiliza un archivo `.gitignore` que impide que determinados archivos y directorios se añadan accidentalmente al control de versiones de Git.

### 1.1. Archivos excluidos del repositorio

Las reglas del archivo `.gitignore` se organizan en las siguientes categorías:

- **Archivos sensibles y variables de entorno:** se excluyen `.env`, `.env.*`, `application-local.properties`, los archivos YAML de configuración local y los archivos de claves o certificados (`*.key`, `*.pem`, `*.jks`, etc.). Estos archivos pueden contener contraseñas, tokens, credenciales de bases de datos o información privada que no debe compartirse públicamente.

- **Configuraciones locales:** se excluyen archivos como `*.local`, `config.local.*` y las configuraciones específicas de desarrollo, como `application-dev.properties` y sus variantes YAML. De esta forma, se evita compartir configuraciones propias de cada ordenador o entorno de trabajo.

- **Archivos temporales:** se ignoran extensiones como `*.tmp`, `*.temp`, `*.bak`, `*.swp` y `*.swo`, además de archivos auxiliares del sistema operativo como `.DS_Store` y `Thumbs.db`. Estos archivos no suelen ser necesarios para ejecutar la aplicación.

- **Registros de ejecución:** se excluyen los archivos `*.log` y el directorio `logs/`, ya que pueden contener información interna, errores, rutas locales o datos que no deben divulgarse.

- **Binarios y archivos generados:** se excluyen archivos compilados (`*.class`) y paquetes generados (`*.jar`, `*.war` y `*.ear`), así como los directorios de compilación, como `target/` y `build/`. Esto evita almacenar archivos que pueden generarse nuevamente a partir del código fuente.

- **Copias de seguridad:** se excluyen archivos con extensiones como `*.backup` y `*.old`, para evitar subir versiones antiguas o copias que puedan contener información obsoleta o sensible.

- **Archivos de los entornos de desarrollo:** se ignoran configuraciones y archivos generados por STS, IntelliJ IDEA, NetBeans y Visual Studio Code, ya que normalmente son específicos del entorno de trabajo de cada desarrollador.

### 1.2. Buenas prácticas para proteger la información

Además del uso de `.gitignore`, se seguirán estas medidas:

- No almacenar contraseñas, tokens ni claves privadas directamente en el código fuente.
- Utilizar variables de entorno para gestionar credenciales y otros datos confidenciales.
- Mantener una plantilla de configuración, como `.env.example`, sin contraseñas reales, para facilitar la instalación del proyecto.
- Revisar los archivos modificados antes de realizar un `git commit` o un `git push`.
- No compartir credenciales mediante el repositorio ni a través de documentos públicos.
- Si se expone una credencial accidentalmente, revocarla o cambiarla inmediatamente.

**Importante:** `.gitignore` evita que Git incorpore archivos nuevos que coincidan con sus reglas, pero no elimina los archivos que ya están versionados ni los borra del historial del repositorio. Por ello, es necesario comprobar periódicamente el estado del repositorio.

---

## 2. Control de acceso al repositorio

El acceso al repositorio de GitHub se gestionará mediante permisos, concediendo a cada colaborador únicamente las capacidades que necesita para realizar su trabajo.

### 2.1. Niveles de permiso

Se distinguen los siguientes niveles de acceso:

- **Lectura (Read):** permite consultar y descargar el código y la documentación. Es adecuado para profesores, revisores o personas que necesiten examinar el proyecto sin modificarlo.

- **Escritura (Write):** permite colaborar en el desarrollo, subir cambios y trabajar con ramas y *pull requests*. Es el nivel recomendado para los desarrolladores del equipo.

- **Administración (Admin):** permite gestionar el repositorio, los colaboradores, los permisos y determinadas opciones de configuración. Debe reservarse para el responsable del proyecto o para las personas que necesiten realizar estas tareas.

### 2.2. Prueba de permisos

Para comprobar el funcionamiento de los permisos, se realizarán las siguientes pruebas con una cuenta colaboradora autorizada:

1. **Permiso de lectura:** comprobar que el colaborador puede acceder al repositorio y consultar su contenido, pero no puede subir cambios directamente.
2. **Permiso de escritura:** comprobar que puede contribuir al proyecto, por ejemplo, subiendo cambios a una rama permitida.
3. **Permiso de administración:** comprobar que puede acceder a las opciones de configuración y gestión del repositorio.

Los resultados de las pruebas se registrarán indicando el permiso asignado, las acciones intentadas y si GitHub permite o rechaza cada operación.

### 2.3. Permisos recomendados

Se aplicará el principio de mínimo privilegio: cada usuario tendrá únicamente los permisos necesarios para desempeñar su función.

En un equipo de desarrollo, los programadores tendrán permisos de escritura, las personas que únicamente revisen el proyecto tendrán permisos de lectura y la administración quedará restringida al responsable del repositorio.

---

## 3. Protección del código y de la documentación

Para mantener la integridad del proyecto y evitar cambios no autorizados o errores que puedan afectar a su funcionamiento, se aplicarán las siguientes medidas.

### 3.1. Uso de ramas protegidas

Se recomienda proteger la rama principal (`main` o `master`) para impedir modificaciones directas no controladas.

Cuando sea posible, se configurará GitHub para exigir que los cambios se incorporen mediante *pull requests* y, cuando corresponda, que sean revisados antes de fusionarse con la rama principal.

Los desarrolladores trabajarán en ramas independientes para implementar nuevas funcionalidades, corregir errores o actualizar la documentación.

### 3.2. Revisión de pull requests

Antes de integrar cambios en la rama principal, se revisarán los *pull requests* para comprobar que:

- Los cambios son coherentes con los requisitos del proyecto.
- No se han añadido contraseñas, tokens ni otros datos sensibles.
- La documentación se mantiene actualizada.
- El código no introduce errores evidentes.
- Las pruebas necesarias se han ejecutado correctamente.

Esta revisión ayuda a detectar errores y reduce el riesgo de incorporar cambios inseguros.

### 3.3. Protección de la documentación

La documentación del proyecto también debe mantenerse bajo control de versiones y revisarse antes de publicar cambios.

Se evitará incluir credenciales, datos personales innecesarios, información interna confidencial o detalles que puedan comprometer la seguridad de la aplicación.

Los documentos importantes, como el archivo `SECURITY.md`, deberán actualizarse cuando cambien las medidas de seguridad, los permisos o los procedimientos de recuperación.

### 3.4. Actualizaciones y mantenimiento

Se revisarán periódicamente las dependencias del proyecto y las configuraciones de seguridad. También se corregirán las vulnerabilidades detectadas y se eliminarán los accesos de colaboradores que ya no necesiten participar en el desarrollo.

---

## 4. Copias de seguridad y recuperación del repositorio

Las copias de seguridad permiten recuperar el código y la documentación en caso de pérdida de datos, eliminación accidental de archivos o errores graves durante el desarrollo.

### 4.1. Medidas preventivas

Para reducir el riesgo de pérdida de información, se seguirán estas medidas:

- Mantener el código fuente y la documentación versionados en Git.
- Realizar copias de seguridad periódicas del repositorio en una ubicación independiente.
- Comprobar que las copias se pueden restaurar correctamente.
- Evitar que las copias de seguridad contengan contraseñas o credenciales sin protección.
- Conservar una copia de los elementos necesarios para reconstruir el proyecto, como el código fuente, los archivos de configuración de Maven y la documentación.

GitHub facilita la recuperación de versiones anteriores del código, pero no debe considerarse la única medida de protección frente a cualquier pérdida de datos.

### 4.2. Procedimiento de recuperación

En caso de error o pérdida de información, se seguirá este procedimiento:

1. Identificar el problema y determinar qué archivos, ramas o commits se han visto afectados.
2. Comprobar el historial de Git para localizar una versión anterior que funcione correctamente.
3. Recuperar los archivos o revertir los cambios mediante las herramientas de Git, evitando sobrescribir modificaciones válidas.
4. Si el repositorio se ha perdido o está gravemente dañado, restaurarlo desde una copia de seguridad independiente.
5. Comprobar que el código fuente, la documentación y los archivos de configuración necesarios están disponibles.
6. Ejecutar las pruebas correspondientes para verificar que el proyecto vuelve a funcionar correctamente.

Por ejemplo, Git permite consultar el historial con `git log` y revisar los cambios de un commit anterior. Para deshacer los efectos de un commit ya compartido, se puede utilizar `git revert`, que genera un nuevo commit con los cambios inversos.

### 4.3. Verificación de las copias de seguridad

Las copias de seguridad deberán comprobarse periódicamente mediante una restauración de prueba. Así se verifica que los archivos se pueden recuperar y que la copia no está dañada.

También se recomienda mantener las copias separadas del repositorio original para que un error, una eliminación accidental o un problema de acceso no afecte simultáneamente a ambas ubicaciones.

---

## 5. Conclusión

La seguridad del repositorio se basa en combinar la exclusión de archivos sensibles mediante `.gitignore`, la asignación adecuada de permisos, la revisión de cambios y la realización de copias de seguridad.

Estas medidas ayudan a proteger la confidencialidad de la información, mantener la integridad del código y la documentación, facilitar la colaboración entre desarrolladores y recuperar el proyecto ante posibles errores o pérdidas de datos.
