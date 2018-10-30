# Simplechat

Simplechat is a chatroom application developed in order to explore the networking aspects of Java with platform-independent states. This is part of coursework to explore the use of middleware for network applications so it does not use sockets for its implementation.

# Features
This chat application has a server and a client component.

## Server features 
The server-side code has the ability to create chatrooms, list all existing rooms, join existing rooms, send messages to rooms, and leave a room

Once created chat-rooms store all messages sent to the room as long as they exist. If a chat-room has not been used for more than 7 days, it should be destroyed. The server supports up to 10 concurrent clients.

## Client features 
The Java chat client has an interface that enables a user to 
* create a room,
* list the existing rooms,
* join one or more existing chatrooms
* send messages to rooms
* leave one or more rooms

If the user connects to a chatroom all previously sent messages of that room should be displayed. New messages sent by the user or other connected users is shown to the user with a maximum delay of 1.5 seconds.

### Tech

Simplechat uses the following technologies and open source projects to work properly:
* [Java] - duh

# Installation
Installation details for both use and development are outlined on the wiki.  

### Testing environment
This project contains tests and is planned to be developed using TDD. The code for testing is still under development, but I'll update this space with instructions on how to do testing when it's all done.

### Todos

 - Write lots of tests
 - Finish this before Tuesday
 - Party hard
 - Integrate Travis CI for testing and automatic build integration

License
----

MIT

**Free Software, Hell Yeah!**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [MySQL]: <https://www.mysql.com/>
   [Apache]: <https://httpd.apache.org/download.cgi>
