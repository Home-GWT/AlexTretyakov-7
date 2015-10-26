Разрабатываем приложение на Spring и GWT. Часть 4 - MyBatis и MySQL
-------------------------------------------------------------------
* `hellogwt-4 - Alex Tretyakov Blog`: [http://alextretyakov.blogspot.com/2011/11/spring-gwt-4-mybatis-mysql.html](http://alextretyakov.blogspot.com/2011/11/spring-gwt-4-mybatis-mysql.html)
* `hellogwt-4 - Revision 9: /trunk`: [http://hellogwt-4.googlecode.com/svn/trunk/](http://hellogwt-4.googlecode.com/svn/trunk/)
> В процессе написания приложения будут использоваться:
>
>- Spring 3.0.5
>- GWT 2.4.0
>- Maven 3.0.3
>- Tomcat 6.0.33 ([http://localhost:8080/hellogwt/](http://localhost:8080/hellogwt/))

>Работа с базой данных с помощью:
>
>- MyBatis 3.0.5
>- MySQL 5.1
>
>По задумке наше приложение позволит пользователю просматривать и редактировать различные приветствия. Каждое приветствие имеет автора и, собственно, текст приветствия.
>
>Создадим с помощью MySQL базу данных и таблицу, в которой будут храниться наши приветствия. Выполним следующие SQL-команды:

>**CREATE DATABASE hellogwt;**
>
>**USE hellogwt;**
>
>**CREATE TABLE greetings (**
>**id INT NOT NULL AUTO_INCREMENT,**
>**author VARCHAR(30),**
>**text VARCHAR(50),**
>**PRIMARY KEY (id)**
>**);**


![result.png](result.png)
