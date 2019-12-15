### SpringBoot Application ready to be deployed on Heroku hosting

as a basis of our application we gonna take minimal spring-data application with one endpoint and database `step21` from `spring-steps` repository.

### Whole process overview

- creating personal account on heroku.com
- creating personal SSH-keys and uploading them to heroku.com
- downloading and installing their command line tool `Heroku CLI`
- creating heroku application
- making some changes in our project (extra files, configuration, etc)
- adding one more git upstream
- pushing source code to heroku upstream added in previous step 
- starting enjoying working app in the browser. :) 

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
- go to browser and check: `http://localhost:5000/person`. Everything should work.
- commit everything `git commit -m "--final stage"`
- push to github/gitlab: `git push origin master`
- push to heroku: `git push heroku master`.
- test link provided by `heroku` previously on app creation step: `https://mysterious-refuge-92638.herokuapp.com` with browser and `Postman`
- don't forget about your mappings: `/person`, etc, add them if need `https://mysterious-refuge-92638.herokuapp.com/person`
- relax
- enjoy

### Links
- [Heroku](https://www.heroku.com)
- Heroku official [link](https://devcenter.heroku.com/articles/getting-started-with-java) about Java deployment
- Heroku official [link](https://github.com/heroku/java-getting-started) minimal configuration which can be deployed
- [alexr github link](https://github.com/alexr007)
