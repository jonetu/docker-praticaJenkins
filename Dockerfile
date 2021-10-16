FROM openjdk:11
RUN mkdir /app
CMD ["pwd"]
COPY src/App.java /app
WORKDIR /app
CMD ["java","App.java"]
 
