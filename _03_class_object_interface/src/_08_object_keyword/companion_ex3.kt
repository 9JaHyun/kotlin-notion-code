package _08_object_keyword

class PersonV2(
    val name: String,
    val age: Int,
) {
    companion object Parser : JSONFactory<PersonV2> {
        override fun fromJson(jsonText: String): PersonV2 = PersonV2(
            jsonText.substring(
                jsonText.indexOf("name:") + 6,
                jsonText.indexOf(",") - 1),
            jsonText.substring(
                jsonText.indexOf("age:") + 4,
                jsonText.indexOf("}")).toInt()
        )

        override fun toJson(t: PersonV2): String =
            """
                {
                    name:${t.name},
                    age:${t.age}
                }
            """.trimIndent()
    }
}

interface JSONFactory<T> {
    fun fromJson(jsonText: String): T

    fun toJson(t: T): String
}

fun <T> loadFromJSON(factory: JSONFactory<T>, json: String): T{
    return factory.fromJson(json)
}

class PersonV3 private constructor(
    val name: String,
    val age: Int,
) {
    companion object  {
        fun birth(name: String) = PersonV3(name, 1)
    }
}

fun PersonV2.Parser.validate(json: String) {
    // json 검증 로직
}

fun PersonV3.Companion.sayHello() {
    println("응애!")
}

fun main() {
    val person = PersonV2.Parser.fromJson("{name:'A', age:15}")
    println("${person.name}, ${person.age}")

    println(PersonV2.Parser.toJson(person))

    loadFromJSON(PersonV2, "{name:'A', age:15}")

    PersonV2.validate("{name:'A', age:15}")
    PersonV3.sayHello()
}

