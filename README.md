# CMS Galatea

A microservice that orbits around [CMS](https://github.com/cms-dev/cms) exposing
the Task and Contest core entities (alongside some embeded ones, like
statements, datasets and testcases) as [REST](https://en.wikipedia.org/wiki/Representational_state_transfer)
resources.

## Up and running

CMS Galatea can be deployed and run as a Docker container or a standalone java
application (a fat jar); either way is strongly recommend to run this
application as the former one.

### Prerequisites

CMS Galatea heavily relies on [CMS](https://github.com/cms-dev/cms) database, so
in order to have this application up and running you need:

1. CMS 1.3.x or greater DB schema (the current Galatea version was designed against the last CMS revision in Jan 2018)
2. CMS PostreSQL DB schema access (it could be the same crendentials that CMS uses but is not recommended)
3. Docker engine 17.x or greater

### Deployment

As long the prerequisites are met CMS Galatea can be run as easy as prompting

```shell
docker run -p 8080:8080 jossemargt/cmsgalatea
```

Have in mind that the application will run with the default configurations,
which may not suit for your environment and because of that you should take a
look into the **Configuration** section.

### Configuration

All the intrinsic configurations can be overriden as [Spring externalized
configurations](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)
which in the Docker container context boild down to environment variables. As
for example in order to override the `spring.datasource.url` value, you could
start the Docker container with the following syntax:

```shell
docker run -p 8080:8080 -e 'SPRING_DATASOURCE_URL=jdbc:postgresql://10.10.37.10:5432/cmsdb' jossemargt/cmsgalatea
```

Some of the properties of interest could be:

Property name | Default value | Description
--- | --- | ---
spring.datasource.username | cmsuser | JDBC + PostgreSQL datasource username
spring.datasource.password | notsecure | JDBC + PostgreSQL datasource password
spring.datasource.url | jdbc:postgresql://localhost:5432 | JDBC + PostgreSQL datasource URL
logging.file | | Logging file
logging.level.com.jossemargt.cmsgalatea | ERROR | Application logging level
logging.level.com.querydsl.jpa.impl.JPAQuery | ERROR |JPA query logging level
logging.level.org.hibernate.stat | ERROR | Hibernate stats logging level

## Development / Getting started

In order to start hacking with this project you need:

- [Git](https://git-scm.com/)
- [JDK 1.8+](http://www.oracle.com/technetwork/java/javase/downloads)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/community-edition)
- [PostgreSQL](https://www.postgresql.org/)
- [CMS 1.3.x or greater DB schema](https://github.com/cms-dev/cms/tree/d930038459287d5d9858c16ee94340d248c37130)
- [spring-roo](https://projects.spring.io/spring-roo/)

Then it is only matter of cloning the repository

```shell
git clone https://github.com/jossemarGT/cms-galatea.git galatea
cd galetea
```

Open the source code with your prefered text editor, hack and test/build the
results with maven:

```shell
mvn clean package
```

### Build and releases

All the git (remote) branches and pull requests on this repository are being
tracked by [Travis CI](https://travis-ci.org), each commit source code is test
and built, but only the git tags from master branch will be released as a Java
artifact (jar) and Docker image.

### Versioning

This project use [SemVer](http://semver.org/) for versioning. For the versions
available, see the [tags on this repository](https://github.com/jossemargt/cms-galatea/tags).

### Nuke and recreate the codebase with Spring Roo

The first CMS Galatea release was completely generated with [spring-roo](https://projects.spring.io/spring-roo/),
if for some reason you need to recreate the whole codebase from scratch, you
could use the `gen/init.roo` roo script.

## License

This project is licensed under the **MIT License** - see the [LICENSE.md](LICENSE)
file for details.
