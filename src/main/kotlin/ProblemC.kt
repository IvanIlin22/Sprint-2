class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val n: Int = readInt();
        val skills = readIntArray(n);

        skills.sort();
        var i = 1;
        var taskCount = 0;
        while (i < skills.size) {
            taskCount += skills[i] - skills[i - 1];
            i += 2;
        }
        print(taskCount);
    }

}
