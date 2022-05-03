# Calculator

This is a demo application to show knowledge with java+spring. 

It is simply a calculator that adds and subtracts 2 values.

## Pre-Requisites

- Java 11 or higher
- Maven 3.3+


## Repository / Run

1. Clone the repo

   ```sh
   git clone https://github.com/navarret3/calculator.git
   ```

2. Go to directory
   ```sh
   cd calculator
   ```

3. Init maven
   ```sh
   mvn clean install
   ```

4. Run application
   ```sh
   mvn spring-boot:run
   ```

## Endpoints / usage

```java
# add
curl --location --request GET 'http://localhost:8080/calculator/sum?num1=10&num2=2'

# substract
curl --location --request GET 'http://localhost:8080/calculator/subs?num1=10&num2=7'
```


#### Made by: Javier Navarrete Fresno
