package com.phazon0.api.operation.instruction.impl.system;

import com.phazon0.api.operation.instruction.InstructionProvider;
import com.phazon0.api.CPU;
import com.phazon0.api.operation.AddressingMode;
import com.phazon0.api.operation.instruction.Instruction;

/**
 * Implementation of the BREAK instruction present in the 6502 instruction set.
 * For more information, refer to: <a href="http://www.6502.org/users/obelisk/6502/reference.html#BRK">6502 Reference - BRK</a>
 */
public class BREAK extends Instruction
{
    public BREAK(final CPU cpu, final int cycles, final AddressingMode mode) {
	super(cpu, cycles, mode, 1);
    }

    /**
     * The BREAK instruction causes a software interrupt.
     * @see InstructionProvider#performOperation()
     */
    @Override public void performOperation() {
        cpu.setExecuting(false);
    }
}
