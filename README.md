# Library Management System
This project is not based on a real case, and has the purpose of showing my skills in software development.

## Overview
A Library Management System is a software built ot handle the primary housekeeping functions of a library. Libraries rely on library management systems to maange asset collections as well as relationships with their members. Library management systems help libraries keep track of the books and their checkouts, as well as members' subscriptions and profiles.

### Case
A library needs a system to manage all books it has in its catalogue. With a system the library will register and modify the data of books and members. Also, keeping track of number of book copies, availability and return date.

Each book copy will be treated as a single unique object inside the system, meaning that the same book will have difference barcodes for identifying them.

A member can check the catalog of books, see information about a specific book, see which books they are borrowing at the time and request for a book reservation. The member cannot modify any information in the system, aside for the book reservation which is cancelable any time. All information change need to be requested to a librarian to do it.

### System Requirements
* Each book will be catalogued in the system by its title, authors, publication date, publisher;
* Aside to it's physical characteristics, every book, even a duplicate of the same, will have a unique id in the system
* A book can have multiple copies, and members can checkout any copy;
* The system can retrive information about a particular book;
* A member can keep a book borrowed for a maximum of 7 days;
* A member can borrow a maximum of 5 books at the same time. Example: if the member is already keeping 4 books this person cannot borrow more 2 books;
* A member can request a book reservation, which prevents another person of borrowing for a period of 3 days after a copy changes status to available. But no more than 5 books can be reserved at a time.

### Main Actors
* Librarian: responsible for adding and modifying books and members. The librarian can also issue, reserve, and return book items;
* Member: members can search the catalogm, check which books they are borrowing at the moment and reserve books;

## Development
* [Spring Boot](https://spring.io/): back-end, API;
* [Angular](https://angular.io/): front-end;
* [PostgreSQL](https://www.postgresql.org/): database management;

### Quick start
Quick start guide from [official website](https://spring.io/quickstart)

To build and run the API run _mvnw_ script on project's base folder:

__MacOS/Linux__
```bash
./mvnw spring-boot:run
```

__Windows__
```bash
mvnw spring-boot:run
```

## Study Resources
Study Cases examples:

https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR

https://csestudyzone.blogspot.com/2019/04/uml-case-study-library-management-system.html