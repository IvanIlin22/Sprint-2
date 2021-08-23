class ProblemB {

    fun main() {

        //ваша реализация в методе main
        val t: Int;
        var n: Int;
        var k: Int;
        var s: String;

        t = readInt();
        var i = 0;
        while (i < t) {
            val mas = readIntArray(2)
            n = mas[0];
            k = mas[1];

            var j = 0;
            s = "";
            while (j < n) {
                s += 'a' + j % k;

                j++;
            }
            println(s);

            i++;
        }
    }
}
