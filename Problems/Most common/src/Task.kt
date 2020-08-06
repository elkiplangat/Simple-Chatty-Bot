fun main() {
    val words = mutableMapOf<String, Int>()
    while (true) {
        val nextWord = readLine()!!
        //
        if (nextWord == "stop") {
            words[nextWord] = 0
            break
        } else {
            if (words.contains(nextWord)) {
                words[nextWord] = words.getValue(nextWord).plus(1)
            } else {
                words[nextWord] = 1
            }
        }
    }
    for ((key, value) in words) {
        if (value == words.values.max()) {
            if (key == "stop") {
                print(null)
                return
            }
            print(key)
            return
        }

    }

}