package com.example.android.quakereport;

/**
 * Created by iva on 5/17/17.
 */

public class Earthquake {

    /**
     * Measure of the size of the earthquake
     */
    private String mMagnitude;

    /**
     * Location of the earthquake
     */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     * Create a new com.example.android.quakereport.Earthquake object.
     *
     * @param magnitude is the measure of the size of the earthquake
     * @param location is the place where the earthquake occerred
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Get the size of the earthquake
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the date of the earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
