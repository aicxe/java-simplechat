# Simplechat









<h1 align="center">Simplechat</h1>

<div align="center">
  <strong>Fun & functional little chat server</strong>
</div>
<div align="center">
  A simple chat application that can connect up to 10 clients
</div>

<br />
<div align="center">
  <!-- Build Status -->
  <a href="https://travis-ci.com/UniversityOfSaskatchewanCMPT371/term-project-team-1">
    <img src="https://img.shields.io/travis/com/UniversityOfSaskatchewanCMPT371/term-project-team-1/ID3Testing.svg"
      alt="Build Status" />
  </a>
  <!-- Test Coverage -->
  <a href="https://coveralls.io/github/UniversityOfSaskatchewanCMPT371/term-project-team-1?branch=ID3Testing">
    <img src="https://img.shields.io/coveralls/github/UniversityOfSaskatchewanCMPT371/term-project-team-1/ID3Testing.svg"
      alt="Test Coverage" />
  </a>
  <!-- Stars -->
  <a href="https://github.com/UniversityOfSaskatchewanCMPT371/term-project-team-1/stargazers">
    <img src="https://img.shields.io/github/stars/UniversityOfSaskatchewanCMPT371/term-project-team-1.svg"
      alt="Stars" />
  </a>
  <!-- Issues -->
  <a href="https://github.com/UniversityOfSaskatchewanCMPT371/term-project-team-1/issues">
    <img src="https://img.shields.io/github/issues/UniversityOfSaskatchewanCMPT371/term-project-team-1.svg"
      alt="Issues" />
  </a>
  <!-- License -->
  <a href="https://github.com/UniversityOfSaskatchewanCMPT371/term-project-team-1/blob/master/LICENSE">
    <img src="https://img.shields.io/github/license/UniversityOfSaskatchewanCMPT371/term-project-team-1.svg"
      alt="Stars" />
  </a>
</div>

## Overview
Simplechat is a chatroom application developed in order to explore the networking aspects of Java with platform-independent states. This is part of coursework to explore the use of middleware for network applications so it does not use sockets for its implementation.

  - Just scan your practitioner's QR code from their ID
  - You'll be able to add their card to your healthcare deck
  - Magic

### Features
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

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
HealthDeck requires these tools for development:

- Node > 7 and npm (Recommended: Use [nvm](https://github.com/creationix/nvm))
- Watchman `brew install watchman`
- React Native CLI `npm install -g react-native-cli`
- XCode > 9
- [JDK > 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Android Studio and Android SDK](https://developer.android.com/studio/index.html)

### Installation

- Clone the repo to a local directory:  
`git clone https://github.com/UniversityOfSaskatchewanCMPT371/term-project-team-1.git healthdeck`
- Go to your project's root folder and run `npm install`.
- blah blah gradle
- Create a `.env` file to store all your configuration constants. Remember to not commit this file, since it can store sensible information of your product.
- Run `react-native run-ios` or `react-native run-android` to start the application!


## Running the tests

This project contains tests and is planned to be developed using TDD. The code for testing is still under development, but I'll update this space with instructions on how to do testing when it's all done.

[//]: # (
### Coverage Testing

This space reserved for coverage testing procedures

```
Example test suite
```

### Coding style tests

Explanation what these tests test and why

```
Give an example
```
### Smoke Testing

Blurb about smoke tests here

```
More examples
```
)


## Built With
Simplechat uses the following technologies and open source projects to work properly:

* [Java] [Jest] and [Enzyme] - for testing 
* [Firebase] - for database access
* [React Native] - duh

## Versioning
[SemVer](http://semver.org/) is used for versioning. Development is in its early stages, so stay tuned for future releases!

## Author
* **Jay Pineda** - *Pretty much everything*

I can be contacted on the following link: [Pineda]

## License

This project is licensed under the MIT License - see the [LICENSE.md](../LICENSE.md) file for details

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [Jest]: <https://jestjs.io/>
   [Enzyme]: <https://github.com/airbnb/enzyme>
   [Firebase]: <https://firebase.google.com/>
   [React Native]: <https://facebook.github.io/react-native/>

   [Pineda]: <mailto:jay.p@usask.ca>

















# Features


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
