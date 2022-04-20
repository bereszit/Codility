import scala.util.matching.Regex

object Password extends App {

  def solution(s: String): Int = {
    val regex = "[a-zA-Z0-9]+"

    val passwds : List[String] = s.split(" ").toList.filterNot(!_.matches(regex))
    println(passwds)
    val step2 = passwds.map(v => (v, v.toList.filter(k=>k.toString.matches("[a-zA-Z]")).length
      , v.toList.filter(l=>l.toString.matches("[0-9]")).length))
    println(step2)
    val step3 : List[(String, Boolean, Boolean)] = step2.map(v=> (v._1, if(v._2 % 2 == 0) true else false, if(v._3 % 2 ==1) true else false))
    println(step3)
    val step4 : List[(Int, Boolean)] = step3.map(v=> (v._1.length, v._2 && v._3))
    println(step4)
    val step5: List[Int] = step4.map(v=> if (v._2) v._1 else -1).toList
    if (step5.isEmpty) -1 else step5.max
  }

  println(solution("  test 5    a0A pass007       ?xy1 "))
  //solution("@s")

}
