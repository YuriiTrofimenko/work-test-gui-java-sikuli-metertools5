package org.tyaa.work.test.java.sikuli.metertools5.facades.actions;

import org.sikuli.script.FindFailed;

import java.io.IOException;

/** Функциональный интерфейс действия, сбрасывающего пользовательское состояние приложения */
@FunctionalInterface
public interface AppResetDelegate {
    void reset() throws IOException;
}
