# Módulo Web de Gestión de Empleados  
**Evidencia GA7-220501096-AA2-EV02** – Aplicar estándares de codificación en aplicaciones web con Java

Este proyecto implementa un sistema web básico de gestión de empleados con operaciones CRUD (Crear, Leer, Actualizar, Eliminar) utilizando **Servlets, JSP, HTML y JDBC**, conforme a los lineamientos del componente formativo **“Construcción de aplicaciones con JAVA”**.

## 🔧 Tecnologías utilizadas

- **Lenguaje**: Java 17+
- **Framework web**: Servlets 6.0 + JSP (Jakarta EE 9+)
- **Servidor de aplicaciones**: Apache Tomcat 10.1+
- **Base de datos**: MySQL 8.0+
- **Gestión de dependencias**: Apache Maven
- **Gestión de credenciales**: Librería `java-dotenv` (archivo `.env`)
- **Estructura**: Patrón MVC (Modelo, Vista, Controlador)

## 📦 Funcionalidades

- ✅ Registrar nuevos empleados (método **POST**)
- ✅ Listar empleados registrados (método **GET**)
- ✅ Validación de correo único (restricción en base de datos)
- ✅ Manejo seguro de credenciales con `.env`
- ✅ Interfaz web simple con formularios HTML y tablas dinámicas

## 🛠️ Requisitos

- JDK 17 o superior
- Apache Tomcat 10.1 o superior
- MySQL 8.0+ en ejecución
- Base de datos llamada `empresa`

## 🗃️ Configuración de la base de datos

Ejecuta este script en MySQL:

```sql
CREATE DATABASE IF NOT EXISTS empresa;
USE empresa;

CREATE TABLE empleado (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(80) NOT NULL,
    correo VARCHAR(120) UNIQUE NOT NULL,
    salario DECIMAL(10,2) NOT NULL
);

⚙️ Configuración del entorno
1. Clona este repositorio.
2. Crea un archivo .env en la raíz del proyecto con tus credenciales:

DB_URL=jdbc:mysql://localhost:3306/empresa
DB_USER=root
DB_PASSWORD=tu_contraseña

🔒 El archivo .env está excluido de Git por seguridad (/.gitignore).

▶️ Instrucciones de despliegue
1. Compila el proyecto:

mvn clean package

2. Copia el archivo generado target/demo-web-1.0-SNAPSHOT.war a la carpeta webapps/ de tu instalación de Tomcat.
3. Inicia Tomcat:

# En Windows
bin\startup.bat

# En Linux/Mac
bin/startup.sh

4. Accede a la aplicación en tu navegador:

http://localhost:8080/demo-web-1.0-SNAPSHOT/

📁 Estructura del proyecto

src/
├── main/
│   ├── java/
│   │   └── com.example/
│   │       ├── controlador/    # Servlets
│   │       ├── dao/            # Acceso a datos
│   │       ├── model/          # Entidades
│   │       └── util/           # Utilidades (conexión a DB)
│   └── webapp/                 # Recursos web (HTML, JSP)
├── pom.xml
├── .env                        # (no subido a Git)
└── .gitignore

📝 Notas
Este proyecto cumple con los estándares de codificación:
Nombres en camelCase para variables y métodos.
Nombres en PascalCase para clases.
Paquetes en minúsculas y jerárquicos.
Usa PreparedStatement para prevenir inyección SQL.
Implementa responsabilidad única en cada clase.

🧑‍💻 Autor

Mónica Ismelia Cañas Reyes — SENA 📦 Evidencia GA7-220501096-AA2-EV02  módulos de software codificados y probados