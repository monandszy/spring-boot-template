# Hexagonal Architecture (Ports and Adapters)
An architectural pattern that enforces strict separation between the core business logic of an application and the external services it interacts with (like databases, web frameworks, or third-party APIs). Communication between the core and the outside world happens strictly through predefined "Ports" (interfaces) and "Adapters" (implementations).

### Why?
- **Isolation of Core Logic:** Business rules are not polluted with HTTP requests, SQL queries, or framework-specific annotations. The core code remains pure and focused only on solving business problems.
- **Easy Testability:** You can easily mock or stub the external dependencies (Adapters) to write fast, reliable unit tests for the core logic without needing a running database or web server.
- **Technology Agnosticism:** You can swap out a database engine (e.g., migrating from PostgreSQL to MongoDB) or a web framework without changing a single line of your domain logic.

---

## What is a Module?
A module is a cohesive grouping of code based on a specific business capability or feature, leveraging principles from Domain-Driven Design (DDD).

- **Domain (DDD):** The absolute core. Contains pure business entities, value objects, and domain logic. No external dependencies allowed.
- **Services (SSD):** Orchestrates business use cases. It fetches data via ports, applies domain logic, and saves the results.
- **Facade (Port):** A simplified, public-facing interface for the module. Other modules or layers must only interact with this module through its Facade.
- **DAO (IoC):** Data Access Objects. The interfaces (Ports) defined by the core that the infrastructure layer will implement. Uses Inversion of Control to keep dependencies pointing inward.
- **Mappers:** Translates data between the internal Domain models and external representations (like DTOs for an API or Entities for an ORM).

### Why?
- **High Cohesion, Low Coupling:** Code that changes together stays together. By strictly communicating through Facades, modules remain independent, preventing a "spaghetti" monolith.
- **Mental Sandbox:** Developers can work on a specific module without needing to understand the internal complexities of other modules.

## Folder Structure (Vertical Slicing)
```text
src/
  modules/          # Core (The inside of the hexagon)
    <module-name>/
      domain/       # Pure classes
        models/
        events/
      services/     # Use cases and business logic (Command Pattern / Use Case Pattern)
      ports/        # Interfaces for input (APIs) and output (Repositories)
        in/         # Interfaces defining what this module can do, for use in api.
          <facades>
        out/        # Interfaces for database or external api

  entrypoints/      # Inbound Adapters
    http/           # HTTP/REST endpoints calling module Facades

  infrastructure/   # Outbound Adapters
    database/       # Implementations of Repository ports
    llm-api/        # Implementations of third-party API calls
  shared/           # Utilities
  bootstrap/        # Application run logic     
```

### Why?
- **Architecture as Documentation:** The directory structure visually communicates the architectural rules. Developers instantly know where domain logic goes versus where a database query goes.
- **Enforced Boundaries:** It becomes highly obvious (and preventable in code review) if someone tries to import an `infrastructure` tool directly into the `modules` core directory.

---

## Module Development Plan

### 1. Domain Design
- Identify the core domain classes and their business rules.
- Design the module Facades (what this module exposes to the rest of the app).
- Create Fixtures for Adapters.

### 2. Rest API Design
- Define the contract (DTOs, endpoints).
- Set up documentation generation (Swagger/OpenAPI)

### 3. DevOps Deployment
- Deploy application, database, and other external dependencies docker containers, handle environment variables.

### 4. Frontend
- Consume the API

### 4. Database ERD Design
- Design the persistence layer.
- Set up migration tools and ORM mapping.
- Implement the infrastructure adapters to fulfill the core's Repository ports.

### Why?
- **Business Value First:** Starting with the Domain Design ensures you are actually solving the business problem before getting bogged down in database schemas or HTTP status codes.
- **Unblocking Teams:** Defining the REST API contract early allows frontend and backend teams to work strictly in parallel.
- **Deferred Decisions:** By delaying Database and Infrastructure design, technical choices are delayed until domain logic requirements requirements are fully understood.