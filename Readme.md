# Spring Boot Modulith Template

Work in progress. This repository will serve as a application blueprint, with pragmatic guidelines for version control, architectural boundaries, code quality, and testing. Features a modular Spring Boot backend template and a Local Docker infrastructure setup.

## Getting Started

Use the provided `Makefile` to build and manage the project:

- **`make build`**: Build the application backend using Gradle.
- **`make up`**: Bring up the local Docker data, networking, and observability stacks.
- **`make down`**: Tear down the Docker infrastructure stack.
- **`make deploy`**: Builds the backend container and deploys..

## Repository Structure

- [**`app/Readme.md`**](app/Readme.md): Details the Spring Boot backend, It's Modular Modulith structure, Web API, and Testing Strategy.
- [**`infra/Readme.md`**](infra/Readme.md): Defines a modular folder-per-container Docker Compose infrastructure with network separation.
- [**`docs/`**](docs/): General philosophical guidelines about software boundaries (Ports & Adapters), Git Workflows (GitHub Flow), Code Quality rules, and broader Testing principles.




