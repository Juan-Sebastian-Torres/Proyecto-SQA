package co.com.screenplay.project.utils;

public class Time {

    public Time() {
    }

    public static void waitting(int waiting) {
        try {
            Thread.sleep(waiting * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
