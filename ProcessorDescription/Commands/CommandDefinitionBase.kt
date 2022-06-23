package ProcessorDescription.Commands

data class CommandDefinitionBase(
    val name: String,
    val microcode: String,
    val code: Long, val codeLength: Int,
    val operand1Length: Int? = null,
    val operand2Length: Int? = null,
    val operand3Length: Int? = null
)