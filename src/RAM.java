import java.util.InputMismatchException;

public class RAM extends OverclockablePart {
    public RAM(String computerName, String producerName, int serialNumber, int clockSpeed, int temperature) {
        super(computerName, producerName, serialNumber, clockSpeed, temperature);
    }
    double additionalSpeedRam(){
        if (setClockSpeed()<2266)
            return getTemperature()+getTemperature()*0.15;
    }
}