package hw28_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpAddressTest {
    private IpAddress ipAddress;
    private String ip = "192.168.23.1";

    @BeforeEach
    void setUp() {
        ipAddress = new IpAddress(ip);
    }

    @Test
    void validIp() {
        String validIp = "255.168.23.1";
        ipAddress.setIp(validIp);
        assertEquals(validIp, ipAddress.getIp());
    }

    @Test
    void IpLastNull() {
        String invalidIp = "255.168.23."; // четыре числа, разделённые точками, нету последнего числа
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }

    @Test
    void IpCenterNull() {
        String invalidIp = "255..23.2"; // четыре числа, разделённые точками, нету числа в середине
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }


    @Test
    void IpStartNull() {
        String invalidIp = ".24.23.2"; // четыре числа, разделённые точками, нету первого числа
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }

    @Test
    void IpNumbersGreaterThan4() {
        String invalidIp = "255.24.23.2.2"; // четыре числа, разделённые точками (чисел больше 4х)
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }

    @Test
    void IpNumbersLessThan4() {
        String invalidIp = "255"; // четыре числа, разделённые точками (чисел < 4х)
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }

    @Test
    void IpOnlyNumbers() {
        String invalidIp = "255.168.23.1a"; // только цифры
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }

    @Test
    void IpNumbersFrom0To255() {
        String invalidIp = "256.168.23.1"; // Каждое число должно быть в диапазоне от 0 до 255
        ipAddress.setIp(invalidIp);
        assertEquals(ip, ipAddress.getIp());
    }


}