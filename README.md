# Hexagonal architecture and Domain-Driven Design

### 1. Introduction:
![DDD](https://res.cloudinary.com/practicaldev/image/fetch/s--5Izc96n2--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/neskpxcjjz9a53hs9xir.png)
### 2. Fundamentals of Domain-Driven Design:
### 3. Use case: fast-food ordering backend API implementation:
The project is built with Java Spring SpringBoot.
For the first part of project, we provided one GET endpoint, to retrieve categories of available food by calling an external public API (TheMealDB).
**Architecture :**
The project contains 3 main folders: 
- application
- domain
- infrastructure

In application folder, there is a controller folder containing Controller class, which provides endpoint of this application.
In infrastructure folder, there is a provider folder containing Provider class with implementation for retrieving data from an external API.
### 4. Best practices:
### 5. Conclusion:
