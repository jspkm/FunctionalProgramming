object rationals {
  val x = new Rational(1, 2)
  x.denom

  val y = new Rational(2, 3)

  x.add(y)
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + denom + that.numer,
      denom + that.denom
    )

  def neg() = new Rational(-1 * numer, denom)

  override def toString: String = numer + "/" + denom
}