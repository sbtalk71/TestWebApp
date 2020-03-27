FROM tomcat
ADD TestWebApp.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh","run"]