# Proyecto JPA - Hibernate con Maven

Este proyecto es una base para aplicaciones Java con Hibernate y JPA, utilizando Maven como gestor de dependencias. Sigue el patrón DAO para la organización del código y MySQL como sistema de gestión de base de datos.

## Requisitos

- Java 17 o superior

- Maven 3.x

- Base de datos compatible (por defecto, se usa MySQL, pero si se quiere usar otra, se debe modificar el driver)

## Instalación

Para clonar este repositorio y comenzar a trabajar en él:

```bash
git clone https://github.com/Sebaspallero/JPA-Hibernate-Vivero
cd JPA-Hibernate-Vivero
mvn clean install
```

- En la mayoría de los casos, **no es necesario** ejecutar ```mvn clean install```, a menos que haya problemas con las dependencias o se requiera una compilación limpia. **En caso de querer ejecutarlo**, se debe tener instalado Maven en el sistema para poder usar este comando.

- En **Visual Studio Code**, si tenes instalada la extensión **Maven for Java**, al modificar el ```pom.xml```, es necesario hacer clic en el botón azul en la parte inferior derecha para sincronizar los cambios.

- En **IntelliJ**, hacer click en el botón azul que aparece arriba a la derecha dentro del **pom.xml** para sincronizar los cambios.

- Si se quiere hacer un **fork**, simplemente se hace desde la interfaz de GitHub y luego clonalo desde tu cuenta.

## Configuración de ```persistence.xml```

El archivo ```persistence.xml``` se encuentra en ```src/main/resources/META-INF/```. Debe contener la configuración de la base de datos y el proveedor de persistencia.

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<persistence xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
             http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0" xmlns="http://java.sun.com/xml/ns/persistence">
  <persistence-unit name="ViveroPU" transaction-type="RESOURCE_LOCAL">
    <properties>
        <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/vivero2?serverTimezone=UTC"/> <!-- Cambiar el nombre de la DB si fuese necesario -->
        <property name="jakarta.persistence.jdbc.user" value="root"/>
        <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="jakarta.persistence.jdbc.password" value=""/> <!-- Completar con su contraseña de MySql -->
        <property name="jakarta.persistence.schema-generation.database.action" value="update"/>
    </properties>
  </persistence-unit>
</persistence>
```

## Dependencias Principales

En el ```pom.xml``` ya están incluidas las dependencias necesarias para Hibernate y JPA:

```xml
    <dependencies>
        <!-- JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
        <!-- Hibernate ORM -->
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.4.4.Final</version>
        </dependency>
        <!-- Jakarta Persistence API -->
        <dependency>
            <groupId>jakarta.persistence</groupId>
            <artifactId>jakarta.persistence-api</artifactId>
            <version>3.1.0</version>
        </dependency>
        <!-- EclipseLink -->
        <dependency>
            <groupId>org.eclipse.persistence</groupId>
            <artifactId>eclipselink</artifactId>
            <version>4.0.2</version>
        </dependency>
        <!-- MySQL Connector -->
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>8.0.33</version>
        </dependency>
    </dependencies>
```

## Contribuir 🌟

Si este proyecto te fue útil, considera darle una estrella ⭐ en GitHub. También podes seguirme para estar al tanto de futuras actualizaciones del repositorio y nuevos proyectos.

¡Gracias por tu apoyo! 🚀
