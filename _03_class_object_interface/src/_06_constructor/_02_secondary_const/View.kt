package _06_constructor._02_secondary_const


open class View {

    constructor(ctx: Context)

    constructor(ctx: Context, attr: Attribute)
}

class ButtonView : View {

    constructor(ctx: Context): this(ctx, Attribute.NORMAL)

    constructor(ctx: Context, attr: Attribute) : super(ctx, attr)
}

class Context {}

enum class Attribute {
    NORMAL,
    GOTHIC,
    ITALIC
}