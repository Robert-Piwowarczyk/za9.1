public class ComputerPart {
    private String computerName;
    private String producerName;
    private int serialNumber;
    private int additionalSpeed;

    public ComputerPart(String computerName, String producerName,
                        int serialNumber) {
        this.computerName = computerName;
        this.producerName = producerName;
        this.serialNumber = serialNumber;
    }

    public int getAdditionalSpeed() {
        return additionalSpeed;
    }

    public void setAdditionalSpeed(int additionalSpeed) {
        this.additionalSpeed = additionalSpeed;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int clockSpeedUp() {
        return additionalSpeed;
    }
}
