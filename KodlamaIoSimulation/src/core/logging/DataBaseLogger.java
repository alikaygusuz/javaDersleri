package core.logging;

public class DataBaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veri Database`e loglandı : " + data);
    }
}
