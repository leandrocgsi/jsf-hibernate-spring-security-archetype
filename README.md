# JSF Hibernate Spring Security Archetype


Este é um Maven Archetype que lhe possibilita criar uma aplicação JSF com Hibernate, JPA e SpringSecurity em minutos. O projeto gerado já terá 2 CRUDS básicos, prontos, para que você possa se basear para botar a mão na massa de imediato. A aplicação é protegida pelo SpringSecurity, desse modo sua aplicação já estará pronta para autenticar e autorizar seus usuários. Este Archetype foi desenvolvido baseado no projeto [Semeru JSF Maven](https://github.com/leandrocgsi/semeru_jsf_maven). Então mãos a obra vamos aprender como usar esse poderoso recurso. 

# Para entender um pouco mais

Se você quer entender direito como funciona essa arquitetura assista ao curso "Curso De JSF Do Zero À Nuvem" disponibilizado gratuitamente no [Youtube](https://www.youtube.com/playlist?list=PL18bbNo7xuh9d1AyAeC77O8xRz6hPD3iJ).

Além disso você poderá se aprofundar, um pouco mais, em conceitos teóricos nos seguintes posts.

* [Iniciando Se No JSF – 01 – Apresentação, O Projeto E As Tecnologias](http://www.semeru.com.br/blog/iniciando-se-no-jsf-01-apresentacao-o-projeto-e-as-tecnologias/)
* [Iniciando Se No JSF – 02 – Configurando O Ambiente E Criando O Primeiro Projeto](http://www.semeru.com.br/blog/iniciando-se-no-jsf-02-configurando-o-ambiente-e-criando-o-primeiro-projeto/)
* [Iniciando Se No JSF – 03 – A Arquitetura Da Aplicação](http://www.semeru.com.br/blog/iniciando-se-no-jsf-03-a-arquitetura-da-aplicacao/)

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


# Como usar este Archetype?

Primeiro você precisa clonar esse projeto no seu computador. Para isso abra o terminal no diretório em que deseja armazenar o código e execute o comando abaixo.

```
git clone https://github.com/leandrocgsi/jsf-hibernate-spring-security-archetype.git
```

Abra a source folder gerado. Ele deverá se parecer com a imagem abaixo.

![OpenFolder](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/1-OpenFolder.png?raw=true)

Abra o terminal nessa pasta e execute o seguinte comando.

```
mvn clean install
```
Ele deve se parecer com a imagem abaixo

![CleanInstall](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/2-CleanInstall.png?raw=true)

Agora vá até o diretorio em que deseja criar o seu projeto e execute o seguinte comando.

```
mvn archetype:generate -DarchetypeGroupId=br.com.semeru \
  -DarchetypeArtifactId=jsf-hibernate-spring-security-archetype \
  -DarchetypeVersion=0.1.0 \
  -DgroupId=br.com.erudio \
  -DartifactId=erudio-jsf-maven \
  -Dversion=1.0-SNAPSHOT \
  -Dpackage=br.com.erudio
    
```
Onde você deve ajustar os parâmetros *DgroupId* para seu group ID, *DartifactId* para o nome do seu projeto, *Dversion* para o numero de versão desejado, *Dpackage* para sua base de pacotes. 

Ele deve se parecer com a imagem abaixo.

![GenerateProject](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/3-GenerateProject.png?raw=true)

O Maven irá lhe perguntar se você deseja alterar a versão do seu projeto e a estrutura de pacotes como está destacado na imagem abaixo. Se você não quiser alterar nada apenas digite Enter >> Enter. Se tudo tiver corrido bem você deverá ver uma imagem similar à que se segue e isso significa que o seu projeto foi criado com sucesso ;-)

![Building1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/4-Building.png?raw=true)

Agora só precisamos importar nosso projeto na nossa IDE favorita (STS - Spring Suource Tool Suite, baseada no Eclipse, no meu caso). Acesse o menu File >> Import >> Maven >> Existing Maven Projects >> Next.

![Importing1](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/9-Importing.png?raw=true)

Como na imagem abaixo digite ou navegue até o diretório onde se encontra o seu código e clique em Browse >> Finish.

![Importing2](https://github.com/leandrocgsi/erudio-rest-api-archetype/blob/master/img/10-Importing.png?raw=true)

Agora que tudo está pronto basta codar a nossa aplicação. Caso não saiba como executar o projeto [clique aqui](https://github.com/leandrocgsi/semeru_jsf_maven) e siga o passo a passo.


# [Série de Video Aulas em Português explicando passo a passo como funcionam os Archetypes do Maven](https://www.youtube.com/playlist?list=PL18bbNo7xuh-uIfKSuwAUaG4PWw832YVx)

01 Montando Um Archetype Maven Apresentação
-----------------------------

[![01 Montando Um Archetype Maven](http://img.youtube.com/vi/wzdkHpMpkQE/0.jpg)](https://www.youtube.com/watch?v=wzdkHpMpkQE-Y "01 Montando Um Archetype Maven")

02 Montando Um Archetype Maven COMPACTO
-----------------------------

[![02 Montando Um Archetype Maven COMPACTO](http://img.youtube.com/vi/aBHtHx6MI6c/0.jpg)](https://www.youtube.com/watch?v=aBHtHx6MI6c-Y "02 Montando Um Archetype Maven COMPACTO")

03 Montando Um Archetype Maven DETALHADO Parte 1
-----------------------------

[![03 Montando Um Archetype Maven DETALHADO Parte 1](http://img.youtube.com/vi/qpK8s_O_fwY/0.jpg)](https://www.youtube.com/watch?v=qpK8s_O_fwY-Y "01 Montando Um Archetype Maven DETALHADO Parte 1")

04 Montando Um Archetype Maven DETALHADO Parte 2
-----------------------------

[![04 Montando Um Archetype Maven DETALHADO Parte 2](http://img.youtube.com/vi/auZCBhNQQrc/0.jpg)](https://www.youtube.com/watch?v=auZCBhNQQrc-Y "02 Montando Um Archetype Maven DETALHADO Parte 2")

05 Montando Um Archetype Maven DETALHADO Parte 3
-----------------------------

[![05 Montando Um Archetype Maven DETALHADO Parte 3](http://img.youtube.com/vi/VG2f4NDRev0/0.jpg)](https://www.youtube.com/watch?v=VG2f4NDRev0-Y "03 Montando Um Archetype Maven DETALHADO Parte 3")
