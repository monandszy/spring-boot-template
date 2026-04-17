# App Template (Backend + API)

This module is a backend Spring Boot template

## Applied Practices

- Hexagonal structure with vertical slices:
	- `modules/<module>/domain`
	- `modules/<module>/ports/in`
	- `modules/<module>/services`
	- `modules/<module>/mappers`
	- `entrypoints/http`
- Quality tools:
	- PMD
	- JaCoCo
	- Formatter via Spotless

## API Endpoint

- `GET /api/v1/status`
	- Returns module status payload (`module`, `status`, `checkedAt`)

## Swagger / OpenAPI

- OpenAPI JSON:
	- `GET /api-docs`
- Swagger UI:
	- `/swagger-ui`
