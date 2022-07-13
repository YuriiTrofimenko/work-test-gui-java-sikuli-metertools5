package org.tyaa.work.test.java.sikuli.metertools5.test.steps;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Реализации шагов сценариев тестов выпадающих списков Тип соединения и Тип устройства */
public class ChannelDeviceComboBoxesSteps {

    @Then("В окне есть выпадающий список с подписью -Канал связи-")
    public void channelComboBoxExists() {
        ValueWrapper<Boolean> channelComboBoxExists = new ValueWrapper<>();
        FacadeFactory.getChannelDeviceComboBoxesTestFacade().checkChannelComboBox(channelComboBoxExists);
        Assertions.assertTrue(channelComboBoxExists.value);
    }

    @Then("В окне есть выпадающий список с подписью -Устройство-")
    public void deviceComboBoxExists() {
        ValueWrapper<Boolean> deviceComboBoxExists = new ValueWrapper<>();
        FacadeFactory.getChannelDeviceComboBoxesTestFacade().checkDeviceComboBox(deviceComboBoxExists);
        Assertions.assertTrue(deviceComboBoxExists.value);
    }
}
