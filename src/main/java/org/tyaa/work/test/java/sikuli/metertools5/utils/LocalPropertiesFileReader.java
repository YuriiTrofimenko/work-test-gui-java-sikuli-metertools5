package org.tyaa.work.test.java.sikuli.metertools5.utils;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/** Реализация получения свойств проекта из локального Properties-файла */
public class LocalPropertiesFileReader implements IPropsReader {
    private final static Logger logger = Logger.getLogger(String.valueOf(LocalPropertiesFileReader.class));
    private final static String PATH_TO_CONFIG_PROPS = "src/main/resources/properties/custom.properties";
    private Properties properties = new Properties();

    public LocalPropertiesFileReader() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(PATH_TO_CONFIG_PROPS);
            properties.load(fis);
        } catch (IOException e) {
            logger.info(String.format("Ошибка: Файл свойств %s не найден", PATH_TO_CONFIG_PROPS));
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String getString(String propName) {
        return properties.getProperty(propName);
    }

    @Override
    public Integer getInt(String propName) {
        return Integer.parseInt(getString(propName));
    }

    @Override
    public Double getDouble(String propName) {
        return Double.parseDouble(getString(propName));
    }
}