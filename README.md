# Employee Management System

A simple Employee Management System built using Java. This system allows you to add, view, update, and remove employee details through a console-based interface.

## Features

- **Add Employee:** Add new employee details and store them in a text file.
- **View Employee:** Retrieve and display details of an employee using their ID.
- **Update Employee:** Update specific details of an existing employee.
- **Remove Employee:** Remove an employee's details from the system.
- **Exit System:** Exit the Employee Management System.

## Project Structure

The project is organized into different classes, each handling specific functionalities:

- **MainMenu:** Displays the main menu of the system.
- **Employee_Add:** Handles adding new employees.
- **EmployDetail:** Collects and stores employee details.
- **Employee_Show:** Handles displaying employee details.
- **Employee_Remove:** Handles removing an employee's details.
- **Employee_Update:** Handles updating an employee's details.
- **CodeExit:** Handles exiting the system.
- **EmployManagementSystem:** Contains the main method and the primary logic for navigating the menu.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- A Java IDE or a text editor

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/rujuldwivedi/Employee-Management-System.git
    ```

2. Navigate to the project directory:
    ```sh
    cd Employee-Management-System
    ```

### Usage

1. **Compile the Java files:**
    ```sh
    javac *.java
    ```

2. **Run the application:**
    ```sh
    java EmployManagementSystem
    ```

## How to Use

1. **Add Employee:**
    - Select option `1` from the menu.
    - Enter the employee's details as prompted.

2. **View Employee:**
    - Select option `2` from the menu.
    - Enter the employee's ID to view their details.

3. **Update Employee:**
    - Select option `4` from the menu.
    - Enter the employee's ID.
    - Enter the detail to be updated and the new value.

4. **Remove Employee:**
    - Select option `3` from the menu.
    - Enter the employee's ID to remove their details.

5. **Exit System:**
    - Select option `5` to exit the system.

## Acknowledgements

- Inspired by the need for simple employee management.
- Created using Java for a console-based user interface.
- Feel free to reach out if you have any questions or suggestions!

Happy coding!
