package com.bia.log4jyahoo;

import org.apache.log4j.Logger;

public class App {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {

        logger.trace("trace message");

        logger.warn("warn message");

        logger.error("error message, a very long error message!");

        //Thread.(2000);
    }
}
