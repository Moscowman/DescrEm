package ProcessorDescription

import ProcessorDescription.Registers.Register16bits
import ProcessorDescription.Registers.Register8bits
import ProcessorDescription.Registers.RegistersSet

class Z80 : IProcessorDescription {

    val registers: Array<RegistersSet> = arrayOf(
        RegistersSet(Register8bits("A", 0), 0b1),
        RegistersSet(Register8bits("F", 8), 0b1),
        RegistersSet(Register8bits("B", 16), 0b1),
        RegistersSet(Register8bits("C", 24), 0b1),
        RegistersSet(Register8bits("D", 32), 0b1),
        RegistersSet(Register8bits("E", 40), 0b1),
        RegistersSet(Register8bits("H", 48), 0b1),
        RegistersSet(Register8bits("L", 56), 0b1),
        RegistersSet(Register16bits("AF", 0), 0b1),
        RegistersSet(Register16bits("BC", 16), 0b1),
        RegistersSet(Register16bits("DE", 32), 0b1),
        RegistersSet(Register16bits("HL", 48), 0b1),
        RegistersSet(Register8bits("A", 64), 0b10),
        RegistersSet(Register8bits("F", 72), 0b10),
        RegistersSet(Register8bits("B", 80), 0b10),
        RegistersSet(Register8bits("C", 88), 0b10),
        RegistersSet(Register8bits("D", 96), 0b10),
        RegistersSet(Register8bits("E", 104), 0b10),
        RegistersSet(Register8bits("H", 112), 0b10),
        RegistersSet(Register8bits("L", 120), 0b10),
        RegistersSet(Register16bits("AF", 64), 0b10),
        RegistersSet(Register16bits("BC", 80), 0b10),
        RegistersSet(Register16bits("DE", 96), 0b10),
        RegistersSet(Register16bits("HL", 112), 0b10),
    )
}

