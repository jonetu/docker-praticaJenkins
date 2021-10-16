FROM openjdk:11
RUN mkdir /app
COPY src/App.java /app
WORKDIR /app
CMD ["java","App.java"]
 
