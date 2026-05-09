# Software Engineer API

REST API for managing software engineers, built with Java and Spring Boot.

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Postman

## Getting Started

### Prerequisites
- Docker installed and running
- Java 17
- IntelliJ IDEA

### Running the project

**1. Start the database**
```bash
docker-compose up -d
```

**2. Run the application**

Open the project in IntelliJ and run `Application.java`

**3. API will be available at**
```
http://localhost:8080/api/v1/SoftwareEngineer
```

## Endpoints

| Method   | URL                              | Description           |
|----------|----------------------------------|-----------------------|
| GET      | /api/v1/SoftwareEngineer         | List all engineers    |
| GET      | /api/v1/SoftwareEngineer/{id}    | Get engineer by ID    |
| POST     | /api/v1/SoftwareEngineer         | Create new engineer   |
| PUT      | /api/v1/SoftwareEngineer/{id}    | Update engineer       |
| DELETE   | /api/v1/SoftwareEngineer/{id}    | Delete engineer       |

## Testing with Postman

All endpoints were tested using Postman. To test the API:

1. Download [Postman](https://www.postman.com/downloads/)
2. Start the application
3. Import the requests below or create manually using the endpoints table

## Request Examples

### Create engineer (POST)
```json
{
    "name": "John",
    "techStack": "java, spring boot, docker"
}
```

### Update engineer (PUT)
```json
{
    "name": "John Updated",
    "techStack": "java, spring boot, docker, kubernetes"
}
```

## Project Structure

```
src/main/java/com/example/springboot/
├── Application.java                    ← entry point
├── SoftwareEngineer.java               ← entity (database table)
├── softwareEngineerRepository.java     ← data access layer
├── SoftwareEngineerService.java        ← business logic
└── SoftwareEngineerController.java     ← REST endpoints
```

## What I learned

- REST API development with Spring Boot
- Database integration with Spring Data JPA and PostgreSQL
- Running PostgreSQL with Docker
- Complete CRUD operations
- Testing APIs with Postman
