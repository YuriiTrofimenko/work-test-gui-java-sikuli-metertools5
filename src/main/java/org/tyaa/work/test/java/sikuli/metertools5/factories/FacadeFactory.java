package org.tyaa.work.test.java.sikuli.metertools5.factories;

import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.facades.AbstractFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.initial.AbstractInitialFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.initial.ChannelDeviceComboBoxesTestFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.initial.SmokeTestFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.stateful.AbstractStatefulFacade;

public class FacadeFactory {

    private static AbstractFacade abstractFacade;
    private static AbstractInitialFacade abstractInitialFacade;
    private static AbstractStatefulFacade abstractStatefulFacade;
    private static SmokeTestFacade smokeTestFacade;
    private static ChannelDeviceComboBoxesTestFacade channelDeviceComboBoxesTestFacade;

    public static AbstractFacade getAbstractFacade() {
        return abstractFacade != null
                ? abstractFacade
                : (abstractFacade = new AbstractFacade(Global.getScreen()) {
                    @Override
                    public AbstractFacade open() {
                        return null;
                    }
                });
    }

    public static AbstractInitialFacade getAbstractInitialFacade() {
        return abstractInitialFacade != null
                ? abstractInitialFacade
                : (abstractInitialFacade = new AbstractInitialFacade(Global.getScreen()) {});
    }

    public static AbstractStatefulFacade getAbstractStatefulFacade() {
        return abstractStatefulFacade != null
                ? abstractStatefulFacade
                : (abstractStatefulFacade = new AbstractStatefulFacade(Global.getScreen()) {});
    }

    public static SmokeTestFacade getSmokeTestFacade() {
        return smokeTestFacade != null
                ? smokeTestFacade
                : (smokeTestFacade = new SmokeTestFacade(Global.getScreen()) {});
    }

    public static ChannelDeviceComboBoxesTestFacade getChannelDeviceComboBoxesTestFacade() {
        return channelDeviceComboBoxesTestFacade != null
                ? channelDeviceComboBoxesTestFacade
                : (channelDeviceComboBoxesTestFacade = new ChannelDeviceComboBoxesTestFacade(Global.getScreen()) {});
    }
}
