class ProblemA {

    fun main() {

        //ваша реализация в методе main
        val t: Int;
        var a: Long;
        var b: Long;
        var c: Long;

        t = readInt();
        var i = 0;
        while (i < t) {
            val mas = readListLong();
            a = mas[0];
            b = mas[1];
            c = mas[2]

            if ((c % 2) == 0L) {
                println("${a * (c / 2) - b * (c / 2)}");
            } else {
                println("${a * (c / 2 + 1) - b * (c / 2)}");
            }

            i++;
        }
    }
}
