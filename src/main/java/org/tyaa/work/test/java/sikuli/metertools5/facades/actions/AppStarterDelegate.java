package org.tyaa.work.test.java.sikuli.metertools5.facades.actions;

import org.sikuli.script.FindFailed;

/** Функциональный интерфейс действия, открывающего приложение */
@FunctionalInterface
public interface AppStarterDelegate {
    void start() throws FindFailed;
}
