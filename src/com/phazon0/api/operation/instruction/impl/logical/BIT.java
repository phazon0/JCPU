package com.phazon0.api.operation.instruction.impl.logical;

import com.phazon0.api.CPU;
import com.phazon0.api.operation.AddressingMode;
import com.phazon0.api.operation.instruction.Instruction;
import com.phazon0.api.register.ProcessorFlag;

public class BIT extends Instruction
{
    public BIT(final CPU cpu, final int cycles, final AddressingMode mode, final int size) {
	super(cpu, cycles, mode, size);
    }

    @Override
    public void performOperation() {
	byte accumulator = cpu.getAccumulator().getValue();
	byte operand = fetchOperand();
	byte result = (byte) (accumulator & operand);

	// Update the ZERO flag
	verifyZeroFlag(result);
	verifyNegativeFlag(operand);

	// Update the OVERFLOW flag (bit 6 of the operand)
	cpu.getProcessorStatus().setFlag(ProcessorFlag.OVERFLOW, (operand & 0x40) != 0);
    }
}
