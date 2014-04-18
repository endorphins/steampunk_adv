package org.endorphins.steampunkadv.job;

public abstract class Job{
    
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }
}