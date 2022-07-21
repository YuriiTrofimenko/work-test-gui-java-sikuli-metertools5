package org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces;
/** Интерфейс получения относительного пути к образцу изображения по тексту с этого образца */
public interface IImagePathGetter {
    String THEME = "THEME";
    String LANG = "LANG";
    /**
     * Получить относительный путь к образцу изображения
     * @param key Строка текста, размещённого на фрагменте экрана, для которого нужно получить образец изображения
     * */
    String getImagePathByKey(String key);
    /**
     * Получить относительный путь к образцу изображения локализованного элемента
     * @param text Строка текста, размещённого на фрагменте экрана, для которого нужно получить образец изображения
     * */
    String getLocalizedImagePathByText(String text);
}
