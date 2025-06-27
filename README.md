# Go-Rental-🚗 Car Rental Platform

![License](https://img.shields.io/badge/License-MIT-green.svg)
![Microservices](https://img.shields.io/badge/Architecture-Microservices-blue.svg)
![Status](https://img.shields.io/badge/Status-Active-success.svg)

> A modern microservices-based **Car Rental System** built with Spring Boot and REST APIs. This project allows users to sign up, search cars, book rentals, make payments, and manage booking statuses efficiently through independent services.

---

## 👨‍💻 Team Members (COHNDSE242F)

- **Ravindu Hettiarachchi** - 049  
- **Janindu Vinsura** - 064  
- **Jithmitha Rukshan** - 065  
- **Tharushi Nikethana** - 066  
- **Harshani Ayesha** - 101  

---

## 🧱 Microservice Architecture Overview

Each microservice runs independently and communicates via REST APIs using Spring Cloud principles. All services are accessed via the base path `/go-rentals`.


---

## 🔐 Users Microservice (port: 8081)

| Function          | Type        | Method | Endpoint |
|-------------------|-------------|--------|----------|
| Sign up           | Basic CRUD  | `POST` | `/go-rentals/users` |
| Forgot password   | Basic CRUD  | `PATCH`| `/go-rentals/users/{email}` |
| Login             | Action-based| `POST` | `/go-rentals/users/login` |
| Update profile    | Basic CRUD  | `PUT`  | `/go-rentals/users/{id}` |
| Delete profile    | Basic CRUD  | `DELETE`| `/go-rentals/users/{id}` |

---

## 🚗 Cars Microservice (port: 8080)

| Function              | Type        | Method | Endpoint |
|-----------------------|-------------|--------|----------|
| List all cars         | Basic CRUD  | `GET`  | `/go-rentals/cars` |
| Update car            | Basic CRUD  | `PUT`  | `/go-rentals/cars/{id}` |
| Delete car            | Basic CRUD  | `DELETE` | `/go-rentals/cars/{id}` |
| Add car               | Basic CRUD  | `POST` | `/go-rentals/cars` |
| Search by brand       | Query       | `GET`  | `/go-rentals/cars?brand=value` |
| Search by model       | Query       | `GET`  | `/go-rentals/cars?model=value` |
| Search by price       | Query       | `GET`  | `/go-rentals/cars?price=value` |
| Search by availability| Query       | `GET`  | `/go-rentals/cars?availability=true` |
| Filter by all fields  | Query       | `GET`  | `/go-rentals/cars?brand=value1&model=value2&availability=value3&price=value4` |

---

## 📅 Bookings Microservice (port: 8082)

| Function              | Type        | Method | Endpoint |
|-----------------------|-------------|--------|----------|
| Make booking          | Basic CRUD  | `POST` | `/go-rentals/bookings` |
| Update booking status | Basic CRUD  | `PATCH`| `/go-rentals/bookings/{id}` |
| Delete booking        | Basic CRUD  | `DELETE` | `/go-rentals/bookings/{id}` |
| View all bookings     | Basic CRUD  | `GET`  | `/go-rentals/bookings` |
| Search by date        | Query       | `GET`  | `/go-rentals/bookings?starting_date=value` |
| Search by days        | Query       | `GET`  | `/go-rentals/bookings?no_of_days=value` |
| Search by status      | Query       | `GET`  | `/go-rentals/bookings?status=value` |
| Filter by car ID      | Query       | `GET`  | `/go-rentals/bookings?car_id=value` |

---

## 💳 Payments Microservice (port: 8083)

| Function          | Type        | Method | Endpoint |
|-------------------|-------------|--------|----------|
| Make payment      | Basic CRUD  | `POST` | `/go-rentals/payments` |
| Get payment by ID | Basic CRUD  | `GET`  | `/go-rentals/payments/{id}` |
| Get history by user| Query       | `POST` | `/go-rentals/payments?user_id=value` |

---

## 📌 API Gateway (Optional)

If using **Spring Cloud Gateway**, all services can be routed through a unified gateway with paths like:


---

## 🧪 Testing the Endpoints

- Use **Postman** or **cURL** to test REST endpoints.
- Each microservice should be run separately on its respective port.
- API documentation can be extended with Swagger/OpenAPI for better usability.

---

## 📦 Future Enhancements

- ✅ Add Email Notification Service  
- ✅ Enable Swagger API docs  
- 🔄 Integrate with a Frontend App (React/Angular)  
- 🔒 OAuth2 or Keycloak Integration  

---

## 🙏 Thank You

> Built with ❤️ by COHNDSE242F - Group 13  
> NIBM - School of Computing, 2024.2 Intake  

---


