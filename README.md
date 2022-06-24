[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

[![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/com/)
![image](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![image](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)

[![image](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/)
[![image](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![image](https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)

# Portify
Portfolio-maker made for the @MLH Orientation Hackaton

**Features:**

⚡️ one page layout

⚡️ simple and modern UI design

⚡️ fully responsive 

**Why have we created Portify?**
- everyone needs a web portflio
- it showcases your work visually
- our web page ensures highest level of simplicity (no need to register)

**Technologies used for the frontend:**

 🛠️ Java
 
 🛠️ Java Spring Boot
 
 🛠️ HTML5
 
 🛠️ CSS
 
 🛠️ JavaScript
 
 
**Technologies used for the backend:**

 🛠️ Java
 
 🛠️ Spring Data
 
 🛠️ Java Persistence API
 
 🛠️ MySQL

**How to use:**

First of all clone the repo:

```bash
git clone git@github.com:LorenzoDrudi/Portify.git
```
Now you have to do a few steps:

-Create the db with the [sql script](database/createDB.sql);

-Use your DB credentials [here](src/main/resources/application.properties).

You can then run it on linux or mac-os with:

```bash
cd Portify
./gradlew bootRun
```

If you are on Windows you can use:

```ps
cd Portify
gradlew.bat bootRun
```
You can also use an IDE such as IntelliJ or Eclipse to do that.

Once you've done that open you're browser and:

- To insert a user type:
```ps
http://localhost:8080/createpage
```

- To see a user page type:
```ps
http://localhost:8080/page?name={insert here the name of the user}
```
- To see a random user page:
```ps
http://localhost:8080/page
```

**Authors:**

[Celina Cywinska](https://github.com/cellinacywinska)

[Lorenzo Drudi](https://github.com/LorenzoDrudi)
