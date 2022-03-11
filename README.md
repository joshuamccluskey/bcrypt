# bcrypt

### Contributor: Joshua McCluskey

### Implementation

The root file path to run and build is bcrypt/

Links to files:
[BCryptApplication](src/main/java/com/joshuamccluskey/bcrypt/BcryptApplication.java)
[MainPageController](src/main/java/com/joshuamccluskey/bcrypt/controller/MainPageController.java)
[UserController](src/main/java/com/joshuamccluskey/bcrypt/controller/UserController.java)
[AccessUser](src/main/java/com/joshuamccluskey/bcrypt/model/AccessUser.java)
[AcessUserRepsoitiry](src/main/java/com/joshuamccluskey/bcrypt/repository/AccessUserRepository.java)

Linksd to templates and CSS:
[style](src/main/resources/static/css/style.css)
[index](src/main/resources/templates/index.html)
[login](src/main/resources/templates/login.html)
[signup](src/main/resources/templates/signup.html)

### Overview:

Create a server to protect a secret recipe by requiring users to sign up for an account and log in.

- Create a database.
- Create a table that models users with a username, id, and hashed password.
- Create a table that models posts with a postId, userId and text content.
- Create a table with a 1-to-many relationship between users and posts.
- Authenticate the site so only logged-in users can see posts.
- Use Bcrypt to hash all passwords stored on the site.

#### Stretch Goals

- Add login / logout functionality using server sessions.

### Methods:

- getLoginPageToLogin() : gets path to login

- loginUsernameAndPassword() : heart of app to validate and login username and password

- getSignUpFormForAcccountCreation() : gets path to  signup form 

- createAccountToAccessSite() : Posts to create account saves user info in Postgres database

- getManinPageForUser() : get main page with a welcome message to user

- AccessUser findByUsername(String username) - repository method to findUserName

Work Time: 3 hours

### Refactor 03/11/2022

- Fixed bugs and in order to persist user data  in database
- Updated README with implementation instructions and links to each file for grading

Work TIme : 1 hour


