# 🚀 Spring Boot Greeting App

A simple **Spring Boot console application** that demonstrates **Dependency Injection** with multiple service implementations.

---

## ✨ Features

- ✅ Three greeting services:
    - English (`Hello`)
    - Spanish (`¡Hola`)
    - French (`Bonjour`)
- ✅ Uses constructor-based dependency injection with `@Qualifier`
- ✅ Outputs greetings using SLF4J `Logger`, not `System.out.println`
- ✅ Fully testable and clean architecture

---

## 🧠 What You’ll Learn

- How Spring injects beans into your application
- How to use `@Component`, `@Service`, and `@Qualifier`
- How to log messages with `LoggerFactory`

---

## 🛠️ Tech Stack

- Java 17+ (or your preferred version)
- Spring Boot 3.x
- Maven

---

## 🧪 How to Run

Make sure you have Maven installed, then run:

```bash
mvn spring-boot:run
