package org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces;

/** Интерфейс получения свойств проекта */
public interface IPropsReader {
    String WAIT_FOR_IMAGE = "WAIT_FOR_IMAGE";
    String BASE_IMAGES_PATH = "BASE_IMAGES_PATH";
    String WINDOW_TITLE_IMAGE_PATH = "WINDOW_TITLE_IMAGE_PATH";
    String WINDOW_CLOSE_IMAGE_PATH = "WINDOW_CLOSE_IMAGE_PATH";
    String WINDOW_MAXIMIZE_IMAGE_PATH = "WINDOW_MAXIMIZE_IMAGE_PATH";
    String APP_USER_STATE_FILE_NAME = "APP_USER_STATE_FILE_NAME";
    String APP_SHORTCUT_IMAGE_PATH = "APP_SHORTCUT_IMAGE_PATH";
    String getString(String propName);
    Integer getInt(String propName);
    Double getDouble(String propName);
}
