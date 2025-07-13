# SpringBoot3MicroservicesGuide

This repository contains a practice project following the YouTube tutorial:  
[Spring Boot 3: Guía de Microservicios by Teotech](https://www.youtube.com/watch?v=t0D4OPcugyI)

> **Disclaimer**: This project is for **educational purposes only**.  
> I'm currently learning how to build microservices using Spring Boot 3 and Spring Cloud, following the video step by step.

---

## What I’m Learning
As of now, I’ve implemented the core microservice infrastructure:
- **Eureka Server** – Service registry for discovering microservices
- **Config Server** – Centralized external configuration management
- **API Gateway** – Entry point that routes requests to services
- **Product Service** – (Coming soon)

---

## Technologies Used (so far)
- Java 17
- Spring Boot 3
- Spring Cloud (Eureka, Config Server, Gateway)
- Maven

---

## Project Structure (current progress)
```text
SpringBoot3MicroservicesGuide/
├── eureka-server/           # Service registry
├── config-server/           # Central config server
├── api-gateway/             # Gateway for routing
└── (product-service/)       # Coming soon
```

---

## How to Run
Each module is a Spring Boot project using Maven.  
To run any of them, go to the respective folder and use:

```bash
mvn spring-boot:run
```
1. `eureka-server`  
2. `config-server`  
3. `api-gateway`

---

## Notes

This repository is part of my personal learning process based on a public tutorial.  
The `product-service` will be implemented in the next steps.

---

## License
Shared publicly for educational purposes only.
