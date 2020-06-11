#Stock Feeds
    This api is to get feed for the stock
    You can fetch the update of all stock or individual stock by supplying the symbol

## How to start application
    Applicaton can be started using below steps
    1. nevigate to the project folder 
    2. mvn clean install (pre-requisites maven should be installed)
    3. java -jar ./target/stockfeeds-0.0.1-SNAPSHOT.jar 
    it will start up the server on localhost 8080
    
## API URL's
    http://localhost:8080/api/v1/stock/allupdates 
    http://localhost:8080/api/v1/stock/U11:SGX
  