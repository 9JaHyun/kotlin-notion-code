package _07_by_keyword

class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int = innerList.size
    override fun isEmpty(): Boolean = innerList.isEmpty()
    override fun contains(elements: T): Boolean = innerList.contains(elements)
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun containsAll(elements: Collection<T>): Boolean =
        innerList.containsAll(elements)
}

class DelegatingCollectionV2<T>(
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList {
}