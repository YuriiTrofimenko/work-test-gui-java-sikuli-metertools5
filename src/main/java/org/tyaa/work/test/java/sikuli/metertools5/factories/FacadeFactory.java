package org.tyaa.work.test.java.sikuli.metertools5.factories;

import org.tyaa.work.test.java.sikuli.metertools5.Global;
import org.tyaa.work.test.java.sikuli.metertools5.facades.base.AbstractFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.base.AbstractInitialFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.connection.ChannelPanelFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.connection.ConnectionButtonFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.base.AbstractStatefulFacade;
import org.tyaa.work.test.java.sikuli.metertools5.facades.connection.DevicePanelFacade;

public class FacadeFactory {

    private static AbstractFacade abstractFacade;
    private static AbstractInitialFacade abstractInitialFacade;
    private static AbstractStatefulFacade abstractStatefulFacade;
    private static ConnectionButtonFacade connectionButtonFacade;
    private static ChannelPanelFacade channelPanelFacade;
    private static DevicePanelFacade devicePanelFacade;

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
    public static ConnectionButtonFacade getConnectionButtonFacade() {
        return connectionButtonFacade != null
                ? connectionButtonFacade
                : (connectionButtonFacade = new ConnectionButtonFacade(Global.getScreen()) {});
    }
    public static ChannelPanelFacade getChannelPanelFacade() {
        return channelPanelFacade != null
                ? channelPanelFacade
                : (channelPanelFacade = new ChannelPanelFacade(Global.getScreen()) {});
    }
    public static DevicePanelFacade getDevicePanelFacade() {
        return devicePanelFacade != null
                ? devicePanelFacade
                : (devicePanelFacade = new DevicePanelFacade(Global.getScreen()) {});
    }
}
