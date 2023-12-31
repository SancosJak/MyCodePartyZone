package CinemaSysManagment.model;

import CinemaSysManagment.dao.ICinemaHall;

public class CinemaHall implements ICinemaHall {
    private int hallNumber;
    private int capacity;
    private HallType hallType;
    private int numRows;
    private int seatsPerRow;

    public CinemaHall(int hallNumber, int capacity, HallType hallType) {
        this.hallNumber = hallNumber;
        this.capacity = capacity;
        this.hallType = hallType;
    }

    public CinemaHall(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Установить новый тип кинозала.
     */
    @Override
    public void setHallType() {

    }

    public HallType getHallType() {
        return hallType;
    }

    public void setHallType(HallType hallType) {
        this.hallType = hallType;
    }

    @Override
    public void decreaseCapacity(int amount) {
        if (amount > 0) {
            capacity -= amount;
        }
    }

    @Override
    public void increaseCapacity(int amount) {
        if (amount > 0) {
            capacity += amount;
        }
    }

    @Override
    public int getNumRows() {
        return numRows;
    }

    @Override
    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public enum HallType {
        _2D,
        _3D,
        IMAX
    }
}