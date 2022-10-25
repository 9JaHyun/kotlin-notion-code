package _02_inheritate

private class ParentA
private open class ParentB {
    fun methodA() {
        println("methodA")
    }

    open fun methodB() { // 이 메서드를 오버라이드 하도록 허용
        println("methodB")
    }
}

// open 키워드를 사용하지 않았기 때문에 상속 불가
//private class ChildA : ParentA() {
//
//}

// open 키워드를 사용했기 때문에 상속 가능.
private class ChildB : ParentB() {

    // open 키워드를 사용하지 않았기 때문에 override 불가
//    override fun methodA() {
//        super.methodB()
//    }

    // open 키워드를 사용했기 때문에 override 가능
    override fun methodB() {
        super.methodB()
    }
}

private open class ChildC : ParentB() {
    // open 키워드를 사용했기 때문에 override 가능
     override fun methodB() {
        super.methodB()
    }
}

private open class ChildD : ParentB() {
    // override한 메서드는 기본값이 final이 아니다!
    final override fun methodB() {
        super.methodB()
    }
}

private class ChildE : ChildC() {
    override fun methodB() {
        super.methodB()
    }
}

private class ChildF : ChildD() {
    // 컴파일 에러: final로 재선언
//    override fun methodB() {
//        super.methodB()
//    }
}