package org.tyaa.work.test.java.sikuli.metertools5.facades.actions;

import org.sikuli.script.FindFailed;

/** Функциональный интерфейс действия, закрывающего приложение */
@FunctionalInterface
public interface AppTerminatorDelegate {
    void close() throws FindFailed;
}
