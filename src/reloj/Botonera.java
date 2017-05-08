/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.time.LocalTime;

/**
 *
 * @author agarridogarcia
 */
public class Botonera {
    
    private static boolean alarmActive, setHour, setAlarm;
    
    /**
     * alarmOn switch on the alarm
     */
    public static void alarmON(){
        
    }
   /**
    * alarmOFF switch off the alarm
    */
    public static void alarmOFF(){
        
    }
    /**
     * configAlarm configure the alarm:set hours and minutes
     */
    public static void configAlarm(){
        
    }
    /**
     * configHr set the hours
     */
    public static void configHr(){
       Display.showLeds(setAlarm, setHour, setHour);
       Display.showHrMin();
    }
    
    
     
    /**
     * stopAlarm switch off the sound of the alarm
     */
    public void stopAlarm(){
        
    }
    
    /**
     * plusHr increases the hours
     */
     public static void plusHr(){
       Reloj.hrActual.plusHours(1);
       Display.showHrMin();
       
        
    }
     public static void plusMin(){
         System.out.println(Reloj.hrActual.getMinute());
        
    }
    
    
}
