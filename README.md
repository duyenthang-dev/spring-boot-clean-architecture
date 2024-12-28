# Clean Architecture (Onion) + Spring Boot
This repository contains a sample project that demonstrates the principles of clean architecture in software development. It is implemented based on the onion architecture.

## Directory Structure

``` 
src/
├── main/
│   ├── java/com/example/app/
│   │   ├── domain/                         # Core Business Logic
│   │   │   ├── entity/                     # Domain Entities (e.g., Course, User)
│   │   │   ├── service/                    # Domain Services (Business Logic)
│   │   ├── application/                    # Application Layer
│   │   │   ├── usecase/                    # Use Case Implementations
│   │   │   │   └── VideoUseCaseImpl.java
│   │   │   ├── port/                       # Input and Output Ports
│   │   │   │   ├── input/                  # Input Ports (Use Case Interfaces)
│   │   │   │   │   └── VideoUseCase.java
│   │   │   │   └── output/                 # Output Ports (Repository Interfaces)
│   │   │   │       └── VideoRepository.java
│   │   ├── api/                            # Adapters Layer (Interface Implementations)
│   │   │   ├── http/                       # Web Adapters
│   │   │   │   ├── controller/             # REST Controllers
│   │   │   │   │   └── CourseController.java
│   │   │   │   ├── dto/                    # DTOs for Requests and Responses
│   │   │   │   │   ├── request/            # Input DTOs
│   │   │   │   │   │   └── CreateVideoRequest.java
│   │   │   │   │   └── response/           # Output DTOs
│   │   │   │   │       └── CreateVideoResponse.java
|   |   |   ├── rpc/                        # For rpc
|   |   |   ├── graphQL/                    # For graphQL
|   |   |   |
│   │   ├── infrastructure/                 # Infrastructure Layer
│   │   │   ├── configuration/              # Spring Boot Configurations
│   │   │   │   └── AppConfig.java
│   │   │   ├── security/                   # Security 
│   │   │   ├── messaging/                  # Messaging 
|   |   |   ├── persistence
|   |   |   |   ├── repository/             # Repository Implementations
│   │   │   |   │   └── VideoRepositoryImpl.java
│   │   │   |   ├── mapper/                 # Mappers (Entity ↔ Persistence Models)
│   │   │   |   │   └── VideoMapper.java
│   │   │   |   └── entity/                  # Persistence Models (JPA Entities)
│   │   │           └── VideoEntity.java
│   │   │   └── external/                   # External Integrations
│   │   │       ├── api/                    # External API Clients
│   │   │       └── service/                # External Service Integrations
│   │   └── shared/                         # Shared Utilities
│   │       ├── exception/                  # Custom Exceptions
│   │       ├── utils/                      # Utility Classes
│   │       └── constants/                  # Application-Wide Constants
├── resources/
│   ├── db/                                 # Database Migration Files
│   ├── application.properties              # Spring Config
│   └── application.yml                     # Alternative Config
├── test/
│   ├── java/com/example/app/
│   │   ├── domain/                         # Domain Layer Tests
│   │   ├── application/                    # Application Layer Tests
│   │   ├── adapter/                        # Adapter Layer Tests
│   │   ├── infrastructure/                 # Infrastructure Layer Tests
│   │   └── shared/                         # Shared Utilities Tests

```
