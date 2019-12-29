# Spring-Cloud-Microservices
## Descreption
This  Project contains 4 Micro-services :

### Company-service
it's a simple Web Service provide an RESTfull Api, to manage the companies.

### Configuration Service
It's for centralize the configuration and provide it to different instances of company-service before they finish starting.

### Registration Service 
this service Create a directory with eurika dependency to store the informations about each Web service lunched ( instances of Company-Service in my case)
and provide this informations to the proxy.

### Proxy Service
It's the pricipal MicroSercvice and it take the http requestes and divide them to the MicroServices listed in Registration service.
Permit also the load balancing.

## Architecture
![Arcchitecture](https://github.com/Hamzaoui01/Spring-Cloud-Microservices/blob/master/img/architecture.png?raw=true)

## Report
I've created a report in french contains all instructions to build this project:
[Open the report](https://drive.google.com/file/d/1IGfviC3yNwp6WuReJDb4aLqDRz0QXsVe/view?usp=sharing).
