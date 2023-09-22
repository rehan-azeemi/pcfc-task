# PCFC Application

#### Requirements

- Complete the below task and share the github link for the same for review.

- Develop a Spring MVC application with JPA, Tiles, JSP and H2 database
- Two menus
    - Add employee
    - Employee listing
- It needs to have a form to add an employee with the below fields
    - First name - required
    - last name - required
    - DOB - required
    - Departments - (fixed drop down) - required
    - Salary - required
    - Manager dropdown - optional field (link to the same table - primary key) - optional
- Create a db table with the fields
- Added employees to be shown in the next page in a grid - links to edit and view employee

#### Description

In order to complete the task i have created __EmployeeController__ to serve all the request coming from jsp pages.
EmployeeController is communicating with __EmployeeService__ to perform business operations. Repositories for both __Employee__ and __Department__ is created for database interaction.
__Controller Advice__ is used to handle common exceptions. Common __JSP__ pages is created using
__Tiles__. For UI/UX i have used __Bootstrap 4__. Some of the images i have copied from PCFC website for look and feel.

#### Note:
__I have attached Video PPT as well for Demo. PCFC Task Video PPT__

#### Technology Used
- Java 17
- Springboot MVC 2.7.1
- JSP
- Bootstrap 4
- Maven
- Tiles
- JPA
- H2

#### Build and Run
- mvn clean install
- mvn spring-boot:run

#### Assumption
- All validations are not added. Those can be added on demand