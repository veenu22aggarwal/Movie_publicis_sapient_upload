Here I have built a simple Movie Service which highlights the **SOLID Principle** and **Design Pattern** Usage to Build **Scalable Service**.
Output of the Service before understanding the service
<img width="2592" height="646" alt="image" src="https://github.com/user-attachments/assets/a2b40145-5ce8-47c4-a7c7-3306444e613d" />

Display all Movies

<img width="1296" height="106" alt="Screenshot 2026-02-18 at 6 31 37 PM" src="https://github.com/user-attachments/assets/85d2b22d-c27a-4469-9c53-e265c2120bb3" />


 Pick any one backend feature to implement (UI is not required).
Examples: ticket booking, viewing shows, seat management, offers, etc.
We have implemented Simple ticket booking and display of shows feature
 
Explain your end-to-end system design, including architecture, APIs, database design, and component interactions.

This Service Focuses Uses Following Design Pattern:
1. Command Pattern: For converting request into command object, since each request is simple string input from command line.
2. Factory Pattern: to choose which command executor to be called this give us flexibility to add more functionalities to exisiting service.
3. Strategy Pattern: to choose amaong different startegies to book a movie in this service here we used simple strategy to book a movie.
  
Describe how your solution handles scalability, security, availability, payments, and integrations.

This service as of now doesn't support payment or security Features but we can use third party payment services and integrate them into the system using separate payment service.
For Authentication we either use JWT token or user name and password login and integrate Azure Active directory for token generation or create a database in service for storing user credential.

Briefly mention your technology choices, hosting approach, and delivery plan.

I have used java to build basic service we can host it on cloud using azure/aws, we have currently used inmemory hashmap but we can use sql database and redis for caching, for deployment we can use kubernetes.

Delivery plan:
1. Create Basic Service
2. Run on non-prod environment and test if passes,Rollout and keep health check dashboard ready to monitor the usage and how our service behaves.
