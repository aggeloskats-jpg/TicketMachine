FROM eclipse-temurin:27-jdk-alpine AS build

WORKDIR /app

COPY src/ /app/src 

RUN mkdir -p out && javac -d out src/*.java

FROM eclipse-temurin:27-jre-alpine

WORKDIR /app

COPY --from=build /app/out/ ./

ENTRYPOINT ["java", "TicketMachineMain"]

