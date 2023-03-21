fun main(args: Array<String>) {
    var resulta = addFunction( 694, 106)
    println(resulta)
    var resultb = multiplyFunction(4, 500)
    println(resultb)
    var resultc = divideFunction(40, 800)
    println(resultc)
}
fun addFunction(x: Int, w: Int): Int {
    return (x + w)
}
fun multiplyFunction(y: Int, z: Int): Int {
    return (y * z)
}
fun divideFunction(d: Int, c: Int): Int {
    return (c / d)
}