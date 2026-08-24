# Learn About SOLID Principles
**SOLID** design principles help developers write clean, understandable, maintainable, and modular code for long-term project maintenance and maximum reusability.
The term **SOLID** combines five individual design principles that work together to optimize software architecture.
Below is the breakdown of what each letter stands for and how they apply to real-world scenarios.

## 1. Single Responsibility Principle (SRP)
A class should have only one reason to change.
It should focus on a single, well-defined job.

### Real-World Use Case
An Invoice Management System.
An invoice needs to calculate costs, save to a database, and print receipts.
Putting all this inside an Invoice class makes it fragile.

## 2. Open/Closed Principle (OCP)
Software entities should be open for extension, but closed for modification.
You should be able to add new functionality without touching existing, tested code.

### Real-World Use Case
A Payment Gateway integration.
Your e-commerce app starts by accepting Credit Cards.
Later, management asks to add PayPal and Crypto.

## 3. Liskov Substitution Principle (LSP)
Subtypes must be substitutable for their base types without altering the correctness of the program.
If Class B is a subclass of Class A, replacing A with B should not break the code.

### Real-World Use Case
A Banking System Application.
The system processes transactions for various types of accounts.

## 4. Interface Segregation Principle (ISP)
Clients should not be forced to depend on methods they do not use.
It is better to have many small, specific interfaces rather than one bloated interface.

### Real-World Use Case
Smart Office Device Drivers.
You have multi-function industrial printers and simple desk printers.

## Implementation Code
[Browse SOLID Source Files](./)