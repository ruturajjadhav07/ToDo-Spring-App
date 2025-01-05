# Spring Boot ToDo Application

This is a simple Spring Boot application that handles the functionality of a to-do list. Users can create and delete tasks. The application is built using **Spring Boot**, **Thymeleaf**, and **MySQL** for storing the tasks.

## Features
- Users can add tasks with a title.
- Users can delete tasks from the to-do list.
- The application displays a list of tasks and allows users to interact with them.

## Project Structure

- **Spring Boot** for the backend
- **Thymeleaf** for templating engine
- **MySQL** for the database

## Prerequisites

- Java 17 or higher
- MySQL installed and running
- Maven or Gradle for dependency management

## Technologies Used
- **Spring Boot**: Framework for building the application.
- **Thymeleaf**: Template engine for rendering HTML views.
- **Spring Data JPA**: Used to interact with the database.
- **MySQL**: Database for storing tasks.
- **Bootstrap**: For styling the front-end forms.

## Steps to Build the Application

### 1. Set Up Dependencies

**Dependencies** (used via Spring Initializr)
The following dependencies were selected via [Spring Initializr](https://start.spring.io/):

1. **Spring Web**: To create the REST API and serve web pages.
2. **Spring Data JPA**: For interacting with the database using JPA repositories.
3. **Thymeleaf**: To render dynamic web pages using templates.
4. **MySQL Driver**: For connecting to the MySQL database.

### 2. Clone the Repository
Clone the project from GitHub using the command:

```bash
git clone ttps://github.com/ruturajjadhav07/ToDo-Spring-App.git
```
### 3. Database Setup
**Step 1**: Create MySQL Database
Open your MySQL client (e.g., MySQL Workbench, phpMyAdmin, or command line) and create a new database:
sql
```bash
CREATE DATABASE spring_to_do_lis;
```
**Step 2**: Create task Table
Create the table to store tasks by running the following SQL query in the MySQL console:
sql
Copy code
```bash
USE spring_to_do_list;

CREATE TABLE task (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL
);
```
**Step 3**: Configure MySQL credentials in **application.properties**.
### 4. **Build and Run the Application**
```bash
  mvn clean install
./mvnw spring-boot:run
```
### 5. **Access the Application**:
Navigate to http://localhost:8080/

# Summary
The Spring Boot ToDo Application is a simple web app that allows users to manage tasks. It enables users to add tasks with titles and delete them as needed. The tasks are stored in a MySQL database, and the front-end is powered by Thymeleaf templates with Bootstrap for styling. Users can view the list of tasks and interact with them by adding new ones or removing completed tasks. The project is built using Spring Boot for the backend, Spring Data JPA for database interaction, and MySQL for storing the task data.


# Interface
**Read Task**
![image](https://github.com/user-attachments/assets/e7ace6d3-ed78-49f4-bab7-9ed1df8ce0bb)
**Add Task**
![image](https://github.com/user-attachments/assets/9311772b-919b-49ad-a2ee-172594012276)
**Delete Task**
![image](https://github.com/user-attachments/assets/9ad46472-c07c-40b2-8fa9-43609fb5b548)
