import java.util.*

class ProblemD {

    fun main() {

        //ваша реализация в методе main
        val t: Int = readInt();
        var proceeds = 0L;

        for (i in 1..t) {
            val n: Int = readInt();
            val cash: List<Long> = readListLong();

            Collections.sort(cash);
            for (j in cash.indices) {
                val tmp = cash[j] * (n - j);
                if (tmp > proceeds) {
                    proceeds = tmp;
                }
            }
            println(proceeds);
        }
    }
}
