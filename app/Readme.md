# Application Details

This directory contains the Spring Boot application built with Spring Modulith and Gradle Kotlin DSL.

## Application Architecture

`code.TemplateApp` is the main class annotated with `@Modulithic`. It sets the JVM default timezone to UTC at startup.

### Modulith Structure

`src/main/java/code/modules` contains domain-specific modules (e.g., `catnips`, `accounts`, `pots`).
- **CommandFacade**: The public mutation API. Accepts DTOs, converts to domain objects, persists via DAO, and publishes `ApplicationEvent`s.
- **QueryFacade**: Read-only facade composing DTOs for the UI/API without side-effects.
- **Service/Data/Util**: Domain boundaries containing actual business rules, models, persistence repositories, and MapStruct mappers.

Modules communicate via Spring application events (see `src/main/java/code/events`) rather than calling internals of other modules.

### Web & Security

- **Security**: Controlled via `SecurityConfig.java`. Can be disabled for dev/tests (`spring.security.enabled=false`). The default includes a form-based login at `/login`.
- **Frontend & HTMX**: `HomePage.java` returns full Thymeleaf pages for standard requests, and partial fragments when the `HX-Request` header is detected, enabling seamless HTMX-driven interactions.

### Persistence & Initialization

- **Database Initialization**: `DatabaseInitializer.java` wires the active profile and database variables to dynamically handle database creation (`CREATE DATABASE`) and schema setup via a tuned HikariDataSource.
- **Authority Seeding**: `DataInitializer.java` listens for `ContextRefreshedEvent` and inserts essential roles/authorities on startup.

### Testing Strategy

Tests align with module boundaries and CQRS separation:
1. **Unit Tests (Module-Internal)**: Target pure logic and utilities, isolated from the Spring context.
2. **Integration Tests**: Verify transactional boundaries and module event publishing through a sliced per-module Spring Context.
3. **Web / Controller Tests**: Assert proper rendering, HTMX fragment handling, Auth, utilizing `@WebMvcTest` and WireMock.
4. **End-to-End Tests**: Full application workflows evaluating cross-module boundaries with Testcontainers.
