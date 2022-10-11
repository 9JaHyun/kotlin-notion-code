package _06_when

import _05_enum.DayOfWeek
import _05_enum.DayOfWeek.*
import java.lang.IllegalArgumentException
import javax.print.DocFlavor.READER


fun whatDayIsTodayV1(day: DayOfWeek): String {
    return when (day) {
        MON -> "월요일 좋아~ 최고로 좋아"
        TUE -> "화요일은 버틸만하지"
        WEN -> "와 벌써 절반이나 지났어?"
        THU -> "내일이면 벌써 금요일89이다"
        FRI -> "아싸 불금!"
        SAT -> "으어어 죽겠다"
        SUN -> "내일이 벌써... 월요일?"
    }
}

fun whatDayIsTodayV2(day: DayOfWeek) = when (day) {
    MON -> "월요일 좋아~ 최고로 좋아"
    TUE -> "화요일은 버틸만하지"
    WEN -> "와 벌써 절반이나 지났어?"
    THU -> "내일이면 벌써 금요일이다"
    FRI -> "아싸 불금!"
    SAT -> "으어어 죽겠다"
    SUN -> "내일이 벌써... 월요일?"
}

fun whatDayIsTodayV3(day: DayOfWeek) = when (day) {
    MON, TUE, WEN, THU, FRI -> "일하는날"
    SAT, SUN -> "노는날!"
}

fun whatDayIsTodayV4(day1: DayOfWeek, day2: DayOfWeek) =
    when (setOf(day1, day2)) {
        setOf(MON, THU) -> "10시 출근"
        setOf(TUE, FRI) -> "9시 출근"
        setOf(SAT, SUN) -> "쉬는날"
        else -> throw IllegalArgumentException("요일이 잘못입력되었습니다.")
    }

fun whatDayIsTodayV5(day1: DayOfWeek, day2: DayOfWeek) =
    when {
        (day1 == MON && day2 == THU)
                || (day1 == THU && day2 == MON) -> "10시 출근"
        (day1 == TUE && day2 == FRI)
                || (day1 == FRI && day2 == TUE) -> "9시 출근"
        (day1 == SAT && day2 == SUN)
                || (day1 == SUN && day2 == SAT) -> "쉬는날"
        else -> throw IllegalArgumentException("요일이 잘못입력되었습니다.")
    }

fun main() {
    println(whatDayIsTodayV1(MON))
    println(whatDayIsTodayV2(MON))
    println(whatDayIsTodayV4(MON, THU))
    println(whatDayIsTodayV4(TUE, FRI))
    println(whatDayIsTodayV4(SUN, SAT))
    println(whatDayIsTodayV4(MON, TUE))
}