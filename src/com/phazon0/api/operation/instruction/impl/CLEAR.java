package com.phazon0.api.operation.instruction.impl;

import com.phazon0.api.operation.instruction.Instruction;
import com.phazon0.api.CPU;
import com.phazon0.api.operation.AddressingMode;
import com.phazon0.api.register.ProcessorFlag;
import com.phazon0.api.register.ProcessorStatus;

public class CLEAR extends Instruction
{
    private ProcessorFlag flag;

    public CLEAR(final CPU cpu, final int cycles, final AddressingMode mode, final int size, ProcessorFlag flag) {
	super(cpu, cycles, mode, size);
	this.flag = flag;
    }

    @Override public void performOperation() {
	ProcessorStatus processorStatus = cpu.getProcessorStatus();
	processorStatus.setFlag(flag,false);
    }
}
