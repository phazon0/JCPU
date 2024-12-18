package com.phazon0.api.configuration.settings.impl;

import com.phazon0.api.configuration.Config;
import com.phazon0.api.configuration.settings.Setting;

/**
 * Setting implemention of type Integer
 * Here we store values of type int, which defaults to 0 if no other value is provided in the config {@link Config}
 */
public class SettingDouble extends Setting<Double>
{
    private double value;

    public SettingDouble(final String name, final String description) {
	super(Double.class,name, description);
	value = 0;
    }

    @Override public Double getValue() {
	return value;
    }

    @Override public void setValue(final Double value) {
	this.value= value;
    }

}
