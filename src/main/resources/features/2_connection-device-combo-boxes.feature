Feature: Выпадающие списки "Канал связи" и "Устройство"
  Как пользователь
  Я хочу запустить приложение и выбрать тип канала соединения и тип устройства
  Таким образом я проверю возможность начать настройку подключения

  Scenario: Открыть приложение первый раз и проверить наличие подписей выпадающих списков Канал связи и Устройство
    Given Главное окно приложения, открытое пользователем первый раз двойным кликом по ярлыку на рабочем столе
    Then В окне есть выпадающий список с подписью -Канал связи-
    Then В окне есть выпадающий список с подписью -Устройство-
    When Пользователь кликает по стандартной кнопке закрытия окна
    Then Главное окно закрывается, неактивная кнопка Подключиться больше не находится на экране