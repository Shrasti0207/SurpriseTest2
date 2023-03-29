package com.knoldus
 object SurpriseTestOnList extends App {
   val num1 = List(Num("1", false), Num("2", true), Num("3", false), Num("4", true), Num("5", false))
   val num2 = num1.filter(x => x.isEven)
   val num3 = num1.filterNot(x => x.isEven)
   val (result1, result2) = num1.partition(x => x.isEven)
   println("Display the Even numbers :" + num2)
   println("Display the odd Numbers : " + num3)
   println("Use Partition Method: " + result1 + "\n" + result2)
   println("extract the case class field :"+num2.map(x => x.number))
 }

case class Num(number : String, isEven: Boolean)

