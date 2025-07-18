# Conversor de Monedas 💱

Aplicación en Java que permite convertir montos entre diferentes monedas, utilizando tasas de cambio en tiempo real obtenidas desde una API externa.

## 🚀 Características

- Conversión de monedas actualizada automáticamente.
- Lectura amigable de resultados.
- Validación de entrada del usuario.
- Uso de GSON para parseo de JSON.

## 🛠️ Tecnologías

- Java 21+
- IntelliJ IDEA
- GSON (para manejar JSON)
- API externa de tipo de cambio [ExchangeRate-API](https://www.exchangerate-api.com/)


## ⚙️ Cómo ejecutar

1. Clona este repositorio:

```bash
git clone https://github.com/Eduar-bc/Conversor-monedas
```

2. Abre el proyecto en IntelliJ o tu editor preferido.

3. Asegúrate de tener GSON agregado al classpath (puedes usar Maven o añadir el `.jar` manualmente).

4. Ejecuta la clase `Principal.java`.

## 🧪 Ejemplo de uso

1. <img width="354" height="265" alt="image" src="https://github.com/user-attachments/assets/802fbaa3-f4bb-45ba-93c8-7cbfe3e45282" />
2. <img width="581" height="180" alt="image" src="https://github.com/user-attachments/assets/b04fc427-9ee5-43a6-81fb-96246c0c09f4" />

## 📦 Dependencias

Si usas Maven, en tu `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
```
