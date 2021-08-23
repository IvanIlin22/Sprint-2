class ProblemC {

    fun main() {

        //ваша реализация в методе main
        var n: Int = readInt();
        var skills = readIntArray(n);

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
