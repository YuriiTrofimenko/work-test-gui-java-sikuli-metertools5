package org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces;

/** Интерфейс получения свойств проекта */
public interface IPropsReader {
    String WAIT_FOR_IMAGE = "WAIT_FOR_IMAGE";
    String BASE_IMAGES_PATH = "BASE_IMAGES_PATH";
    String APP_USER_STATE_FILE_NAME = "APP_USER_STATE_FILE_NAME";
    String getString(String propName);
    Integer getInt(String propName);
    Double getDouble(String propName);
}
