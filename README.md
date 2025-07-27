# 🏪 PoliMarket – Sistema Modular en Java

Este proyecto implementa un sistema empresarial modular para **PoliMarket**, una empresa con múltiples áreas de negocio. Está desarrollado completamente en **Java**, organizado en componentes funcionales separados, y probado desde **consola** mediante tres clientes.

---

## 📋 Descripción del Proyecto

PoliMarket cuenta con diferentes áreas de negocio que operan con sus propios sistemas de información:

- 🧾 Recursos Humanos
- 🛒 Ventas
- 🏬 Bodega
- 📦 Proveedores
- 🚚 Entregas

Los módulos se comunican simuladamente a través de clases organizadas por componentes. El sistema permite desde la autenticación de vendedores hasta la gestión de productos, ventas, entregas y abastecimiento.


---

## ⚙️ Tecnologías utilizadas

- Java SE 8+
- Visual Studio Code o NetBeans
- Línea de comandos (terminal)

--- 

✅ Funcionalidades implementadas
Se implementaron más de 10 funcionalidades, cumpliendo y superando los requisitos mínimos de la actividad:

Componente	Funcionalidades
recursos_humanos	AutenticarVendedor, AutenticarUsuario
autenticacion_autorizacion	Usuario, Rol, Privilegio
ventas	crearVenta, ventaFinal, cotizacion, cliente, producto, crearTarea, disponibilidad
bodega	generarEntrada, generarInventario, disponibilidad, hacerCompra, consultaExistencia
proveedor	producto, disponibilidad, empresa
entrega	producto, cliente, entrega, registrar, consultarVentas

👥 Clientes del sistema
1. ClienteConsola.java
Autenticación del vendedor

Creación de venta

Consulta de disponibilidad

2. ClienteAlterno.java
Registro de entrega

Consulta de ventas por cliente

3. ClienteSistema.java
Ejecución de todo el ciclo de negocio completo

Integración de ventas, entregas, compras y proveedores

📚 Estructura académica cumplida
✔ Sistema construido en Java
✔ Organización por componentes funcionales
✔ Más de 5 funcionalidades implementadas
✔ 2 clientes en consola que usan al menos 2 funcionalidades
✔ Diagrama de clases y tabla de funcionalidades respetados
✔ Probado completamente por consola (sin GUI)


📌 Autor
Nombre: [Jairo Espejo Bohorquez]


## 🚀 Cómo ejecutar

### Requisitos

- Tener instalado Java (JDK 8+)
- Un IDE como VS Code o NetBeans

### Instrucciones

```bash

▶ Cliente 1: Simulación Completa del Sistema

javac main/ClienteSistema.java
java main.ClienteSistema

▶ Cliente 2: Consola Simple – Venta

javac main/ClienteConsola.java
java main.ClienteConsola

▶ Cliente 3: Consola Alterna – Entregas

javac main/ClienteAlterno.java
java main.ClienteAlterno


🧱 Estructura del Proyecto

PoliMarket/
├── recursos_humanos/
├── autenticacion_autorizacion/
├── ventas/
├── bodega/
├── proveedor/
├── entrega/
└── main/

Cada carpeta representa un componente independiente, con clases funcionales implementadas según el diagrama de clases de la actividad académica.


