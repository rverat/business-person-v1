# Alpine Linux with OpenJDK JRE
FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /opt/app
ARG JAR_FILE=business-person-v1-1.0-SNAPSHOT.jar

# Copy war file
COPY ${JAR_FILE} business-person-v1.jar

# run the app
ENTRYPOINT ["java", "-jar", "business-person-v1.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]
#------------------------------------------------------------------------------


