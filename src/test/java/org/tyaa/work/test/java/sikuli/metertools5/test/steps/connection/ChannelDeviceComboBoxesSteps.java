package org.tyaa.work.test.java.sikuli.metertools5.test.steps.connection;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.sikuli.script.FindFailed;
import org.tyaa.work.test.java.sikuli.metertools5.factories.FacadeFactory;
import org.tyaa.work.test.java.sikuli.metertools5.utils.ValueWrapper;

/** Реализации шагов сценариев тестов выпадающих списков Тип соединения и Тип устройства */
public class ChannelDeviceComboBoxesSteps {

    @Then("В окне есть выпадающий список каналов соединения с подписью {string}")
    public void channelComboBoxExists(String comboBoxSelectedItemText) {
        ValueWrapper<Boolean> channelComboBoxExists = new ValueWrapper<>();
        FacadeFactory.getChannelPanelFacade().checkChannelComboBox(comboBoxSelectedItemText, channelComboBoxExists);
        Assertions.assertTrue(channelComboBoxExists.value);
    }

    @Then("В окне есть выпадающий список устройств с подписью {string}")
    public void deviceComboBoxExists(String comboBoxSelectedItemText) {
        ValueWrapper<Boolean> deviceComboBoxExists = new ValueWrapper<>();
        FacadeFactory.getDevicePanelFacade().checkDeviceComboBox(comboBoxSelectedItemText, deviceComboBoxExists);
        Assertions.assertTrue(deviceComboBoxExists.value);
    }

    @When("Пользователь открывает выпадающий список каналов соединения с подписью {string} и кликает по пункту {string}")
    public void selectChannelComboBoxItem(String comboBoxSelectedItemText, String comboBoxTargetItemText) throws FindFailed {
        FacadeFactory.getChannelPanelFacade()
                .selectChannelComboBoxItem(
                        comboBoxSelectedItemText,
                        String.format("пункт %s", comboBoxTargetItemText)
                );
    }

    @When("Пользователь открывает выпадающий список устройств с подписью {string} и кликает по пункту {string}")
    public void selectDeviceComboBoxItem(String comboBoxSelectedItemText, String comboBoxTargetItemText) throws FindFailed {
        FacadeFactory.getDevicePanelFacade()
                .selectDeviceComboBoxItem(
                        comboBoxSelectedItemText,
                        String.format("пункт %s", comboBoxTargetItemText)
                );
    }
}
