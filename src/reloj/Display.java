/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author agarridogarcia
 */
public class Display {
    private static boolean ledClock, ledAlarm, ledSet;
    
     /**
      * showLeds activate leds and update the value of every led.
      * @param showAlarm ON/OFF led from ledAlarm
      * @param showClock ON/OFF led from ledClock
      * @param showSet ON/OFF led from ledSet
      */
     public static void showLeds(boolean showAlarm, boolean showClock, boolean showSet){
         ledClock=showClock;
         ledAlarm=showAlarm;
         ledSet=showSet;
         
     }
     public static void showHrMin(){
         
     }
     
}
