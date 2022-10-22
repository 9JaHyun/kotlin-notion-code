package _06_local_fun_extension_fun

import java.lang.IllegalArgumentException
import java.util.StringJoiner

fun saveUserV1(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name"
        )
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Address"
        )
    }
}

fun saveUserV2(user: User) {
    fun validate(
        value: String,
        fieldName: String,
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun User.validateBeforeSave() {
    fun validate(
        value: String,
        filedName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save $id: empty $filedName")
        }
    }
    validate(name, "Name")
    validate(name, "Address")
}

fun saveUserV3(user: User) {
    user.validateBeforeSave()
}

class User(
    val id: Long,
    val name: String,
    val address: String,
)