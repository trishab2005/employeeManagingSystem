
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
````
