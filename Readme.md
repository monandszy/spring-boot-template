# GitHub Flow & Hexagonal Architecture Template

This repository serves as a foundational blueprint, establishing pragmatic, structured guidelines for version control, architectural boundaries, code quality, and testing.

## Documentation

The core principles and workflows driving this template are documented in the `docs/` directory.

- [**Architecture (Hexagonal / Ports & Adapters)**](docs/Architecture.md)  
  Defines the domain-driven modular structure, creating strict boundaries between core business logic and external infrastructure to guarantee testability and technology agnosticism.

- [**Git Workflow (GitHub Flow)**](docs/Git.md)  
  Outlines the branch-based pull request workflow, conventional commit formatting, and mandatory repository protection rules to maintain a clean, linear, and automatable version history.

- [**Code Quality**](docs/Quality.md)  
  Specifies the use of automated formatters and static analysis (linters) as gatekeepers for code style and best practices, effectively eliminating subjective debates during code reviews.

- [**Testing Strategy**](docs/Test.md)  
  Details a high-ROI testing approach categorized by structural layers: Facade (Integration) testing as the primary, supported by highly-targeted Unit, Entrypoint (HTTP/REST), and Infrastructure tests.
