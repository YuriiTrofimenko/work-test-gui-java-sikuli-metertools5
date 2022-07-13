Feature: Smoke
  Как пользователь
  Я хочу запустить приложение первый раз, увидеть главное окно с неактивной кнопкой соединения и закрыть его
  Таким образом я проверю, что приложение успешно открывается и закрывается

  Scenario: Открыть приложение и проверить его главное окно, затем закрыть
    Given Главное окно приложения, открытое пользователем первый раз двойным кликом по ярлыку на рабочем столе
    Then В окне есть неактивная кнопка Подключиться
    When Пользователь кликает по стандартной кнопке закрытия окна
    Then Главное окно закрывается, неактивная кнопка Подключиться больше не находится на экране