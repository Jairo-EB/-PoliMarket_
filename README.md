# 🛒 PoliMarket - Sistema de Simulación Empresarial en Java

Este proyecto es una simulación empresarial por consola para la empresa ficticia **PoliMarket**, desarrollada completamente en **Java** con una estructura modular basada en paquetes. No utiliza bases de datos ni herramientas externas como Postman. Todo está diseñado para ejecutarse desde consola, utilizando lógica simulada en memoria.

---

## 📁 Estructura de Carpetas

```
polimarket/
├── autenticacion_autorizacion/
│   └── Autenticacion.java
├── bodega/
│   └── DisponibilidadInventario.java
├── entregas/
│   └── Entrega.java
├── main/
│   ├── PoliMarketApp.java       # Aplicación principal
│   ├── Cliente1.java            # Cliente que consulta inventario y proveedor
│   └── Cliente2.java            # Cliente que autentica vendedor y registra venta
├── proveedores/
│   └── DisponibilidadProveedor.java
├── recursos_humanos/
│   └── Vendedor.java
├── ventas/
    ├── Cliente.java
    ├── Producto.java
    └── Venta.java
```

---

## ⚙️ Tecnología utilizada

- Lenguaje: **Java SE 8+**
- IDE sugerido: NetBeans o IntelliJ (opcional)
- No requiere base de datos ni frameworks externos

---

## 🚀 Archivos principales

### `PoliMarketApp.java`
Simula un flujo completo de negocio:
- Autenticación del vendedor
- Validación de autorización
- Registro de venta
- Verificación de stock
- Consulta a proveedor
- Generación de entrega

### `Cliente1.java`
- Consulta disponibilidad de un producto en bodega
- Consulta proveedor sugerido para dicho producto

### `Cliente2.java`
- Autentica un vendedor por nombre
- Si está autorizado, permite registrar una venta simulada

---

## ✅ Cómo compilar y ejecutar (desde consola CMD o PowerShell)

### 1. Compilar todo:
```bash
javac ventas\*.java
javac bodega\*.java
javac proveedores\*.java
javac entregas\*.java
javac recursos_humanos\*.java
javac autenticacion_autorizacion\*.java
javac main\PoliMarketApp.java
```

### 2. Ejecutar aplicación principal:
```bash
java main.PoliMarketApp
```

### 3. Ejecutar clientes individualmente:
```bash
javac main\Cliente1.java
java main.Cliente1

javac main\Cliente2.java
java main.Cliente2
```

---

## 🧪 Simulación de datos en memoria
No se usan archivos de texto ni bases de datos reales. Los datos están simulados dentro de los servicios mediante arrays en memoria.

Por ejemplo, `DisponibilidadInventario.java` contiene:
```java
String[][] productos = {
    {"P001", "Café", "10.0", "20"},
    {"P002", "Azúcar", "8.0", "0"},
    {"P003", "Leche", "12.0", "15"}
};
```



---

## 📝 Notas para el profesor
- Toda la lógica está simulada por consola
- No requiere instalar ninguna dependencia externa
- Puede usarse desde IDE o consola con `javac` y `java`
- Cliente1 y Cliente2 funcionan como "usuarios externos" del sistema
- El sistema PoliMarketApp muestra el flujo completo automáticamente

---



