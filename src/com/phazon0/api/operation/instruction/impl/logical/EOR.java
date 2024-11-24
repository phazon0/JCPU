package com.phazon0.api.operation.instruction.impl.logical;

import com.phazon0.api.operation.instruction.Instruction;
import com.phazon0.api.CPU;
import com.phazon0.api.operation.AddressingMode;

public class EOR extends Instruction
{
    public EOR(final CPU cpu, final int cycles, final AddressingMode mode, final int size) {
	super(cpu, cycles, mode, size);
    }

    @Override
    public void performOperation() {
	byte accumulator = cpu.getAccumulator().getValue();
	byte operand = fetchOperand();
	byte result = (byte) (accumulator ^ operand);

	cpu.getAccumulator().setValue(result);
	verifyNegativeFlag(result);
	verifyZeroFlag(result);
    }
}
