# 📌 PoliMarket v2 — Sistema de Ventas con Patrones de Diseño

---

## 📖 Descripción General

**PoliMarket** es un sistema de ventas desarrollado en **Java** que simula el flujo completo de una tienda:  
gestiona **clientes**, **productos**, **inventario**, **ventas** y **entregas**.  

El proyecto implementa **5 patrones de diseño** solicitados en clase:

- **Singleton**
- **Iterator**
- **Abstract Factory**
- **Prototype**
- **Decorator**

Además, se basa en el **diagrama de clases proporcionado** para mantener la estructura original y cumplir los requisitos.

---

## 🧩 Objetivos del Proyecto

✅ Aplicar **patrones de diseño** en un escenario real.  
✅ Desarrollar un sistema **modular, extensible y mantenible**.  
✅ Integrar lógica de **ventas**, **inventario** y **autenticación**.  
✅ Practicar buenas **prácticas de desarrollo** y **organización de código**.  

---

🏛️ Patrones de Diseño Implementados
🔹 Singleton
Ubicación: autenticacion_autorizacion/Autenticacion.java

Rol: Garantiza que solo exista una instancia de autenticación.

Uso:

java
Copiar
Editar
Autenticacion auth = Autenticacion.getInstancia();
if(auth.autenticar("vendedor","1234")) { ... }
🔹 Iterator
Ubicación: ventas/Venta.java

Rol: Permite recorrer productos de una venta sin exponer la lista interna.

Uso:

java
Copiar
Editar
for(Producto p : venta) {
    System.out.println(p.getNombre());
}
🔹 Abstract Factory
Ubicación: fabricas/

Rol: Crea productos desde diferentes orígenes (Bodega o Proveedor).

Uso:

java
Copiar
Editar
ProductoFactoryClient factory = new ProductoFactoryClient(new BodegaFactory());
Producto camiseta = factory.construirProducto("B01", "Camiseta", new BigDecimal("30000"));
🔹 Prototype
Ubicación: ventas/Producto.java

Rol: Permite clonar un producto existente.

Uso:

java
Copiar
Editar
Producto copia = original.clone();
🔹 Decorator
Ubicación: ventas/ProductoDecorador.java

Rol: Añade funcionalidades extra a un producto sin modificar su clase.

Uso:

java
Copiar
Editar
Producto regalo = new EmbalajeRegalo(new GarantiaExtendida(camiseta));
🧠 Diagrama de Clases
Basado en el diagrama original proporcionado por el profesor,
adaptado para incluir patrones de diseño y relaciones.

## 📂 Estructura del Proyecto

```bash
PoliMarket_v2/
└─ src/
   ├─ acceso/                     # Fachada de autenticación
   ├─ autenticacion_autorizacion/ # Singleton: control de acceso global
   ├─ bodega/                     # Inventario y Kardex
   ├─ empresa/                    # Información de la empresa
   ├─ entregas/                   # Control de entregas
   ├─ fabricas/                   # Abstract Factory para productos
   ├─ proveedores/                # Datos de proveedores externos
   ├─ recursos_humanos/           # Vendedores de la empresa
   ├─ ventas/                     # Productos, clientes, ventas y decoradores
   └─ main/                       # Punto de entrada: apps y casos de prueba


🚀 Ejecución del Proyecto
1. Requisitos
Java JDK 17+

Visual Studio Code con Extension Pack for Java

2. Compilar
Desde la carpeta src:

javac -encoding UTF-8 -d ../bin autenticacion_autorizacion/*.java ventas/*.java fabricas/*.java main/*.java bodega/*.java empresa/*.java entregas/*.java proveedores/*.java recursos_humanos/*.java acceso/*.java

4. Ejecutar
Desde la carpeta bin:

cd ../bin

java main.PoliMarketApp   # Ejecuta el sistema completo

Ejecutar clientes individuales:

java main.Cliente1
java main.Cliente2


🧪 Casos de Prueba Incluidos
Caso	Archivo	Descripción
Cliente1	main/Cliente1.java	Prueba creación desde Bodega con Decorator + Prototype
Cliente2	main/Cliente2.java	Prueba creación desde Proveedor con Iterator manual
PoliMarketApp	main/PoliMarketApp.java	Ejecuta TODO el sistema con inventario, ventas y entregas

🧾 Ejemplo de Salida
bash
Copiar
Editar
=== INICIO POLIMARKET ===
Acceso OK

[Factory] Producto creado desde Bodega
[Factory] Producto creado desde Proveedor
Venta registrada para: Ana García (ID: C-100)
 - Camiseta + Embalaje + Garantía  $37000
 - Camiseta (B01-COPIA)           $30000
TOTAL: $67000

Detalle Venta 2 (iteración manual):
 * Pantalón (P99) - $60000
 * Pantalón + Embalaje (P99) - $62000
TOTAL: $122000
=== FIN ===

