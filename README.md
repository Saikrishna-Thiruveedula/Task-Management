# Task Management System

A **Full Stack Task Management Application** built using **React (frontend)** and **Spring Boot (backend)**.  
This project allows **Managers to create/delete tasks** and **Engineers to view and update task status**.

---

## **Features**
### **Manager Features**
- Create and assign tasks (with title, description, status, and target date).
- Delete tasks.
  
### **Engineer Features**
- View all tasks assigned.
- Update only **status** and **description**.

### **Other Features**
- Role-based authentication using Spring Security.
- REST APIs with JSON responses.
- React UI with Axios integration to call backend APIs.
- Database integration with Oracle DB.
- Backend runs on Spring Boot's **embedded Tomcat**.

---

## **Tech Stack**
**Frontend:**
- React 18+
- Axios
- React Router
- Tailwind CSS (or your CSS library)

**Backend:**
- Java 17 (or 11+)
- Spring Boot 3.x
- Spring Data JPA (Hibernate)
- Spring Security
- REST API
- Oracle Database 21c

**Other Tools:**
- Maven
- Git & GitHub

---

## **Project Structure**
Springboot-TaskManagementSystem/ # Backend
├── src/main/java/com/nt/ # Spring Boot code
│ ├── controller/ # REST Controllers
│ ├── model/ # Entities (Task, User)
│ ├── repository/ # JPA repositories
│ └── service/ # Business logic
└── src/main/resources/
├── application.properties # Backend config

frontend-taskmanager/ # React Frontend
├── src/
│ ├── components/ # React components (Dashboard, Login, etc.)
│ ├── pages/ # Page-based structure
│ └── App.jsx # Main React App
├── package.json

## **Setup Instructions**

### **1. Clone the Repository**
```bash
git clone https://github.com/Saikrishna-Thiruveedula/Task-Management.git

Backend Setup (Spring Boot)
bash
Copy
Edit
cd Springboot-TaskManagementSystem
mvn clean install
mvn spring-boot:run
The backend will run on http://localhost:8080/.

 Frontend Setup (React)
bash
Copy
Edit
cd frontend-taskmanager
npm install
npm start
The React frontend will run on http://localhost:5173/ (or another port).

 Configure Database
Update application.properties with your Oracle database credentials:

properties
Copy
Edit
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


API Endpoints
Manager APIs:

POST /api/tasks - Create a new task.

DELETE /api/tasks/{id} - Delete a task.

Engineer APIs:

GET /api/tasks - View all tasks.

PUT /api/tasks/{id} - Update task status or description.

Author
Saikrishna Thiruveedula
GitHub Profile

yaml
Copy
Edit

---
### **Next Step**  
Would you like me to **create a `README.md` file** with this content and give you the exact file you can place in the root of yo
