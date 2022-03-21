package eveshtard.lab14

class Triangle(val sideFirst: Int, val sideSecond: Int, val sideThird: Int) : IShape {
    override fun square(): Int {
        throw GeometryException("You don't have enough data to calculate the area of the triangle")
    }

    override fun view(): String {
        return square().toString()
    }


}