class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public int getHeight() {
        return this.getHeight();
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
