# Spring Boot Modulith Template

This repository serves as a foundational blueprint, establishing pragmatic, structured guidelines for version control, architectural boundaries, code quality, and testing. It features a modular Spring Boot application template grouped with an Local Docker infrastructure setup.

## Getting Started

Use the provided `Makefile` to easily build and manage the project:

- **`make build`**: Build the application backend using Gradle.
- **`make run`**: Run the Spring Boot application locally.
- **`make test`**: Run the backend test suite.
- **`make clean`**: Clean the build directory.
- **`make up`**: Bring up the local Docker data, networking, and observability stacks.
- **`make down`**: Tear down the Docker infrastructure stack.
- **`make deploy`**: Completely builds the application container and deploys it in Docker utilizing variables housed inside `app/.env`.

You can set Spring profiles via environment variables configured in your application definitions.

## Repository Structure

- [**`app/Readme.md`**](app/Readme.md): Details the complete Spring Boot Application Architecture, Modular Modulith structure, Web API, and Testing Strategy.
- [**`infra/Readme.md`**](infra/Readme.md): Outlines the modular folder-per-container Docker Compose infrastructure separating networking, data, and observability nodes via environment files. 
- [**`docs/`**](docs/): General philosophical blueprints handling software boundaries (Ports & Adapters), Git Workflows (GitHub Flow), Code Quality rules, and broader theoretical Testing principles.




