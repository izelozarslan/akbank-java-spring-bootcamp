# Homework

## Country API
This project implements a simple RESTful API for managing countries. It provides endpoints for adding, retrieving, and updating country information.

### Entity
The following entity is defined:

* Country: represents a country with id, name, and president fields.
  
### API Endpoints
  The following API endpoints are available:

1. Add Country
   Adds a new country to the system.

* URL: /countries

* HTTP Method: POST

2. Get All Countries
   Retrieves all countries in the system.

* URL: /countries

* HTTP Method: GET

3. Get Country by Id

Retrieves a country with the specified id.

* URL: /countries/{id}

* HTTP Method: GET

4. Update Country President
   
Updates the president of the country with the specified id.

* URL: /countries/{id}

* HTTP Method: PUT


## Implementation Details
This project uses the MapStruct library for mapping between DTOs and entities. 
The data is not stored in a database, but rather in memory. Therefore, the data is lost when the application is stopped.