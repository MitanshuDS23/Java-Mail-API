## To Run the Application

### Prerequisites

* **Java 17** or newer
* **Apache Maven**
* A **Gmail Account** with an **App Password** enabled.

---

### Steps

1.  **Clone the repository:**
    Open your terminal and clone the project to your local machine.
    ```bash
    git clone [https://github.com/Mitanshu23DS/Java-mailer-API.git](https://github.com/Mitanshu23DS/Java-mailer-API.git)
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd Java-mailer-API
    ```

3.  **Configure your credentials:**
    You must create an `application.properties` file in the `src/main/resources` directory. Add the following content, replacing the placeholders with your actual credentials.

    ```properties
    # Server Port
    server.port=8080
    
    # Mail Server Properties for Gmail
    spring.mail.host=smtp.gmail.com
    spring.mail.port=587
    spring.mail.username=YOUR_GMAIL@gmail.com
    spring.mail.password=YOUR_16_CHARACTER_APP_PASSWORD
    
    # Enable STARTTLS for secure connection
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true
    ```
    > **Note:** The `password` must be the 16-character App Password you generate from your Google Account settings, not your regular password.

4.  **Run the application:**
    Use the Maven wrapper to build the project and start the server.
    ```bash
    mvn spring-boot:run
    ```

The application will now be running and accessible at `http://localhost:8080` ✅.
