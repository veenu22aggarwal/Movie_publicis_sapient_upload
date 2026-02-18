**Overview**

I have developed a simple Movie Service that demonstrates the application of **SOLID principles and design patterns** to build a scalable and maintainable backend system. The service currently supports basic features such as displaying available movies and booking tickets through a command-line interface. The focus of this implementation is on clean architecture, extensibility, and adherence to software design best practices.

Implemented Feature

For this assignment, I have implemented a basic ticket booking and show display feature. The system allows users to view available movies and book tickets through predefined commands. The user interface is not included, as the emphasis is on backend design and functionality.

**APIs / Interfaces**

The service exposes internal command-based APIs, such as:

DisplayAllScreen – Retrieve all movies on Screen

Booking – Book tickets for a selected movie

Each request is converted into a command and processed through dedicated handlers.

**Database Design**

Currently, the system uses in-memory storage implemented with HashMaps for simplicity. The core entities include:

Movie (movieId, name)

Screen (screenId, moviename, theaterid, screenName)

Theater (TheaterId,theaterName)

For production deployment, this can be migrated to a relational database such as PostgreSQL, with Redis used for caching frequently accessed data.

**Component Interactions**

The user enters a command through the CLI.

The input is converted into a command object.

The Factory selects the appropriate command executor.

The selected strategy handles the booking logic.

The service updates data and returns the response.

This flow ensures modularity and loose coupling between components.

**Design Pattern Usage**
Command Pattern

Used to convert user input into command objects. This enables easy extension of new commands without modifying existing logic.

Factory Pattern

Responsible for selecting the appropriate command executor. This provides flexibility to add new features with minimal changes.

Strategy Pattern

Used to select among different ticket booking strategies. Currently, a simple booking strategy is implemented, but more complex strategies can be added in the future.

**Scalability, Availability, Payments And Security**
**Scalability**

Horizontal scaling using containerized deployments

Database scaling through read replicas

Caching with Redis to reduce database load

Stateless service design for easy replication

**Security**

Although not implemented in the current version, security can be added through:

JWT-based authentication

Username/password authentication

Integration with Azure Active Directory for identity management

**Availability**

Deployment across multiple availability zones

Health checks and monitoring dashboards

Automated failover mechanisms

Load balancing

**Payments**

Payment functionality is not currently supported. It can be integrated using third-party payment gateways (e.g., Stripe, PayPal) through a dedicated payment service.

**Technology Choices**

Programming Language: Java

Framework: Core Java / Spring Boot (for future enhancements)

Database: In-memory HashMap (current), PostgreSQL (production)

Caching: Redis

Containerization: Docker

Orchestration: Kubernetes

CI/CD: GitHub Actions

**Hosting Approach**

The service can be hosted on cloud platforms such as AWS or Azure using a container-based deployment model. Kubernetes will manage scaling, service discovery, and high availability. Managed database and caching services will be used to reduce operational overhead.

**Delivery Plan**

Initial Development: Build core booking and movie display features

Testing: Deploy to a non-production environment and perform functional and load testing

Production Rollout: Deploy using CI/CD pipelines

Monitoring & Support: Enable health checks, logging, and dashboards to monitor system behavior

Continuous Improvement: Implement enhancements based on usage metrics and feedback


Output of the Service before understanding the service
<img width="2592" height="646" alt="image" src="https://github.com/user-attachments/assets/a2b40145-5ce8-47c4-a7c7-3306444e613d" />

Display all Movies

<img width="1296" height="106" alt="Screenshot 2026-02-18 at 6 31 37 PM" src="https://github.com/user-attachments/assets/85d2b22d-c27a-4469-9c53-e265c2120bb3" />
