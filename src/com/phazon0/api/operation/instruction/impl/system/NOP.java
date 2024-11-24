package com.phazon0.api.operation.instruction.impl.system;

import com.phazon0.api.operation.instruction.Instruction;
import com.phazon0.api.operation.instruction.InstructionProvider;
import com.phazon0.api.CPU;
import com.phazon0.api.operation.AddressingMode;

/**
 * Implementation of the NOP instruction present in the 6502 instruction set.
 * For more information, refer to: <a href="http://www.6502.org/users/obelisk/6502/reference.html#NOP">Refrence - NOP</a>
 */
public class NOP extends Instruction
{
    public NOP(CPU cpu, int cycles, AddressingMode mode){
	super(cpu, cycles, mode,1);
    }

    /**
     * The NOP instruction does nothing, so it is a no-op.
     * @see InstructionProvider#performOperation()
     */
    @Override public void performOperation() {
	//No operation
    }
}
