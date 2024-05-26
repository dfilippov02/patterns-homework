package singleton;

import java.time.LocalDate;

public class SingletonLogger {

    private static volatile SingletonLogger instance;

    private SingletonLogger() {}

    public static synchronized SingletonLogger getInstance() {
        if(instance == null) {
            synchronized (SingletonLogger.class) {
                if(instance == null) {
                    instance = new SingletonLogger();
                }
            }
        }
        return instance;
    }

    public void classLog(Object obj, String info){
        System.out.printf("Log info: %s - %s - %s%n", LocalDate.now(), obj.getClass().getSimpleName(), info);
    }
}
