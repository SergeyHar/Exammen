package am.ACA.model.Util;

import am.ACA.controller.Controller;
import am.ACA.controller.ControllerInt;

/**
 * Created by Karen on 9/6/2016.
 */
public class MyMain {
    public static void main(String[] args) {

        ControllerInt c = new Controller();
        Util util = new Util();
        Util.printMessage("Welcome please input path directory ");
        Util.path = c.onClickButton();
        Util.printMessage("Welcome please write input command ");
        c.start();

    }

}
