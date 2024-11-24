package com.phazon0.api.register;

import com.phazon0.api.CPU;

/**
 * Enum for managing the two different index registers X and Y
 * @see CPU#getIndexRegister(IndexRegisterType) for their use
 */
public enum IndexRegisterType
{
    X,
    Y
}
