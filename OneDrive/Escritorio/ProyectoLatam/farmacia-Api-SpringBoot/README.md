# Farmacia Application

Una aplicación web desarrollada con Spring Boot para la gestión de medicamentos en una farmacia.

## Descripción

Esta es una aplicación backend construida con Spring Boot que proporciona funcionalidades para la gestión de medicamentos. La aplicación incluye controladores REST, servicios de negocio, manejo de excepciones y pruebas unitarias.

## Tecnologías

- **Java**: Lenguaje de programación principal
- **Spring Boot**: Framework web y de inyección de dependencias
- **Maven**: Gestor de dependencias y construcción del proyecto
- **JUnit**: Framework de pruebas unitarias

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/com/katerin/farmacia/
│   │   ├── FarmaciaApplication.java          # Clase principal de la aplicación
│   │   ├── ServletInitializer.java           # Inicializador de Servlet
│   │   ├── application/
│   │   │   └── service/
│   │   │       ├── MedicationService.java    # Interfaz del servicio
│   │   │       └── MedicationServiceImpl.java # Implementación del servicio
│   │   ├── domain/
│   │   │   └── model/
│   │   │       └── Medication.java           # Entidad de medicamento
│   │   └── infrastructure/
│   │       └── web/
│   │           ├── controller/
│   │           │   └── HomeController.java   # Controlador principal
│   │           ├── dto/
│   │           │   └── ApiResponse.java      # DTO de respuesta
│   │           └── exception/
│   │               └── GlobalExceptionHandler.java # Manejador de excepciones
│   └── resources/
│       ├── application.yaml                  # Configuración de la aplicación
│       └── static/
│           └── index.html                    # Página inicial
└── test/
    └── java/com/katerin/farmacia/            # Pruebas unitarias
```

## Requisitos Previos

- JDK 8 o superior
- Maven 3.6 o superior

## Instalación y Ejecución

### 1. Clonar o descargar el proyecto

```bash
cd demo
```

### 2. Compilar el proyecto

En Windows, usando el script incluido:
```bash
mvnw.cmd clean install
```

O en línea de comandos:
```bash
mvn clean install
```

### 3. Ejecutar la aplicación

```bash
mvnw.cmd spring-boot:run
```

O:
```bash
mvn spring-boot:run
```

La aplicación se iniciará en `http://localhost:8080`

## Ejecución de Pruebas

Para ejecutar todas las pruebas unitarias:

```bash
mvnw.cmd test
```

O:
```bash
mvn test
```

### Pruebas disponibles

- `FarmaciaApplicationTests` - Pruebas de contexto de la aplicación
- `HomeControllerTest` - Pruebas del controlador principal
- `MedicationServiceImplTest` - Pruebas del servicio de medicamentos
- `DomainModelTest` - Pruebas del modelo de dominio
- `ApiResponseTest` - Pruebas del DTO
- `GlobalExceptionHandlerTest` - Pruebas del manejador de excepciones

## Componentes Principales

### Controladores
- **HomeController**: Controlador principal que maneja las solicitudes del sistema

### Servicios
- **MedicationService**: Interfaz para operaciones de medicamentos
- **MedicationServiceImpl**: Implementación del servicio de medicamentos

### Modelos
- **Medication**: Entidad que representa un medicamento

### DTOs
- **ApiResponse**: Objeto para estandarizar las respuestas de API

### Excepciones
- **GlobalExceptionHandler**: Maneja excepciones globales de la aplicación

## Configuración

La configuración de la aplicación se encuentra en `src/main/resources/application.yaml`

## Dependencias Principales

Las dependencias del proyecto se definen en `pom.xml` e incluyen:
- Spring Boot Starter Web
- Spring Boot Starter Test

## Contribuciones

Para contribuir al proyecto, por favor:
1. Crea una rama para tu característica
2. Realiza tus cambios
3. Asegúrate de que todas las pruebas pasen
4. Envía un pull request

## Autor

Katerin

## Licencia

Este proyecto está bajo licencia [Especificar licencia]

## Soporte

Para reportar problemas o sugerencias, por favor abre un issue en el repositorio.
