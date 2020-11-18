package ru.timsv.fieldcoordinator.model;


import ru.timsv.fieldcoordinator.model.response.ResponseData;

public class MainService {

    public void go() {

        Parser parser = new Parser();
        parser.run();

        TimeService timeService = new TimeService();

        ResponseData responseData = parser.getRd();

        timeService.setCurrentTime(responseData.getTime());
        timeService.printCurrentTime();

    }

}
