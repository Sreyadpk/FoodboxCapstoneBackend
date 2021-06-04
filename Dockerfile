FROM tomcat:8.0

MAINTAINER Sreya Sasindran <sreya.92@gmail.com>

# COPY {path-to-your-application-war} {path-to-webapps-in-docker-tomcat}  

COPY /target/project-food-box.war /usr/local/tomcat/webapps/