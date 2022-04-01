# Definicion

Prueba Tecnica 
```
Construya un micro servicio Rest en Java (utilizando el framework que considere), teniendo en cuenta la entidad ALMACEN que contiene un id, nombre, fecha de inauguración y capacidad de clientes, este servicio debe tener dos operaciones, una para crear un nuevo almacén y otra para listar todos los almacenes creados, la persistencia la puede manejar en memoria por medio de una colección de Java, se evaluará orden, código legible, código comentado, estructura del código y buenas prácticas de programación
```


# Entidades
 
## Almacenes
	id
	nombre -> name
	fecha de inauguración -> dateInaguration
	capacidad de clientes -> clientCapacity


# USO
  url `localhost:8080/api/almacenes/`


## agregar almacen (`Post`)
```
{
	"name":"Almacen 1",
	"dateInaguration":"2021-01-01",
	"clientCapacity":2
}
```
respuesta
```
{
    "id": 14,
    "name": "Almacen 1",
    "dateConfig": "2021-01-01",
    "clientCapacity": 2
}
```

## lista de almacenes (`get`)

respuesta
```
[
    {
        "id": 1,
        "name": "Almacen 01",
        "dateConfig": "2021-01-01",
        "clientCapacity": 2
    },
    {
        "id": 2,
        "name": "Almacen 02",
        "dateConfig": "2021-01-01",
        "clientCapacity": 20
    },
    {
        "id": 3,
        "name": "Almacen 05",
        "dateConfig": "2021-01-01",
        "clientCapacity": 200
    }
]
```