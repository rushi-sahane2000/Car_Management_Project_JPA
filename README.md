# 🚗 Car Management System — Spring Boot + JPA

A RESTful CRUD application to manage car records, built with **Spring Boot**, **Spring Data JPA**, and tested via **Postman**.

---

## 📁 Project Structure

```
CarManagementJPA/
├── src/
│   └── main/
│       ├── java/com/cfs/CarManagementJPA/
│       │   ├── controller/
│       │   │   └── CarController.java       # REST API endpoints
│       │   ├── entity/
│       │   │   └── Car.java                 # JPA Entity
│       │   ├── repository/
│       │   │   └── CarRepository.java       # Spring Data JPA Repository
│       │   ├── service/
│       │   │   ├── CarService.java          # Service Interface
│       │   │   └── CarServiceImpl.java      # Service Implementation
│       │   └── CarManagementJpaApplication.java
│       └── resources/
│           └── application.properties       # DB & App Configuration
├── pom.xml
└── README.md
```

---

## 🛠️ Tech Stack

| Technology        | Purpose                        |
|-------------------|--------------------------------|
| Java              | Core language                  |
| Spring Boot       | Application framework          |
| Spring Data JPA   | Database ORM layer             |
| Hibernate         | JPA implementation             |
| MySQL / H2        | Relational database            |
| Maven             | Dependency management          |
| Postman           | API testing                    |

---

## 🔗 API Endpoints

Base URL: `http://localhost:8080/car`

| Method   | Endpoint      | Description             |
|----------|---------------|-------------------------|
| `POST`   | `/car`        | Add a new car           |
| `GET`    | `/car`        | Get all cars            |
| `GET`    | `/car/{id}`   | Get a car by ID         |
| `PUT`    | `/car/{id}`   | Update a car by ID      |
| `DELETE` | `/car/{id}`   | Delete a car by ID      |

---

## 📦 Car Entity

```json
{
  "id": 1,
  "carName": "Thar",
  "carType": "XUV",
  "carPrice": 34400.0
}
```

---

## ▶️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/CarManagementJPA.git
   cd CarManagementJPA
   ```

2. **Configure the database** in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/car_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Test APIs** using Postman at `http://localhost:8080/car`

---

## 📬 Sample Requests

### ➕ Add a Car (POST)
```json
POST /car
Content-Type: application/json

{
  "carName": "Maruti",
  "carType": "XUV",
  "carPrice": 123300.0
}
```

### ✏️ Update a Car (PUT)
```json
PUT /car/1
Content-Type: application/json

{
  "carName": "Thar",
  "carType": "SUV",
  "carPrice": 36000.0
}
```

### ❌ Delete a Car (DELETE)
```
DELETE /car/1
Response: "Car Delete Successfully....!!!"
```

---

## 📚 Concepts Practiced

- Spring Boot REST Controller (`@RestController`, `@RequestMapping`)
- JPA Entity mapping (`@Entity`, `@Id`, `@GeneratedValue`)
- Spring Data JPA Repository (`JpaRepository`)
- Service layer with interface + implementation pattern
- Constructor-based dependency injection (`@Autowired`)
- CRUD operations via HTTP methods (GET, POST, PUT, DELETE)
- Testing REST APIs with Postman

---

## 👤 Author

**Rushikesh Sahane**  
Practice Project — Spring Boot + JPA CRUD

---

> ⭐ If you found this helpful, consider starring the repository!
