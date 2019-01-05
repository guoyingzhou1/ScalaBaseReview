package implicitReview

/**
  * 2019/01/05 在单例中写入隐式类
  */
object ImplicitClass {
  val ago = "ago"
  val from_now = "from_now"
  implicit class DateHelper(val offset: Int) {
    import java.time.LocalDate
    def days(when: String): LocalDate = {
      val today = LocalDate.now
      when match {
        case "ago" => today.minusDays(offset)
        case "from_now" => today.plusDays(offset)
        case _ => today
      }
    }
  }
}
