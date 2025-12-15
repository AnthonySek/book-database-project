# CMPSC 363 – Database Project

This project is a Spring Boot web application connected to a MySQL database.
It demonstrates database design, SQL queries, REST APIs, and a web-based user interface.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- HTML / JavaScript

## Database Overview
The database models a book management system with the following entities:
- Book
- Author
- Publisher
- Genre

Relationships include:
- Books belong to one Publisher
- Books belong to one Genre
- Books and Authors are related through a join table

## Features
- View all books, authors, and publishers
- Add new records through a web interface
- Delete records through a web interface
- REST API endpoints for all entities
- SQL queries demonstrating joins

## Running the Project
1. Start MySQL and create the database
2. Update application properties if needed
3. Run the Spring Boot application
4. Open a browser at `http://localhost:8080`

## Author
Anthony Sek
