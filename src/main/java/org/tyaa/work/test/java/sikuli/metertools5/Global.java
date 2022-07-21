package org.tyaa.work.test.java.sikuli.metertools5;

import org.sikuli.script.Screen;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ImagePathGetter;
import org.tyaa.work.test.java.sikuli.metertools5.utils.LocalYamlFileReader;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IImagePathGetter;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;
import org.tyaa.work.test.java.sikuli.metertools5.utils.LocalPropertiesFileReader;

/** Глобально доступные объекты */
public class Global {

    private static final Global.SetupRunner SETUP_RUNNER = new SetupRunner();
    private static Screen SCREEN;
    private static IPropsReader PROPS_READER;
    private static IImagePathGetter imagePathGetter;
    private static String theme;
    private static String lang;

    public static Screen getScreen() {
        return SCREEN;
    }
    public static IPropsReader getPropsReader() {
        return PROPS_READER;
    }
    public static IImagePathGetter getImagePathGetter() {
        return imagePathGetter;
    }
    public static void setupImagePathGetter(String theme, String lang) {
        imagePathGetter = new ImagePathGetter(
                PROPS_READER,
                new LocalYamlFileReader(
                        String.format(
                                "properties/sample-image-paths/%s/%s.yaml",
                                theme,
                                lang
                        )
                ));
    }
    public static String getTheme() {
        return theme;
    }
    public static String getLang() {
        return lang;
    }

    public static class SetupRunner {
        public SetupRunner() {
            // инициализация контекста экрана
            SCREEN = new Screen();
            // создать объект чтения настроечных свойств из файла
            PROPS_READER = new LocalPropertiesFileReader();
            // попытка получить выбор темы и локали из командной строки
            String themeProp = System.getProperty(IImagePathGetter.THEME);
            String langProp = System.getProperty(IImagePathGetter.LANG);
            // если попытка не удалась - использовать умолчания
            theme = (themeProp != null) ? themeProp : "light";
            lang = (langProp != null) ? langProp : "ru-Ru";
            // создать объект получения путей к образцам изображений по текстам
            setupImagePathGetter(theme, lang);
        }
    }
}
