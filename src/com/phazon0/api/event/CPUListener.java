package com.phazon0.api.event;

/**
 * Interface for classes that are listening to cpu events
 */
public interface CPUListener
{
    public void cpuChanged(EventType eventType);
}
