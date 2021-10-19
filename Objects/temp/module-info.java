module b4j {
requires java.base;
requires java.desktop;
requires java.logging;
requires java.prefs;
requires javafx.base;
requires javafx.controls;
requires javafx.fxml;
requires javafx.graphics;
requires javafx.media;
requires javafx.swing;
requires java.scripting;
requires java.xml;
requires jdk.unsupported;
requires java.datatransfer;
requires jdk.unsupported.desktop;
requires jdk.jsobject;
requires jdk.xml.dom;
exports cloyd.thaq.monitor;
uses org.eclipse.paho.client.mqttv3.spi.NetworkModuleFactory;
provides org.eclipse.paho.client.mqttv3.spi.NetworkModuleFactory with org.eclipse.paho.client.mqttv3.internal.TCPNetworkModuleFactory, org.eclipse.paho.client.mqttv3.internal.SSLNetworkModuleFactory,  org.eclipse.paho.client.mqttv3.internal.websocket.WebSocketNetworkModuleFactory, org.eclipse.paho.client.mqttv3.internal.websocket.WebSocketSecureNetworkModuleFactory;}