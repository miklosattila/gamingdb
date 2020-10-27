# Spring boot + MySQL demo project

## Projekt struktúra:

### ADATBÁZIS KAPCSOLAT BEÁLLÍTÁSA:
src/main/resources/application.properties

Ebben a fileban lehet meghatározni a spring boot applikációnak a beállításait.

### FRONTEND HELYE
src/main/resources/static

Ebben a meppában létrehozott weboldalt fogja betölteni a rendszer.

### CONTROLER
src/main/java/ro/mutinystudio/demo/controller

Ebben a mappában hozzuk létre az internet fele nyitott API-kat. (GET, POST, PUT, DELETE, PATCH metódusokat)

### SERVICE
src/main/java/ro/mutinystudio/demo/service
src/main/java/ro/mutinystudio/demo/service/impl

Itt hozzuk létre az üzleti logikát, adatok manipulálását számításokat elvégző metódusokat.

### MODEL / DATA ACCESS OBJECTS - DAO
src/main/java/ro/mutinystudio/demo/model

Ezek az objektumok felelnek meg az adatbázis tábláknak!

### REPOSITORY / DATA TRANSFER OBJECTS - DTO
src/main/java/ro/mutinystudio/demo/repository

Ezek a fájlok felelnek az SQL lekérdezések, beszórások és módosítások megvalósításáért!

## Projekt indítása: 

A projektedet importold be az általad használt fejlesző környezetbe. Ajánlott az STS használata: Spring Tool Suite. 

Eclipsben a következő lépéseket kövesd:
- jobb click a projektre
- run as ->
	- maven build:
	- goals mezőbe írd be: clean install
	- run
- ha le futott a build akkor utánna ismét jobb click a projectre
- run as ->
	- spring boot app
	
A projekted eléred a böngészőben a http://localhost:8080 címen!


