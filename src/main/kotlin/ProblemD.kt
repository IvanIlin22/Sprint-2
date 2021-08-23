import java.util.*

class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val t: Int = readInt();
        var proceeds = 0L;

        for (i in 1..t) {
            var n: Int = readInt();
            var cash: List<Long> = readListLong();

            Collections.sort(cash);
            for (j in cash.indices) {
                var tmp = cash[j] * (n - j);
                if (tmp > proceeds) {
                    proceeds = tmp;
                }
            }
            println(proceeds);
        }
    }
}
