package _06_when

import _05_enum.DayOfWeek
import java.lang.IllegalArgumentException



fun whatDayIsTodayV1(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.MON -> "월요일 좋아~ 최고로 좋아"
        DayOfWeek.TUE -> "화요일은 버틸만하지"
        DayOfWeek.WEN -> "와 벌써 절반이나 지났어?"
        DayOfWeek.THU -> "내일이면 벌써 금요일89이다"
        DayOfWeek.FRI -> "아싸 불금!"
        DayOfWeek.SAT -> "으어어 죽겠다"
        DayOfWeek.SUN -> "내일이 벌써... 월요일?"
    }
}

fun whatDayIsTodayV2(day: DayOfWeek) = when (day) {
    DayOfWeek.MON -> "월요일 좋아~ 최고로 좋아"
    DayOfWeek.TUE -> "화요일은 버틸만하지"
    DayOfWeek.WEN -> "와 벌써 절반이나 지났어?"
    DayOfWeek.THU -> "내일이면 벌써 금요일이다"
    DayOfWeek.FRI -> "아싸 불금!"
    DayOfWeek.SAT -> "으어어 죽겠다"
    DayOfWeek.SUN -> "내일이 벌써... 월요일?"
}

fun whatDayIsTodayV3(day: DayOfWeek) = when (day) {
    DayOfWeek.MON, DayOfWeek.TUE, DayOfWeek.WEN, DayOfWeek.THU, DayOfWeek.FRI -> "일하는날"
    DayOfWeek.SAT, DayOfWeek.SUN -> "노는날!"
}

fun whatDayIsTodayV4(day1: DayOfWeek, day2: DayOfWeek) =
    when (setOf(day1, day2)) {
        setOf(DayOfWeek.MON, DayOfWeek.THU) -> "10시 출근"
        setOf(DayOfWeek.TUE, DayOfWeek.FRI) -> "9시 출근"
        setOf(DayOfWeek.WEN) -> "11시 출근"
        setOf(DayOfWeek.SAT, DayOfWeek.SUN) -> "쉬는날"
        else -> throw IllegalArgumentException("요일이 잘못입력되었습니다.")
    }

fun main() {
    println(whatDayIsTodayV1(DayOfWeek.MON))
    println(whatDayIsTodayV2(DayOfWeek.MON))
}