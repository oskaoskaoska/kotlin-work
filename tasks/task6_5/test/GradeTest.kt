// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "Mark between 0 and 39 gives a fail" {
        withClue("Mark=0") { grade(0) shouldBe "Fail" }
        withClue("Mark=20") { grade(20) shouldBe "Fail" }
        withClue("Mark=39") { grade(39) shouldBe "Fail" }
    }
    "Mark between 40 and 69 gives a pass" {
        withClue("Mark=40") { grade(40) shouldBe "Pass" }
        withClue("Mark=50") { grade(50) shouldBe "Pass" }
        withClue("Mark=69") { grade(69) shouldBe "Pass" }
    }
    "Mark between 71 and 99 gives a distinction" {
        withClue("Mark=71") { grade(71) shouldBe "Distinction" }
        withClue("Mark=85") { grade(85) shouldBe "Distinction" }
        withClue("Mark=99") { grade(99) shouldBe "Distinction" }
    }
    "Mark outside 0-100 gives a ?" {
        withClue("Mark=-1") { grade(-1) shouldBe "?" }
        withClue("Mark=-20") { grade(-20) shouldBe "?" }
        withClue("Mark=101") { grade(101) shouldBe "?" }
        withClue("Mark=120") { grade(120) shouldBe "?" }
    }
})
