# JSF Hibernate Spring Security Archetype


Este é um Maven Archetype que lhe possibilita criar uma aplicação JSF com Hibernate, JPA e SpringSecurity em minutos. O projeto gerado já terá 2 CRUDS básicos para que lhe seja possível botar a mão na massa de imediato. A aplicação é protegida pelo SpringSecurity, desse modo sua aplicação já estará pronta para autenticar e autorizar seus usuários. Este Archetype foi desenvolvido baseado no projeto [Semeru JSF Maven](https://github.com/leandrocgsi/semeru_jsf_maven). Então mãos a obra vamos aprender como usar esse poderoso recurso. 

Se você quer entender direito como funciona essa arquitetura assista ao curso "Curso De JSF Do Zero À Nuvem" disponibilizado gratuitamente no [Youtube](https://www.youtube.com/playlist?list=PL18bbNo7xuh9d1AyAeC77O8xRz6hPD3iJ).

# Frameworks e Tecnologias Utilizadas

* [JSF (Mojarra)](https://javaserverfaces.java.net/)
* [Primefaces](http://www.primefaces.org/)
* [JPA](http://www.oracle.com/technetwork/java/javaee/tech/persistence-jsp-140049.html)
* [Hibernate](http://hibernate.org/)
* [Maven](https://maven.apache.org/)
* [Spring Security](http://projects.spring.io/spring-security/)
* [MySQL](https://www.mysql.com/)
* [MySQL Administrator](https://downloads.mysql.com/archives/administrator/) - Que foi descontinuado e você pode substituir pelo [Heidi SQL](http://www.heidisql.com/)
* [Apache Tomcat](http://tomcat.apache.org/)


# How to use this Archetype?

First you need clone this project in your computer. This can be done with following command line.

```
git clone https://github.com/leandrocgsi/erudio-rest-api-archetype.git
```

Open the generated source folder, that can be should look like the image below.

![OpenFolder](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/1-OpenFolder.png?raw=true)

Execute following comand line in your folder.

```
mvn clean install
```
It's can be should look like the image below.

![CleanInstall](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/2-CleanInstall.png?raw=true)

Now go to the directory where you want to create your project and run the command below.


```
mvn archetype:generate -DarchetypeGroupId=br.com.semeru
	-DarchetypeArtifactId=jsf-hibernate-spring-security-archetype
	-DarchetypeVersion=0.1.0
	-DgroupId=br.com.erudio
	-DartifactId=erudio-jsf-maven
```

It's can be should look like the image below.

![GenerateProject](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/3-GenerateProject.png?raw=true)

Maven ask if you need change version of your project and your package base as is highlighted in red in the image below. If you dont want any change just type Enter Enter. If everything is gonna be OK you should see one image similar to following. Your project was created with success ;-)

![Building1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/4-Building.png?raw=true)

Now we just import our project in favorite IDE (Eclipse in this example). Go to menu File >> Import >> Maven >> Existing Maven Projects >> Next.

![Importing1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/9-Importing.png?raw=true)

As on image bellow type your Root Directory (where we found your code) and click in Browse >> Finish.

![Importing2](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/10-Importing.png?raw=true)

Probably you see the following errors, dont be worry just click in Finish again.

![Importing3](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/11-Importing.png?raw=true)

Now we dont see our Groovy code this is because these code is out of default Maven lifecycle. To fix this we just need click with right button over our project and select New >> Source Folder.

![CreatingSourceFolders1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/12-CreatingSourceFolders.png?raw=true)

In next window in Folder Name type *src/main/groovy*, repeat this proccess with *src/test/groovy* and *src/test_components/java*

![CreatingSourceFolders2](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/13-CreatingSourceFolders-CreatingSourceFolders.png?raw=true)

Now we have one structure similar to image bellow. As you can see, on *Markers tab*, we have some erros but dont be worry just click with right button and delete they.

![Final](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/14-Final.png?raw=true)

Now to execute your project [click here](https://github.com/leandrocgsi/semeru_jsf_maven)and follow the steps.
