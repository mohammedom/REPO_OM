class Car {
  var brand = ""
  var model = ""
  var year = 0
}

fun main() {
  val c1 = Car()
  c1.brand = "Ford"
  c1.model = "Mustang"
  c1.year = 1969
  print(" brand : ${c1.brand}\n model : ${c1.model}\n year : ${c1.year}")
}