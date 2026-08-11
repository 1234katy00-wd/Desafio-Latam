# Farmacia

## Descripción del proyecto

Este proyecto es una aplicación de farmacia que maneja el registro de medicamentos, validaciones de recetas, notificaciones de pago y un repositorio en memoria para persistencia temporal.

La arquitectura está organizada en capas limpias:
- `domain`: reglas de negocio, entidades, excepciones y objetos de valor.
- `application`: casos de uso, servicios y puertos.
- `infrastructure`: implementación concreta de repositorios.

## Glosario de Lenguaje Ubicuo

1. **Medication**
   - Representa un medicamento dentro del negocio.
   - Incluye atributos como id, título, descripción, dosis, laboratorio, presentación, ingrediente activo y precio.
   - Es una entidad cuyo ciclo de vida se identifica por su `id`.

2. **Prescription**
   - Representa la receta médica asociada a un medicamento.
   - Su validación asegura que el medicamento no se registre o procese sin receta válida.
   - Es una regla de negocio que controla el acceso al medicamento recetado.

3. **Email**
   - Objeto de valor inmutable que encapsula un correo electrónico válido.
   - Autovalida formato y normaliza el valor a minúsculas y sin espacios.
   - Protege la consistencia de la información de contacto del cliente.

4. **MedicationRepository**
   - Interfaz de persistencia pura que define la frontera de acceso a medicamentos.
   - Permite desacoplar la lógica de negocio de la implementación de almacenamiento.
   - En este proyecto se implementa con `InMemoryMedicationRepository` en infraestructura.

5. **PaymentService**
   - Servicio de aplicación que procesa pagos y notifica a través de un puerto de mensajería.
   - Define la acción de procesar un pago sin depender de la tecnología de notificación concreta.
   - Mantiene la regla de que un `purchaseId` inválido debe detener el flujo.

## Límites del subdominio principal

### Subdominio principal: Gestión de Medicamentos

El subdominio principal en este proyecto es la gestión de medicamentos y recetas médicas. Incluye:
- Registro de medicamentos (`MedicationUseCase`).
- Validación de existencia y duplicados.
- Validación de receta antes de permitir el uso del medicamento.
- Persistencia a través de la interfaz `MedicationRepository`.

### Contexto dentro del dominio

- **Dentro de `MedicationManagement`** está todo lo relacionado con el ciclo de vida del medicamento, su validación y su registro.
- **Fuera de `MedicationManagement`** quedan los contextos de notificación y pago, que son servicios de aplicación auxiliares y se comunican mediante puertos.

### Ejemplo de límite entre subdominios

- **MedicalRecords / PrescriptionContext**: incluye `Prescription`, `PrescriptionMedications` y la validación de receta.
- **DrugInventory / MedicationManagement**: incluye `Medication`, `MedicationRepository`, `InMemoryMedicationRepository` y `MedicationUseCase`.

El límite formalizado es:
- `Prescription` termina donde termina la validación de reglas de receta médica.
- `MedicationUseCase` comienza donde se registra el medicamento y se verifica la existencia en el repositorio.

Esto permite, en la próxima sesión, codificar patrones tácticos ricos en comportamiento como agregados con invariantes, servicios de dominio y puertos de infraestructura bien definidos.

## Ejecución

Desde la raíz del proyecto:

```bash
mvn test
```
