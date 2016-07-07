#### Code zum Vortrag "Skalieren mit Spring Boot und Docker" vom Java Forum Stuttgart 2016

Voraussetzung um den Code aus zu probieren sind folgende Programme
- Docker (>= 1.11)
- Docker Compose (>= 1.6)
- Maven (>= 3)

1. Schritt:
git clone
2. Schritt:
In das Basis Verzeichnis wechseln (dort liegt das Aggregate pom). Dort mit `mvn clean package` das Projekt bauen.
3. Schritt:
In das Verzeichnis "docker" wechseln und die Infrastruktur mit `docker-compose up` oder `docker-compose up -d` starten.
4. Schritt:
Nach ca. einer Minute sollten alle Services auf [http://localhost:8761](http://localhost:8761) zu sehen sein. 
5. Schritt:
Service mit `curl http://localhost/servicea/hello` aufrufen (ggf. zweimal bei Fehlermeldung)
6. Schritt:
Skalieren über `docker-compose scale service-a=2 service-b=4` (oder in zwei getrennten Befehlen)
7. Schritt:
Service mit  `watch -n1 curl http://localhost/servicea/hello` aufrufen.
