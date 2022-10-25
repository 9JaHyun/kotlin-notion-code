package _07_by_keyword

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet() // MutableCollection 구현을 innerSet에게 위임
) : MutableCollection<T> by innerSet {
    var objectAdded = 0

    // 아래에 구현하는 메서드들은 위임 사용 X
    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectAdded += elements.size
        return innerSet.addAll(elements)
    }
}