/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author utente_javaee7
 */
public class Log4JCrunchifyTest {

    static Logger log = Logger.getLogger(Log4JCrunchifyTest.class);

    public static void main(String[] args) {
     BasicConfigurator.configure();
        log.info("This is Logger Info");
    }
}
