package com.innerclasses.controller;

/**
 * @Auther: linklmm
 * @Date: 2019/7/2 07:33
 * @Description:light、water和thermostat都属于外围类GreenhouseControls
 *
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Light is off";
        }

        @Override
        public void action() {
            light = false;
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }

        @Override
        public void action() {
            water = false;
        }
    }
    private String thermostat = "Day";
    public class ThermostatNight extends Event{
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Thermost on night setting";
        }

        @Override
        public void action() {
            thermostat ="Night";
        }
    }
    public class ThermostatDay extends Event{
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Thermost on day setting";
        }

        @Override
        public void action() {
            thermostat = "Day";
        }
    }

    /**
     * bell控制响铃，然后在事件表中增加一个bell对象
     */
    public class Bell extends Event{
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Bing!";
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList){
                addEvent(e);
            }
        }

        @Override
        public String toString() {
            return "Restarting system";
        }

        @Override
        public void action() {
            for (Event e :eventList){
                e.start();
                addEvent(e);
            }
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Terminating";
        }

        @Override
        public void action() {
            System.exit(0);
        }
    }
}
