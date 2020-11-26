## SpringBoot Application ready to be deployed on Heroku hosting

- based on the [project](https://github.com/alexr007/java-heroku)
- as a basis of our application we gonna take minimal spring-data application with one endpoint and database `step21` from [spring-steps](https://github.com/alexr007/spring-steps) repository.

### Whole process overview

- creating personal account on [Heroku](http://heroku.com)
- creating personal SSH-keys and uploading them to [Heroku](https://devcenter.heroku.com/articles/keys)
- downloading and installing their command line tool [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli#download-and-install) 
- creating heroku application `heroku create`
  => 1. app created: https://cryptic-cove-36231.herokuapp.com/
  => 2. git repository created: https://git.heroku.com/cryptic-cove-36231.git
     2.1. details: `git remote -v`
- making some changes in our project (extra files, configuration, etc)
- commit & push
    `git commit -m "..."`
    `git push origin master` (github)
    `git push heroku master` (heroku)
- starting enjoying working app in the browser. :) 

### Project requirements:

- `Procfile` in the root of the project with proper content
- `pom.xml`:
  - `artifactId` and `version` must conform `Procfile` contents
  - `Java version (8)`
  - plugin: `spring-boot-maven-plugin` (with properties)

### Some useful details: 

- to start our web server on remote machine, we must take into account that we should start our web server on another port number, which will be provided us via OS environment variable `PORT`. If variable isn't provided - we must start on port `5000`, see `application.properties` according to `server.port` section
- to log in to heroku, type in the terminal `heroku login`
- to create an app, type `heroku create`. As a result you will be given two links, something like that:
  ```
  https://mysterious-refuge-92638.herokuapp.com/
  https://git.heroku.com/mysterious-refuge-92638.git
  ```
- to check whether the new upstream is added, type: `git remote -v`. The output must look like:
  ```
  heroku  https://git.heroku.com/mysterious-refuge-92638.git (fetch)
  heroku  https://git.heroku.com/mysterious-refuge-92638.git (push)
  origin  https://github.com/alexr007/java-springboot-heroku.git (fetch)
  origin  https://github.com/alexr007/java-springboot-heroku.git (push)
  ```
- add/check `properties` section into `pom.xml`
- add/check `dependencies` section into `pom.xml`
- add/check `build` section into `pom.xml`
- build your app: `mvn install`. As a result in the folder `target` you must see file like `java-springboot-heroku-template-0.0.1-SNAPSHOT.jar`. It is named according `pom.xml` sections `<artifactId>` and `<version>` 
- add `Procfile` file to the root of the project with the contents of `web: java -jar target/java-springboot-heroku-template-0.0.1-SNAPSHOT.jar`. File must contain exactly one line.
- run your app locally `heroku local:start`
- go to browser and check: `http://localhost:5000/person`. Everything should work
- commit everything `git commit -m "--final stage"`
- push to github/gitlab: `git push origin master`
- push to heroku: `git push heroku master`
- test link provided by `heroku` previously on app creation step: `https://mysterious-refuge-92638.herokuapp.com` with browser and `Postman`
- don't forget about your mappings: `/person`, etc, add them if need `https://mysterious-refuge-92638.herokuapp.com/person`
- relax
- enjoy

### Links
- Heroku hosting company: [here](https://www.heroku.com)
- Heroku official documentation in general: [here](https://devcenter.heroku.com/articles/getting-started-with-java)
- Heroku official documentation about JDBC connection: [here](https://devcenter.heroku.com/articles/connecting-to-relational-databases-on-heroku-with-java)
- Heroku official github code: [here](https://github.com/heroku/java-getting-started)
- Baeldung link how to create runnable `jar` file: [here](https://www.baeldung.com/executable-jar-with-maven)
- alexr github account: [here](https://github.com/alexr007)
- alexr's onother heroku-project: [here](https://github.com/alexr007/java-heroku)
