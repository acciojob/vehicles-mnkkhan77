package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle() {
        currentSpeed = 0;
        currentDirection = 0;
    }

    public Vehicle(int currentSpeed, int currentDirection) {
        this.currentDirection = currentDirection;
        this.currentSpeed = currentSpeed;
    }

    public Vehicle(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }
    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void steer(int direction) {
        //direction is in degrees, add it to the current direction
        currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + getCurrentDirection() + " degrees");
    }

    public void move(int speed, int direction) {
        //set the values of currentSpeed and currentDirection
        setCurrentSpeed(speed);
        setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + getCurrentSpeed() + ", and the direction is changed to: " + getCurrentDirection() + " degrees");
    }

    public void stop() {
        setCurrentSpeed(0);
        System.out.println("stop method called - The vehicle is stopped");
    }

}
