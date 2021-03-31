package aicrafts.aircraft_app.aop;

import aicrafts.aircraft_app.services.LogService;

public class LogAspect {
   private final LogService logService;

    public LogAspect(LogService logService) {
        this.logService = logService;
    }
}
