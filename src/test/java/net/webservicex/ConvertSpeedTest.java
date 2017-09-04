package net.webservicex;

import org.testng.annotations.Test;

import static net.webservicex.SpeedUnit.CENTIMETERS_PERSECOND;
import static net.webservicex.SpeedUnit.KILOMETERS_PERHOUR;

public class ConvertSpeedTest {

    JAXBClient jaxbClient = new JAXBClient();
    private  ConvertSpeedsSoap convertSpeedsSoap = jaxbClient.client;

    @Test
    public void speedTest(){

        ConvertSpeeds convertSpeeds = convertSpeedsSoap.convertSpeed(0, KILOMETERS_PERHOUR, CENTIMETERS_PERSECOND);
    }
}
