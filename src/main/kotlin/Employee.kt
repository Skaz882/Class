class Employee (var name: String?, var number: Int, var shift: Int){
    fun printAll() {
        println(name.toString() + "\n" + number + "\n " + shift)
    }
}