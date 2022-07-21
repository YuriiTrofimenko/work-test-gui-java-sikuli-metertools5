package org.tyaa.work.test.java.sikuli.metertools5.facades.base;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.facades.delegates.AppResetDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.delegates.AppStarterDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.facades.delegates.AppTerminatorDelegate;
import org.tyaa.work.test.java.sikuli.metertools5.factories.WindowFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

import java.io.IOException;

/** Абстрактный класс-родитель классов фасадов, скрывающих детали взаимодействия с GUI */
public abstract class AbstractFacade {

    protected final Screen screen;

    protected AbstractFacade(Screen screen) {
        this.screen = screen;
    }

    /**
     * Для реализации возможного комплекса действий,
     * необходимых для определённого режима запуска приложения,
     * например, первый запуск или запуск с состоянием,
     * сохранённым с предыдущих сеансов
     *  */
    public abstract AbstractFacade open();
    /**
     * Вызов сменной основной операции запуска приложения с последующей выдержкой времени
     * @param starter Реализация основной операции запуска приложения
     * */
    protected void openApp(AppStarterDelegate starter) throws FindFailed, InterruptedException {
        // запуск приложения заданным извне способом -
        // это может быть двойной клик по ярлыку
        // или выполнение команды в консоли или другой способ,
        // задаваемый параметром starter
        starter.start();
        // время его запуска тестируемого приложения впервые после его сборки
        // может быть значительным, но обычно не превышает пяти секунд,
        // поэтому после старта операции запуска приложения даём дополнительное время -
        // пять секунд - перед возможными последующими операциями,
        // требующими отображённого на экране главного окна приложения
        Thread.sleep(5000L);
    }
    /**
     * Вызов сменной основной операции закрытия приложения
     * @param terminator Реализация основной операции закрытия приложения
     * */
    protected void closeApp(AppTerminatorDelegate terminator) throws FindFailed {
        terminator.close();
    }
    /**
     * Вызов сменной операции сброса пользовательского состояния приложения
     * @param reset Реализация основной операции закрытия приложения
     * */
    protected void resetAppUserState(AppResetDelegate reset) throws IOException {
        reset.reset();
    }
    /**
     * Базовая реализация закрытия приложения
     * */
    public AbstractFacade close() {
        try {
            this.closeApp(() -> WindowFactory.getMainWindowFrame(screen).getCloseButton().click());
        } catch (FindFailed e) {
            throw new RuntimeException(e);
        }
        return this;
    }
    /**
     * Базовая реализация проверки, закрыто ли приложение
     * @param appClosed Обёртка для возврата булевого результата проверки
     * */
    public AbstractFacade checkAppClosed(ValueWrapper<Boolean> appClosed) {
        try {
            // попытка создать экземпляр модели каркаса окна,
            // которой должно соответствовать окно на экране
            WindowFactory.getMainWindowFrame(screen);
            // если не возникло исключение - результат отрицательный,
            // главное окно приложения все ещё на экране
            appClosed.value = false;
        } catch (FindFailed e) {
            // если возникло исключение провала поиска изображений на экране
            // - результат положительный, главное окно приложения исчезло с экрана
            appClosed.value = true;
        }
        return this;
    }
}
