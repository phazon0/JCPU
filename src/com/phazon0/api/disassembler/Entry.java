package com.phazon0.api.disassembler;

import com.phazon0.api.CPU;
import com.phazon0.api.memory.RAM;
import com.phazon0.api.operation.OpCode;
import com.phazon0.api.operation.OpCodeMapper;
import com.phazon0.api.operation.instruction.Instruction;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry object for disassembled instructions {@link Disassembler}
 * The entry object stores args, offset and opcode
 */
public class Entry
{

    private byte offset;

    private List<Byte> args;
    private OpCode opCode;

    public Entry(int address, CPU cpu){
	RAM memory = cpu.getMemory();
       byte opCodeByte = memory.readByte(address);
	this.opCode = OpCodeMapper.getOpCodeFromByte(opCodeByte);
	Instruction instruction = cpu.getOperationManager().getInstruction(opCodeByte);
	this.offset = (byte) instruction.getSize();
	args = new ArrayList<>();
	   for (int i = 1; i < offset; i++) {
		    args.add(memory.readByte(address+i));
	   }

   }

    public byte getOffset() {
	return offset;
    }

    public OpCode getOpCode() {
	return opCode;
    }

    public List<Byte> getArgs() {
	return args;
    }

    @Override
   public String toString(){
	StringBuilder str = new StringBuilder();
	str.append(opCode.name());
	for (byte value : args){
	    str.append(" ").append(String.format("%04X", value));
	}
	return str.toString();
   }

}
