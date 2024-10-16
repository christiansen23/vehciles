# 📦 Sistema de Gestión de Almacén

Este proyecto es una aplicación de gestión de inventario diseñada para optimizar y simplificar la administración de productos, referencias y proveedores en un entorno de almacén. La aplicación permite dos tipos de usuarios, **Responsable de Almacén** y **Vendedor**, cada uno con permisos y funcionalidades específicas.

## 🎯 Funcionalidades del Proyecto

### Autenticación de Usuarios
La aplicación implementa un sistema de autenticación que permite la entrada de dos tipos de usuarios:

- **Responsable de Almacén**: Tiene permisos completos para gestionar el inventario.
- **Vendedor**: Tiene acceso limitado para consultar información y exportar datos.

### Áreas de Gestión

Una vez autenticado, el usuario puede acceder a tres áreas clave en la gestión del almacén:

1. **Familia**: Clasificación de productos en familias para una organización eficiente.
2. **Referencia**: Gestión de referencias de productos con detalles específicos.
3. **Proveedor**: Información detallada de los proveedores de productos.

### Permisos por Rol

#### Responsable de Almacén
El **Responsable de Almacén** tiene acceso completo a las funcionalidades de la aplicación, incluyendo:
   - **Insertar, Modificar y Eliminar** datos en las áreas de **Familia**, **Referencia** y **Proveedor**.
   - **Importar y Exportar** listas de proveedores para facilitar la gestión y actualización de contactos externos.

#### Vendedor
El **Vendedor** cuenta con permisos de consulta, con las siguientes capacidades:
   - **Consultar y Exportar** información en **Familia**, **Referencia** y **Proveedor**, permitiéndole acceder a los datos necesarios para sus actividades comerciales.

## 📄 Documentación del Proyecto

Para una descripción más detallada de la aplicación, puedes consultar la **documentación completa del proyecto** en el siguiente enlace:
- [Documentación del Proyecto](https://docs.google.com/document/d/1YukiJOzGCIqqz4o5zcuRU96kcPuTIf0jgoTAO9MPp8U/edit?usp=drive_link)

## 🗃️ Script de Base de Datos

El **script SQL** necesario para configurar la base de datos de la aplicación está disponible en el enlace a continuación. Este script contiene las instrucciones para crear las tablas y relaciones necesarias para el funcionamiento del sistema:
- [Script de Base de Datos](https://drive.google.com/file/d/1YKvxX9ZvJWCTcFhKjGPs0SRqnpuNiciD/view?usp=drive_link)


## 🚀 Tecnologías Utilizadas

- **Java**: Para la lógica de negocio y el backend de la aplicación.
- **PHP y MySQL**: Para el manejo de datos y la comunicación con la base de datos.
- **HTML y XML**: Para estructuración de datos y algunas configuraciones.
- **Git**: Control de versiones para la gestión y el seguimiento de cambios en el proyecto.

## 💡 Instalación y Configuración

1. Clona este repositorio.
2. Configura la base de datos en MySQL utilizando el archivo SQL proporcionado.
3. Compila y ejecuta el proyecto en tu entorno de desarrollo favorito.
4. Accede con las credenciales de prueba (Responsable de Almacén o Vendedor) para explorar las funcionalidades.
