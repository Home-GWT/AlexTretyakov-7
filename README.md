Ускоряем GWT-компиляцию
-----------------------
* `hellogwt-4 - Alex Tretyakov Blog`: [http://alextretyakov.blogspot.com/2011/11/gwt.html](http://alextretyakov.blogspot.com/2011/11/gwt.html)
* `hellogwt-4 - Revision 9: /trunk`: [http://hellogwt-4.googlecode.com/svn/trunk/](http://hellogwt-4.googlecode.com/svn/trunk/)
> В процессе написания приложения будут использоваться:
>
>- Spring 3.0.5
>- GWT 2.4.0
>- Maven 3.0.3
>- Tomcat 6.0.33 ([http://localhost:8080/hellogwt/](http://localhost:8080/hellogwt/))
>- MyBatis 3.0.5
>- MySQL 5.1 ([jdbc:mysql://localhost:3306/hellogwt](jdbc:mysql://localhost:3306/hellogwt))

>При разработке GWT-приложений сталкиваешься с тем, что они довольно долго компилируются.
>Для примера, соберём это небольшое приложение с помощью команды **mvn clean install**:
>время сборки **42.809 секунды** - а ведь приложение содержит всего несколько сервисов и один основной класс *AppHello*

>Попробуем уменьшить время компиляции:
>
>1. Лучше использовать конкретные типы (ArrayList) вместо интерфейсов (List) в аргументах и возвращаемых значениях GWT RPC сервисов. Иначе будет производится избыточная компиляция для всех классов, реализующих интерфейс (List). Класс HelloGWT содержит метод refreshGreetingTable(), который использует интерфейс List
>2. Можно отключить оптимизацию кода при компиляции приложения с помощью параметра "draftCompile". Выполним команду **mvn clean install -Dgwt.draftCompile=true**: время сборки **36 секунд**
>3. По умолчанию приложение компилируется для всех поддерживаемых типов браузеров. Установим, чтобы оно компилировалось только для одного. Это настраивается с помощью свойства "user.agent" в файле *HelloGWT.gwt.xml*: время сборки **27 секунд**
>
>Это на **36%** меньше - ощутимая разница!

![result.png](result.png)
