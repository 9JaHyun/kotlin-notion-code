package _04_01_inner_class

private class Outer {

    inner class Inner {
        fun getOuterReference(): Outer {
            return this@Outer
        }
    }
}