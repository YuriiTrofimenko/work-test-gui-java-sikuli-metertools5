# Автотесты GUI для приложения MeterTools5
Проект автотестов настольного оконного приложения MeterTools5 на основе каркаса JUnit5 со сценариями на языке Gherkin (Java-библиотека Cucumber) и с построением отчетов при помощи Cucumber Reporting
## Предварительные требования
- MS Windows 11
- JDK 18
- Maven 3.8.6
## Скачивание и запуск
- скачать:

**git clone** https://github.com/YuriiTrofimenko/work-test-gui-java-sikuli-metertools5.git

- запустить тесты:

**mvn clean verify**

- файлы отчетов будут сгененрированы в каталоге _target/cucumber-html-reports_

## Использованы:
- платформа и язык программирования Java 18
- сборщик проектов Maven 3.8.6
- каркас выполнения тестов JUnit5
- Sikuli для взаимодействия с GUI рабочего стола и любых оконных приложений на основе графических образцов
- сценарии тестов в формате Gherkin для контейнера Cucumber (например, в файле src/main/resources/smoke.feature)
- построение отчетов при помощи Maven-плагина Cucumber Reporting
- журналирование при помощи log4j-slf4j