# CreditKart Spring Boot Project

A Spring Boot Restful Web Service 

## Tech stack used: 
* JAVA 1.8
* Spring Boot (Java Framework) (2.2)
* Maven
* Swagger (2.9.2)

## Setup Instruction
1. Clone the repository
2. Requirement
    - JDK 1.8
    - Maven 3.x
3. Build the project using 
   ```
   mvn clean install
   ```
   
To run the application:
   ```
   java -jar target/creditkart-0.0.1-SNAPSHOT.jar
   ```
   
## Following logs will be generated if application is started successfully:
```
2020-01-23 00:46:08.807  INFO 2616 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-01-23 00:46:08.814  INFO 2616 --- [           main] c.s.s.creditkart.CreditkartApplication   : Started CreditkartApplication in 9.987 seconds (JVM running for 10.745)
```
## UML Diagram
* The CreditKart application have a Customer Entity and a Account Entity.
* A Cutomer can have multiple Accounts.
![UML Diagram](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/01UML.png)

## Swagger
Swagger is majorly used for API documentation. Following are the API Controllers used in the application:
![Swagger](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/02Swagger.png)
### Sample Account REST API
![Swagger](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/03AccountRestController.png)

## Table
Customer table (t_customer) and Account table (t_account) is created on start-up
### Customer Table
![Customer Table](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/04CustomeTable.png)
### Account Table
![Account Table](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/05AccountTable.png)

## Postman Calls
Following postman calls are used to verify and test the API's
### Get All Accounts Details
![Get All Accounts Details](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/06GetAllAccountPostman.png)

### Get All Customers Details
![Get All Customers](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/07GetAllCustomer.png)

### Add a New Customer
![New A Customer](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/08NewCustomer.png)

### Delete a Customer09DeleteCustomer
![Delete A Customer](https://github.com/upasana05ghosh/Spring-Boot-Project/blob/master/creditkart/Images/09DeleteCustomer.png)
