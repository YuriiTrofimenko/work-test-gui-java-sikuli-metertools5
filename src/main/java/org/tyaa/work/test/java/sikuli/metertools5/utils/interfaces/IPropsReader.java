package org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces;

/** Интерфейс получения свойств проекта */
public interface IPropsReader {
    final String WAIT_FOR_IMAGE = "WAIT_FOR_IMAGE";
    final String BASE_IMAGES_PATH = "BASE_IMAGES_PATH";
    String getString(String propName);
    Integer getInt(String propName);
    Double getDouble(String propName);
}
