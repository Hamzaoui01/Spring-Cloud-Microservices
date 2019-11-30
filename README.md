# Spring-Cloud-Microservices
## Descreption
This  Project contains 4 Micro-services :

### Company-service
it's a simple Web Service provide an RESTfull Api, to manage the companies.

### Configuration Service
It's for centralize the configuration and provi it to diffrents instances of company-service before they finish starting.

### Registration Service 
Create a derectory with eurika dependency to store the importat informations about each Web service lunched ( instances of Company-Service in my case)
and provide this information to the proxy.

### Proxy Service
It's the pricipal MicroSercvice and it take the http requestes and divide them to the MicroServices listed in Registration service.

