# Proxy Method - A design pattern odyssey <img align="left" src="https://media.giphy.com/media/ZEUODEtQiUZWGg6IHR/giphy.gif" width="40"/>

Proxy is a structural design pattern that allows you to provide a substitute or placeholder for another object. A proxy controls access to the 
original object, allowing you to do something either before or after the request reaches the original object.

### The proxy structure:
The Proxy standard suggests that you create a new proxy class with the same interface as the original service object. 
Then you update your application so that it passes the proxy object to all clients of the original object. Upon receiving a request from a client, 
the proxy creates an actual service object and delegates all the work to it.

![Proxy Method_diagram](https://raw.github.com/MisaelKelviny/ProxyDesignPattern_Eng4/main/proxy.JPG)

### Advantages:
- You can control the service object without customers knowing it.
- You can manage the service object's lifecycle when customers don't care.
- The proxy works even if the service object is not ready or is not available.
- Open / Closed Principle. You can introduce new proxies without changing the service or customers.

### This Project
- Was created two folders one wihout using the design pattern proxy method, and the another with it. 
