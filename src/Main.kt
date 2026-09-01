//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val myTemp: Temperature = Temperature.Kelvin( temp = 0.0)

    myTemp.setTemp(0.0)

    println("The temperature is ${myTemp.getTempIn(unit = Temperature.Unit.C)}")

    /* println("The temperature is ${myTemp.getTempIn(unit = Temperature.Unit.F)}") */


}