### Instructions for building Docker image dependency for the SpringAndHibernatApplicationMySQL App
After cloning this Githu repo, starting from the directory where this README is located

Build docker image and run docker image via the commands below

1. cd input
1. docker build -t mysqldb .
1. docker run -d -p 3306:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=admin mysqldb
 
