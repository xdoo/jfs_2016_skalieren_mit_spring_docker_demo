FROM java:8

# executable
ADD @project.artifactId@-@project.version@.jar app.jar

# run app
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Xmx256m", "-Xss32m", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]