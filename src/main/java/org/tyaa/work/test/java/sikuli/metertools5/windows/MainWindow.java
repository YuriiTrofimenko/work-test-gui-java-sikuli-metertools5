package org.tyaa.work.test.java.sikuli.metertools5.windows;

import org.tyaa.work.test.java.sikuli.metertools5.elements.base.AbstractElement;
import org.tyaa.work.test.java.sikuli.metertools5.elements.Button;
import org.tyaa.work.test.java.sikuli.metertools5.elements.StaticBlock;
import org.tyaa.work.test.java.sikuli.metertools5.views.interfaces.IConnectionView;

/** Модель главного окна приложения */
public class MainWindow {

    /** Содержимое заголовка окна */
    private StaticBlock titleBlock;
    /** Стандартная кнопка закрытия окна */
    private Button closeButton;
    /** Стандартная кнопка разворачивания окна на весь экран */
    private Button maximizeButton;
    /** Корневое представление */
    private IConnectionView connectionView;

    /**
     * Создание модели главного окна приложения с параметрами
     * @param closeButton - стандартная кнопка закрытия окна
     * @param maximizeButton - стандартная кнопка разворачивания окна на весь экран
     * @param connectionView - корневое представление
     */
    public MainWindow(StaticBlock titleElement, Button closeButton, Button maximizeButton, IConnectionView connectionView) {
        this.titleBlock = titleElement;
        this.closeButton = closeButton;
        this.maximizeButton = maximizeButton;
        this.connectionView = connectionView;
    }

    public AbstractElement getTitleElement() {
        return titleBlock;
    }
    public void setTitleElement(StaticBlock titleElement) {
        this.titleBlock = titleElement;
    }
    public Button getCloseButton() {
        return closeButton;
    }
    public void setCloseButton(Button closeButton) {
        this.closeButton = closeButton;
    }
    public Button getMaximizeButton() {
        return maximizeButton;
    }
    public void setMaximizeButton(Button maximizeButton) {
        this.maximizeButton = maximizeButton;
    }
    public IConnectionView getConnectionView() {
        return connectionView;
    }
    public void setConnectionView(IConnectionView connectionView) {
        this.connectionView = connectionView;
    }
}
