# Infrastructure Configuration

This directory contains the infrastructure configuration for deploying the application stack, organized using the "folder-per-container" pattern in Docker Compose.

## Architecture

The infrastructure consists of several logical units that are composed via top-level files:

1. **Networking (`compose-networking.yml`)**  
   Handles external and internal routing.
   - **Caddy**: Reverse proxy and web server.
   - **Cloudflared**: Secure tunneling proxy.

2. **Data (`compose-data.yml`)**  
   Provides relational data and messaging queues.
   - **PostgreSQL**: Relational database storage.
   - **RabbitMQ**: Message brokering.

3. **Observability (`compose-observability.yml`)**  
   Contains logging, tracing, metrics, and visualization tools.
   - **OpenTelemetry & Data-Prepper**: Traces and metrics ingestion.
   - **Jaeger**: Distributed tracing UI.
   - **OpenSearch & Dashboards**: Searching analysis and log dashboards.
   - **Prometheus**: Metric scraping.

## Usage & Variables

Each logical unit's versions and parameters are managed centrally within the `infra/.env` file. These are dynamically injected into sub-compose files utilizing the `include` directive.

If you are modifying deployment scopes (such as App profiles, version tags, or ports), those variables are strictly contained in `app/.env` directly alongside the deployment definitions in `app/compose.yml`.
