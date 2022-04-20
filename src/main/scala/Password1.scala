object Password1 extends App {

  def solution(s: String): Unit = {
    val d : List[String] = s.split(" ").toList
    println(d)
    val g = d.flatten
    println(g.toString())
  }

  solution("zeby kozka nie")

}
