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

### API mapping



## Study Resources
Study Cases examples:

* https://www.educative.io/courses/grokking-the-object-oriented-design-interview/RMlM3NgjAyR
* https://csestudyzone.blogspot.com/2019/04/uml-case-study-library-management-system.html
* [Hibernate - JPA annotations](https://www.techferry.com/articles/hibernate-jpa-annotations.html)
* [Key JPA Hibernate annotations](https://thorben-janssen.com/key-jpa-hibernate-annotations/)
* [JPA queries with foreign keys as parameters](https://stackoverflow.com/questions/49831492/how-to-perform-a-query-in-spring-data-jpa-with-a-foreign-key)

## Trobleshooting

### Infinite Recursion when retriving data of entities that contains @OneToMany and @ManyToOne annotations
When inserting new data of entities that contains _foreign key_ pointing to another table, it's convenient to use _@ManyToOne_ and _@OneToMay_ to create a bidirectional connection between entities. When mapping to the database, JPA will save only the reference to the table.

For example, in the system different copies have different barcodes. So there's a _Book_ and _BookCopy_ tables. A book can have many copies, but a copy will only point to one book. When retriving data from _Book_ or from _BookCopy_, getter functions are used for data serialization to JSON.

```java
/*
 * Book.java
 */
@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
private List<BookCopy> copies;

public List<BookCopy> getCopies() { return copies; }
```

```java
/*
 * BookCopy.java
 */
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "bookId")
private Book book;

public Book getBook() { return book; }
```

When the book is serialized to JSON it tries to retrive all copies that are related to this book. But in the _BookCopy_ entity there's also a reference to the book, which makes the JPA search for the book that's being pointed by the copy, and again it happens for the copies that are hold by the book pointed by the previous copy, this way creating a recursion.

Using _@JsonManagedReference_ and _@JsonBackReference_ was one of the encountered solutions. These two annotations works in pair, the _former_ indicating that the property inside the entity is the 'parent' and will be serialized, and the _latter_ indicating that the property is the 'child' thus will not be serialized to JSON. So in the above example it will be like:

```java
/*
 * Book.java
 */
@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
@JsonManagedReference
private List<BookCopy> copies;

public List<BookCopy> getCopies() { return copies; }
```

```java
/*
 * BookCopy.java
 */
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "bookId")
@JsonBackReference
private Book book;

public Book getBook() { return book; }
```

* OBSERVATION: Personally I don't like this solution because only one of the entities will have the referenced data serialized, which is not the behaviour that I expect in this software.