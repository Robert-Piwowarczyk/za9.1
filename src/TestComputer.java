public class TestComputer {
    public static void main(String[] args) {

        OverclockablePart computer1 = new OverclockablePart("X2800",
                "IBM",1410,2500,50);

        System.out.println(computer1. additionalSpeedCpu());
        System.out.println(computer1.additionalSpeedRam());
    }
}
