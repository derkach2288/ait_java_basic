package hw28_2;

import java.util.Arrays;

public class IpAddress {

    private String ip;

    public IpAddress(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (ipIsValid(ip)) {
            this.ip = ip;
        } else {
            System.out.println(ip + " is not valid");
        }

    }

    private boolean ipIsValid(String ip) {
        String[] arrayIp = ip.split("\\.");

        if (arrayIp.length != 4) {
            return false;
        }

        for (int i = 0; i < arrayIp.length; i++) {
            String str = arrayIp[i];
            if (str.equals("")) {
                return false;
            }

            char[] ch = str.toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (!Character.isDigit(ch[j])) {
                    return false;
                }
            }


            int ipInt = Integer.parseInt(str);
            if (!(ipInt >= 0 && ipInt <= 255)) {
                return false;
            }
        }
        return true;
    }


}
