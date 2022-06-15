package ProcessorDescription

import ProcessorDescription.Registers.Register16bits
import ProcessorDescription.Registers.Register8bits

class Z80 : IProcessorDescription {
    val r8: Array<Register8bits> = arrayOf(
            Register8bits("A", 0), Register8bits("F", 8),
            Register8bits("B", 16), Register8bits("C", 24),
            Register8bits("D", 32), Register8bits("E", 40),
            Register8bits("H", 48), Register8bits("L", 56)
    )
    val r16: Array<Register16bits> = arrayOf(
            Register16bits("AF", 0), Register16bits("BC", 16),
            Register16bits("DE", 32), Register16bits("HL", 48)
    )
    val r8backtick: Array<Register8bits> = arrayOf(
            Register8bits("A", 64), Register8bits("F", 72),
            Register8bits("B", 80), Register8bits("C", 88),
            Register8bits("D", 96), Register8bits("E", 104),
            Register8bits("H", 112), Register8bits("L", 120)
    )
    val r16backtick: Array<Register16bits> = arrayOf(
            Register16bits("AF", 64), Register16bits("BC", 80),
            Register16bits("DE", 96), Register16bits("HL", 12)
    )
}

