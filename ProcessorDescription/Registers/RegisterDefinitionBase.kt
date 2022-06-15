package ProcessorDescription.Registers

abstract class RegisterDefinitionBase {
    abstract val name: String
    abstract val startingBit: Int
}