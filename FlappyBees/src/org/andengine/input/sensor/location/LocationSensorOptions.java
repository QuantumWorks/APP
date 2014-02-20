package org.andengine.input.sensor.location;

import android.location.Criteria;

public class LocationSensorOptions extends Criteria
{

    private boolean a;
    private long b;
    private long c;

    public LocationSensorOptions()
    {
        a = true;
        b = 1000L;
        c = 10L;
    }
}
