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
Available on [Diagrams](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=library.drawio.html#R7Zttc5s4EMc%2FjV%2F6xhjsOC9jJ23Tc27aOHe56ZuObBTQWbCckJ%2F66W8BYYKRY9c9oNPRjCdBy%2FKg%2Ff8Q2gU69iTYvhck8h%2FApbzT77nbjn3b6fevnRH%2BTQy7zGA5I2XxBHOVrTDM2DeqjD1lXTGXxiVHCcAli8rGBYQhXciSjQgBm7LbC%2FDyUSPi0YphtiC8an1mrvQz66h%2FVdg%2FUOb5%2BZGt4XW2JiC5s%2BpJ7BMXNq9M9l3HnggAmS0F2wnlSfDyuDzf7575dDl8%2F%2FFz%2FC%2F5c%2Fz70x9%2FdbOdvfueTfZdEDSUF%2B9azJwv24%2FTDw%2BfH9ezm233%2Fsvf624enlju8oBRF%2BOnmiCkDx6EhN8V1rGAVejSZLc9bBU%2BU4AIjRYa%2F6FS7hQMZCUBTb4MuFqbHTM50IFGJzqYnyysxIK%2B0SslmCTCo%2FINP6uQEfmnEFApdrihoJxIti6fHVEgenu%2FIti4oOL9HbFXZ7kmfKWONAZYVvSINyzgJEwC%2FwKhzKVJ4kg480JcXmDYqEDDmgrJkP0btUImgowXPuPulOxglQQjlmSxzFtjHwT7hrsluTa4WkilXH9Y8pglWyrVBY3R51OumHVgeiDbkuOUxFIZFsA5iWI233cjQJ1YOAYpIVBOKjTYHbq9gJGqpGov%2FZ6KuhrOBtd21t4UY4M1Uj7%2B63Fh6NSEgVXBoKs2ucH%2FUwi9ChIYFJlKJWBJJ8ABtb8NIWOEcX5gyjHh9EUehSSOyIKF3jT1uXUKy6MKQmIC3PaFp4Ogz1yXhuloIIkkmZqJdBGwUKZBGozxh7Gc9H4bdAZ44hNsW0Ubf4m7kBMIsS%2BEpcJSRGVDE1zGHidxXBozThBx%2FDqrEqEIQMbPAiD3%2B9%2F1H2r1l0wmEU0QmEnBDAS1QjDotwzBtRYCvHP6iYaGgkYouBq1TMGVloJoNecokmQQfnWJVKPCLS49sYAaImokwuo5LSMxOo5E7FMzNjRGgt1rmYR%2BhYSK4JylQmaC59mudZHaAeqWJntK3qc0tetaFQTsKgK2Rm5O5pR%2FgpglwxjaROZ7gMEppcsosxCvACbrVH1w5uxwVFdyUE0SJxDtTJLYu%2BS6vyBhHBwkjENbM1Uc6oioaxywTMJY853gWFnojYxRR0BtdwLL0RIwB1jeGwoaokCXMjZLgZkQHJ8QNIKALl%2FU3grqmhEOKgQ80GCON3kzPWhoerB%2FOKSQsHuaNEHHhHXdq4sKfUGxPD9AH3t7sw%2BMuUlcOEJkl%2BDPO1Xo6wuLIQlMcbkxClqfKtjVLDItL7sujqyxAaEpEM6dMNQHgj53pAFh3GDQFAbaqnKzHFRzh%2FShI%2BU08lMJDQsNsaCrKzfLgq1lIcLOb0C4BoXGUNAVm5udLVYfQFYkNyWFWhkYnVterms0qNYUHmlMxTp9%2FvxW4mhqDHU9grAOagyO5p01bY2htnfW7HNqDOZe8QPjhP2TFxZsfWGBxfGKmrdUGqah9QKDoy8wBGk12jyTaoqD1usLjr6%2BsIBoZyhoioL2ywuOvryATeYyuctAGANwSkLDQq0stF9eMDll3TnlKQbOrSvUlVPm%2Bcqv9ZFZfsWc%2FMrMafUrM8f5FYOfvwR3OvhHcusfDT42iy8%2F03Wvvp%2B17%2F4D).

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

https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR

https://csestudyzone.blogspot.com/2019/04/uml-case-study-library-management-system.html

[Hibernate - JPA annotations](https://www.techferry.com/articles/hibernate-jpa-annotations.html)

[Key JPA Hibernate annotations](https://thorben-janssen.com/key-jpa-hibernate-annotations/)