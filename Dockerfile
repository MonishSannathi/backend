#Java install
#Expose 8080
FROM openjdk:11
EXPOSE 8080
ADD /target/springbootbackend.jar springbootbackend.jar
ENTRYPOINT ["java","-jar","/springbootbackend.jar"]