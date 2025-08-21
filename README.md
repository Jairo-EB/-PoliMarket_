# 🛍️ PoliMarket v2 — Sistema de Ventas con Patrones de Diseño

> **Lenguaje:** Java 17+  
> **IDE recomendado:** Visual Studio Code

---

## 📖 Descripción General

**PoliMarket v2** es un sistema de ventas desarrollado en **Java** que simula el flujo completo de una tienda, permitiendo gestionar:

- **Clientes**
- **Productos**
- **Ventas**
- **Inventario / Kardex**
- **Entregas**
- **Autenticación de usuarios**

Este proyecto implementa **cinco patrones de diseño solicitados**:

- **Singleton** → Autenticación global de vendedores.
- **Iterator** → Recorrido seguro de productos en una venta.
- **Abstract Factory** → Creación flexible de productos desde Bodega o Proveedor.
- **Prototype** → Clonación de productos existentes.
- **Decorator** → Adición de funcionalidades dinámicas a productos (garantía, embalaje).

Además, la arquitectura respeta el **diagrama de clases** y cumple con los principios de **modularidad, mantenibilidad y extensibilidad**.

---

## 🧩 Objetivos del Proyecto

🎯 **Académicos**
- Aplicar los patrones de diseño estudiados en clase.
- Entender su **implementación práctica** y sus ventajas.

🎯 **Técnicos**
- Crear un sistema **organizado en capas y paquetes**.
- Separar responsabilidades para facilitar mantenimiento.
- Mejorar la **calidad del código** con buenas prácticas.

🎯 **Funcionales**
- Simular la **gestión completa de ventas** en una tienda.
- Administrar **productos, inventario y entregas**.
- Garantizar la **seguridad de acceso** al sistema.

---

## 🗂️ Estructura del Proyecto

```
PoliMarket_v2/
└─ src/
   ├─ acceso/                     # Fachada para autenticación
   ├─ autenticacion_autorizacion/ # Singleton: control de acceso global
   ├─ bodega/                     # Inventario y Kardex de productos
   ├─ empresa/                    # Información general de la empresa
   ├─ entregas/                   # Control de entregas de ventas
   ├─ fabricas/                   # Abstract Factory para creación de productos
   ├─ proveedores/                # Datos de proveedores externos
   ├─ recursos_humanos/           # Información de vendedores
   ├─ ventas/                     # Productos, clientes, ventas y decoradores
   └─ main/                       # Puntos de entrada: apps y casos de prueba




🏛️ Patrones de Diseño Implementados
1. Singleton 🟢

Archivo: autenticacion_autorizacion/Autenticacion.java

Propósito: Garantizar que exista una sola instancia del sistema de autenticación.

Uso:

Autenticacion auth = Autenticacion.getInstancia();
if(auth.autenticar("vendedor", "1234")) {
    System.out.println("Acceso autorizado");
}

2. Iterator 🔄

Archivo: ventas/Venta.java

Propósito: Permite recorrer los productos de una venta sin exponer la lista interna.

Uso:

for(Producto p : venta) {
    System.out.println(p.getNombre());
}

3. Abstract Factory 🏭

Archivos:
fabricas/ProductoAbstractFactory.java
fabricas/BodegaFactory.java
fabricas/ProveedorFactory.java
fabricas/ProductoFactoryClient.java

Propósito: Permite crear productos desde diferentes orígenes (Bodega o Proveedor) sin modificar el cliente.

Uso:

ProductoFactoryClient factory = new ProductoFactoryClient(new BodegaFactory());
Producto camiseta = factory.construirProducto("B01", "Camiseta", new BigDecimal("30000"));

4. Prototype 🧬

Archivo: ventas/Producto.java

Propósito: Clonar productos existentes para reutilizarlos sin reconfigurarlos.

Uso:

Producto copia = original.clone();
copia.setCodigo("B01-COPIA");

5. Decorator 🎁

Archivos:
ventas/ProductoDecorador.java
ventas/EmbalajeRegalo.java
ventas/GarantiaExtendida.java

Propósito: Añade funcionalidades dinámicas a los productos sin modificar su clase base.

Uso:

Producto regalo = new EmbalajeRegalo(new GarantiaExtendida(camiseta));

🧠 Relación con el Diagrama de Clases

El proyecto sigue la estructura base del diagrama proporcionado, pero extiende sus funcionalidades con patrones:

Acceso → Autenticación: ahora con Singleton.

Producto → Bodega/Proveedor: gestionados por Abstract Factory.

Venta → Iterador: para recorrer productos de forma segura.

Producto → Decorator: agrega responsabilidades sin heredar.

Clonado: productos se duplican con Prototype.

🚀 Instalación y Ejecución
1. Requisitos Previos

Java JDK 17 o superior

Visual Studio Code + extensión Extension Pack for Java

2. Compilar el Proyecto

Desde la carpeta src:

javac -encoding UTF-8 -d ../bin autenticacion_autorizacion/*.java ventas/*.java fabricas/*.java main/*.java bodega/*.java empresa/*.java entregas/*.java proveedores/*.java recursos_humanos/*.java acceso/*.java

3. Ejecutar la App Principal

Desde la carpeta bin:

cd ../bin
java main.PoliMarketApp

4. Ejecutar Casos de Prueba
java main.Cliente1   # Caso 1: Bodega + Decorator + Prototype
java main.Cliente2   # Caso 2: Proveedor + Iterator manual

🧪 Casos de Uso Cubiertos

Caso	Archivo	Descripción

Cliente1	main/Cliente1.java	Creación desde Bodega, prueba de Prototype y Decorator
Cliente2	main/Cliente2.java	Creación desde Proveedor, recorrido con Iterator manual
PoliMarketApp	main/PoliMarketApp.java	Ejecuta TODO el sistema: ventas, inventario, entregas y patrones

🧾 Ejemplo de Salida
=== INICIO POLIMARKET ===
Acceso OK

[Factory] Producto creado desde Bodega
[Factory] Producto creado desde Proveedor

Venta registrada para: Ana García (ID: C-100)
 - Camiseta + Embalaje + Garantía  $37,000
 - Camiseta (B01-COPIA)           $30,000
TOTAL: $67,000

Detalle Venta 2 (iteración manual):
 * Pantalón (P99) - $60,000
 * Pantalón + Embalaje (P99) - $62,000
TOTAL: $122,000

=== FIN ===


👥 Autores
Nombre	Rol
Jairo Espejo	Desarrollador principal


