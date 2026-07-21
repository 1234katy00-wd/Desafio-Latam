Proyecto Farmacia- Dominio principal
Farmacia desarrollado con Java con pruebas unitarias para la lógica de dominio relacionada al proyecto. 
Donde contiene un sistema de validación de medicamentos con receta médica.

Aspectos destacados de la arquitectura:
* Java : Sin Spring, JPA ni anotaciones web.

Pruebas y contrl de calidad 
* JUnit 5
* Mockito

 Estructuta del proyecto
 ProyectoLatam/
├── src/
│   ├── main/java/com/proyecto/domain/
│   │   ├── MedicamentoConReceta.java
│   │   ├── Receta.java
│   │   └── exception/
│   │       └── RecetaInvalidaExcepcion.java
│   └── test/java/com/proyecto/domain/


Ejecutar pruebas:
   mvn test


│       └── MedicamentoConRecetaTest.java
└── README.md

