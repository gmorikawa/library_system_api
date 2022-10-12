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

### Class Diagram
Available on [Diagrams](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1#R7ZvbUuM4EIafJpdsxYeEcEkSBpgNUwyBZYubKcUWsRbZ7ZWV0zz9tG05IbFIAhU7w5SqUmC12wd1f5b9t%2BWG0wvnl4LEwQ34lDfspj9vOP2GbZ%2B2Ovg3NSxyg2WdNXPLWDBf2VaGIftJlbFwmzCfJmuOEoBLFq8bPYgi6sk1GxECZutuz8DXjxqTMS0Zhh7hZesj82WQWzv26cp%2BRdk4KI5stc%2FyNSEpnFVPkoD4MHtlci4aTk8AyHwpnPcoT4NXxOXxevHIBy%2Fty6%2Ffk%2F%2FJQ%2Ffv%2B2%2F%2FnOQ7%2B%2FKeTZZdEDSSH961GLpP86%2BDq5vvd9Ph%2Bfzk%2Bunf6UkRnkQuioBRH%2BOnmiBkAGOICL9YWbsCJpFP0902sbXyGQDEaLTQ%2BB%2BVcqFgIBMJaApkyNXaPftTnBtMhEe3dELlRxIxpnKLX4Fk2sNXcKhwXVIIqRQLdBCUE8mm6wQRBeJ46bcKNi6oeL8j9upspoRP1JG6AC%2BlfCQzFnISpYF%2FhkgWqUnjSDgbR7jsYRypQMOUCsmQ%2FXO1QqYJ6XoB4%2F6ALGCSRieRxHspWt0ABPuJuyVFbnC1kCpzdnvNY5huqbIuaII%2Bt0UKrQ3TDZmvOQ5IIpXBA85JnLDRshshJo5FXZASQuX0PkLSbtP51pSqtXZTRV0NZ60zJ2%2FPVmOD1VE%2Bwetxoe1WhIFVwuBEbXKO%2FwcQjUtIYGdllioBL7QHHDD3%2FQhyRhjnG6YCE06f5ZuQJDHxWDQeZD59d2W5U0FITYDbPvNsEAyY79MoGw0kkSTPZpq6GFgksyC1uvjDWPaaf7UaLTzxHratVRt%2FqbuQPYiwL4RluaaIyoymuHTHnCTJm2PG1otqNxGKAGR8LwAKv4Pnv63Nv2QyjWiKwFAKZiCoFIKWfWQIzrQQ4J0zSHNoKKiFgtPOkSk41VIQT0YckyQZRD98ItWo0MelexZSQ0SFRFhN98hIdN5GIgmoGRtqI8FpHpkEu0RCKeGcZYnME16oXetD2Q4xb5nYU%2Bm9z6TdiVVCwCkj4GjSzcmI8ltIWDqMoU3kvhsY7Mr0OsoswiuAySqz3trz6bBTlTgoi8QexAsjEps7r%2FvDCMbWhmBsO5pHxbZOMDqVMWEU4yFvBdZBJKMOgcpuBZarJWAE8HJtKKiJAp1mrIqCp%2F6dbT8sut9%2BxPdt1ncebq%2B%2BaOqHmWacEsbzsKYcdAE4JZFBoUoUdMKxVhT0d4QRER74CoSHh%2Bu%2BoaBKCrRisd77gtEIb2uEehjQyUQdA1U9HNqtEgI3NBzhg7%2BRDDVJhuULY8WE09yTieWr9cNToX%2FJsC4Z0MeZny8DY24T%2BwwRy%2Bvt86gHW%2F%2ByISKheeFUGwV1qgftKTtvyAffx5E1MSDUBUKd2kEPgl480BB1pMGgLgyOLx6KwubmRATKaRxkKTQs1MTCviKiOhYcLQsxdn4Gwjco1IaC7gVUvU%2BL5UkJpZSbmkKlDHT2fFasqqbglGsKdzShYprNSdkmHE2NoaIaQ8vaqDG4mnms2hpDZfNYnX1qDOZese844Xy%2BwoKjLyywJJlQM3OtZhqOXmBw9QWGMKtGm9fUdXFw9PqCq68veBAvDAV1UXD88oKrLy9gk%2FlMLsxshfpYOH55wWjKg2rKDzCwb12hKk1Z6JVP%2FeFpcYHs%2FPK0eBb6Tb48dd0%2FIPjFNNjdwbdqCj42V1%2BDZ%2BtefVPvXPwC).

## Development

### Technologies
* [Spring Boot](https://spring.io/): back-end, API;
* [Angular](https://angular.io/): front-end;
* [PostgreSQL](https://www.postgresql.org/): database management;

### Other Tools
* [Diagrams](https://app.diagrams.net/): for drawing UML diagrams;

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

* https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR
* https://csestudyzone.blogspot.com/2019/04/uml-case-study-library-management-system.html
* [Hibernate - JPA annotations](https://www.techferry.com/articles/hibernate-jpa-annotations.html)
* [Key JPA Hibernate annotations](https://thorben-janssen.com/key-jpa-hibernate-annotations/)