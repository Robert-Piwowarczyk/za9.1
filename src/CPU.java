public class CPU extends OverclockablePart {
    public CPU(String computerName, String producerName, int serialNumber, int clockSpeed, int temperature) {
        super(computerName, producerName, serialNumber, clockSpeed, temperature);
    }
    double additionalSpeedCpu(){
        if (setClockSpeed()<2800)
        return getTemperature()+getTemperature()*0.1;
    }
}




