
# Employee Management System ✨

![Status](https://img.shields.io/badge/Status-Complete-green.svg)

This is a simple Spring Boot application that provides a RESTful API for managing employee data. It includes a basic H2 in-memory database, which is pre-populated with some initial data on startup. The project also features a web front-end built with Thymeleaf to interact with the API.

---

## 📂 Project Structure

* `src/main/java/com/example/`: Contains all the Java source code for the application.
* `src/main/resources/templates/`: Stores the HTML files (Thymeleaf templates) for the front-end.
* `src/main/resources/application.properties`: Configuration file for the application, including database and server settings.
* `pom.xml`: Maven configuration file, listing all project dependencies.

---

## 🚀 Setup Instructions

1.  **Prerequisites:** Ensure you have a Java Development Kit (JDK) 21 or newer and Maven installed on your system.
2.  **Clone the Repository:** Download the project files.
3.  **Run the Application:**
    * Navigate to the project's root directory in your terminal.
    * Run the command: `mvn spring-boot:run`
    * The application will start on `http://localhost:8080`.

---

## 📝 API Documentation

The REST API endpoints are documented using Swagger UI. You can access the interactive documentation at:

### **`http://localhost:8080/docs`**

### Endpoints Details

* `GET /api/employees`
    * **Description:** Retrieves a paginated and sorted list of all employees.
    * **Parameters:**
        * `page`: (Optional) The page number to retrieve (default: `0`).
        * `size`: (Optional) The number of items per page (default: `5`).
        * `sortBy`: (Optional) The property to sort by (default: `empid`).
        * `direction`: (Optional) The sort direction, `asc` or `desc` (default: `asc`).

* `POST /api/employees`
    * **Description:** Creates a new employee.
    * **Request Body:** A JSON object representing the new employee. The `empid` should be `null` as it's auto-generated.
    * **Example Body:**
        ```json
        {
          "empname": "John Doe",
          "empsalary": 60000,
          "empaddress": "New York"
        }
        ```

* `PUT /api/employees/{id}`
    * **Description:** Updates an existing employee by ID.
    * **Path Variable:** `{id}` - The ID of the employee to update.
    * **Request Body:** A JSON object with the new employee details.

* `DELETE /api/employees/{id}`
    * **Description:** Deletes an employee by ID.
    * **Path Variable:** `{id}` - The ID of the employee to delete.

---

## 🌐 Web Front-End

The project includes a simple web interface built with Thymeleaf that provides a user-friendly way to manage employees without using an API client.

### Endpoints and Functionality

* `GET /employees`
    * **Description:** Displays the main employee list page.
    * **Functionality:** Shows employee data in a table with pagination and column headers that allow for sorting. The default pagination is `5` employees per page.

* `POST /employees/add`
    * **Description:** Submits the form data from the front-end to create a new employee.
    * **Functionality:** Adds a new employee to the database and redirects back to the main employee list page, displaying a success message.

* `POST /employees/delete/{id}`
    * **Description:** Deletes an employee using a form-based request.
    * **Path Variable:** `{id}` - The ID of the employee to delete.
    * **Functionality:** Deletes the employee and redirects back to the main list page with a success message.

---

## 🗄️ Database Access

The application uses an in-memory H2 database. You can access the H2 console to view the database contents directly in your browser at:

### **`http://localhost:8080/h2db`**



H2 console- ✨

![WhatsApp Image 2025-08-27 at 10 16 44](https://github.com/user-attachments/assets/f8c41cb0-5364-4837-9df0-60e3a67c78cd)

![WhatsApp Image 2025-08-26 at 11 26 56](https://github.com/user-attachments/assets/a9248f54-0095-46b5-b473-ff558c232a2e)

![WhatsApp Image 2025-08-26 at 11 48 28](https://github.com/user-attachments/assets/7443559c-de5e-406b-b11a-a92eecc3895b)

![WhatsApp Image 2025-08-26 at 11 48 29](https://github.com/user-attachments/assets/cf9f0acd-b593-47fb-8078-e6862bd7d3e5)

![WhatsApp Image 2025-08-26 at 11 48 29 (1)](https://github.com/user-attachments/assets/cf8267db-d6d6-487b-b627-2d279877fbac)



SWAGGER- API Checking- ✨

![WhatsApp Image 2025-08-26 at 12 08 14](https://github.com/user-attachments/assets/f5390fd6-0bec-41a5-97d9-4ff1c174a058)

![WhatsApp Image 2025-08-26 at 12 31 24](https://github.com/user-attachments/assets/09036344-fe25-41c9-96d9-a6a59058706a)

![WhatsApp Image 2025-08-26 at 12 26 33](https://github.com/user-attachments/assets/ebe67e9c-851c-4d0f-baf4-fcc458f49ed2)

![WhatsApp Image 2025-08-26 at 12 26 34](https://github.com/user-attachments/assets/64a740dd-ac97-4772-90dc-bf64992c1b23)

![WhatsApp Image 2025-08-26 at 12 26 34 (1)](https://github.com/user-attachments/assets/4495c784-71dc-46c2-8e16-87fe37088219)

![WhatsApp Image 2025-08-26 at 12 26 35](https://github.com/user-attachments/assets/e27567d4-149b-412d-9b28-90ff4862be42)

![WhatsApp Image 2025-08-26 at 12 26 37](https://github.com/user-attachments/assets/624533d6-114a-48f1-b80b-5dc022d303d3)

![WhatsApp Image 2025-08-26 at 12 26 37 (1)](https://github.com/user-attachments/assets/b01990d2-b395-4aa7-90b9-733d6af07442)

![WhatsApp Image 2025-08-26 at 12 28 53](https://github.com/user-attachments/assets/343a07ca-5505-403f-a94d-8cdfe659c878)

![WhatsApp Image 2025-08-26 at 12 28 54](https://github.com/user-attachments/assets/1e1ce942-34ee-4218-adbc-f1fa2ab64479)

![WhatsApp Image 2025-08-26 at 12 29 42](https://github.com/user-attachments/assets/c3c9b26d-4325-44a4-b570-92de81c1e1de)

![WhatsApp Image 2025-08-26 at 12 29 42 (1)](https://github.com/user-attachments/assets/e3f6f306-af50-4a57-bf5b-494e2ebe37b4)


FRONTEND-✨


![WhatsApp Image 2025-08-26 at 22 56 29 (1)](https://github.com/user-attachments/assets/c27f09b9-7303-42f1-a617-fbb48db394b4)

![WhatsApp Image 2025-08-26 at 22 56 29](https://github.com/user-attachments/assets/31f9cdaa-9a1c-454d-823f-f9345dc84e2d)

![WhatsApp Image 2025-08-26 at 22 56 30 (1)](https://github.com/user-attachments/assets/9b8cb5df-0b98-4a4d-acdb-86730a9489d5)

![WhatsApp Image 2025-08-26 at 22 56 30](https://github.com/user-attachments/assets/8914cd33-b189-4f46-b0c0-fec6b03403b2)

![WhatsApp Image 2025-08-26 at 22 56 31](https://github.com/user-attachments/assets/7cc53611-680d-4735-b058-1cbbf98ca958)





















