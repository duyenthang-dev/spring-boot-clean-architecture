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
│   │   │   └── event/                      # Domain Events (Optional)
│   │   ├── application/                    # Application Layer
│   │   │   ├── usecase/                    # Use Case Implementations
│   │   │   │   └── CreateCourseUseCaseImpl.java
│   │   │   ├── port/                       # Input and Output Ports
│   │   │   │   ├── input/                  # Input Ports (Use Case Interfaces)
│   │   │   │   │   └── CreateCourseUseCase.java
│   │   │   │   └── output/                 # Output Ports (Repository Interfaces)
│   │   │   │       └── CourseRepository.java
│   │   ├── adapter/                        # Adapters Layer (Interface Implementations)
│   │   │   ├── web/                        # Web Adapters
│   │   │   │   ├── controller/             # REST Controllers
│   │   │   │   │   └── CourseController.java
│   │   │   │   ├── dto/                    # DTOs for Requests and Responses
│   │   │   │   │   ├── request/            # Input DTOs
│   │   │   │   │   │   └── CreateCourseRequest.java
│   │   │   │   │   └── response/           # Output DTOs
│   │   │   │   │       └── CourseResponse.java
│   │   │   └── persistence/                # Persistence Adapters
│   │   │       ├── repository/             # Repository Implementations
│   │   │       │   └── JpaCourseRepository.java
│   │   │       ├── mapper/                 # Mappers (Entity ↔ Persistence Models)
│   │   │       │   └── CourseMapper.java
│   │   │       └── model/                  # Persistence Models (JPA Entities)
│   │   │           └── CourseEntity.java
│   │   ├── infrastructure/                 # Infrastructure Layer
│   │   │   ├── configuration/              # Spring Boot Configurations
│   │   │   │   └── AppConfig.java
│   │   │   ├── security/                   # Security Configurations
│   │   │   │   └── SecurityConfig.java
│   │   │   ├── messaging/                  # Messaging Configurations
│   │   │   │   └── KafkaConfig.java
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