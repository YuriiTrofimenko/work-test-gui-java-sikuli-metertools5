package org.tyaa.work.test.java.sikuli.metertools5.utils;
import org.tyaa.work.test.java.sikuli.metertools5.utils.interfaces.IPropsReader;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

/** Реализация получения свойств проекта из локального Yaml-файла */
public class LocalYamlFileReader implements IPropsReader {
    private final static Logger logger = Logger.getLogger(String.valueOf(LocalYamlFileReader.class));
    private final String PATH_TO_YAML_FILE;
    private Yaml yaml = new Yaml();
    private Map<String, Object> properties;

    public LocalYamlFileReader(String filePath) {
        PATH_TO_YAML_FILE = filePath;
        InputStream inputStream = null;
        try {
            System.out.println();
            inputStream = this.getClass()
                    .getClassLoader()
                    .getResourceAsStream(PATH_TO_YAML_FILE);
            if (inputStream != null) {
                properties = yaml.load(inputStream);
            } else {
                logger.info(String.format("Ошибка: Файл свойств %s не найден", PATH_TO_YAML_FILE));
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String getString(String propName) {
        return (String) properties.get(propName);
    }

    @Override
    public Integer getInt(String propName) {
        return (Integer) properties.get(propName);
    }

    @Override
    public Double getDouble(String propName) {
        return (Double) properties.get(propName);
    }
}