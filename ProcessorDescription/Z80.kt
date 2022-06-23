package ProcessorDescription

import ProcessorDescription.Commands.CommandDefinitionBase
import ProcessorDescription.Registers.Register16bits
import ProcessorDescription.Registers.Register8bits
import ProcessorDescription.Registers.RegistersSet

class Z80 : IProcessorDescription {

    val registers: Array<RegistersSet> = arrayOf(
        RegistersSet(Register8bits("F", 0), 0b1),
        RegistersSet(Register8bits("A", 8), 0b1),
        RegistersSet(Register8bits("C", 16), 0b1),
        RegistersSet(Register8bits("B", 24), 0b1),
        RegistersSet(Register8bits("E", 32), 0b1),
        RegistersSet(Register8bits("D", 40), 0b1),
        RegistersSet(Register8bits("L", 48), 0b1),
        RegistersSet(Register8bits("H", 56), 0b1),
        RegistersSet(Register16bits("AF", 0), 0b1),
        RegistersSet(Register16bits("BC", 16), 0b1),
        RegistersSet(Register16bits("DE", 32), 0b1),
        RegistersSet(Register16bits("HL", 48), 0b1),
        RegistersSet(Register8bits("F", 64), 0b10),
        RegistersSet(Register8bits("A", 72), 0b10),
        RegistersSet(Register8bits("C", 80), 0b10),
        RegistersSet(Register8bits("B", 88), 0b10),
        RegistersSet(Register8bits("E", 96), 0b10),
        RegistersSet(Register8bits("D", 104), 0b10),
        RegistersSet(Register8bits("L", 112), 0b10),
        RegistersSet(Register8bits("H", 120), 0b10),
        RegistersSet(Register16bits("AF", 64), 0b10),
        RegistersSet(Register16bits("BC", 80), 0b10),
        RegistersSet(Register16bits("DE", 96), 0b10),
        RegistersSet(Register16bits("HL", 112), 0b10),
        RegistersSet(Register16bits("PC", 128), 0b11),
        RegistersSet(Register16bits("SP", 144), 0b11),
        RegistersSet(Register16bits("IX", 160), 0b11),
        RegistersSet(Register16bits("IY", 176), 0b11),
        RegistersSet(Register8bits("R", 192), 0b11),
        )

    val commands: Array<CommandDefinitionBase> = arrayOf(
        CommandDefinitionBase("NOP", "NOP;", 0x0, 1),
        CommandDefinitionBase("EX", "SWAP_REGISTERS_16_BIT AF/{01}, AF/{10};", 0x8, 1),
        CommandDefinitionBase("DJNZ", "DEC B; IF B!= 0 THEN PC = PC + op1;", 0x10, 1, 1),
        CommandDefinitionBase("JR", "NOP;", 0x18, 1, 1),
    )
}

