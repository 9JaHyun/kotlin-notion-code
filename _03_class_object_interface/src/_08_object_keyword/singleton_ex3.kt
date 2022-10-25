package _08_object_keyword

data class User(
    val name: String,
    val age: Int
) {
    object AgeComparator : Comparator<User> {
        override fun compare(u1: User, u2: User): Int {
            return u1.age.compareTo(u2.age)
        }
    }
}

fun main() {
    val userA = User("A", 20)
    val userB = User("B", 25)

    User.AgeComparator.compare(userA, userB)

    val users = listOf(userA, userB)
    users.sortedWith(User.AgeComparator)
}