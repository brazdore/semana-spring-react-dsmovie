package com.brazdore.dsmovie.interfaces;

import com.brazdore.dsmovie.exceptions.ResourceNotFoundException;

public interface IRunnable {

    static Runnable run(String s) throws Exception {
        throw new ResourceNotFoundException(s);
    }
}
