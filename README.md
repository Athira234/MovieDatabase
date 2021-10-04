# MovieDB
This is the SPRING-MVC MovieDB Project.


STEPS TO DEPLOY:

1. Place the WAR file into the deploy folder.

2. Run docker-compose up --build -d (note: mysql server should not be running on port 3306, shut it down before deploying as the 3306 is also used by the mysql container specified in the dyaml file)

3. Using mysql workbench, create a connection to mysql container by providing credentials username= root , password=moviedb ,port =3306.

4. Import DDL & DML from dbscripts folder into moviedb schema.

5. Go to browser, hit localhost:5558/manager.

6. Click on moviedbapp resource

7. The moviedbapp is deployed.


TESTING:

1. using postman,hit routes
 - http://localhost:5558/moviedbapp/users/1/profile
 - http://localhost:5558/moviedbapp/users/1/watchlist
 - http://localhost:5558/moviedbapp/users/1/password
 - http://localhost:5558/moviedbapp/users/1/editprofile
 
2. Check all above routes using web browser.
