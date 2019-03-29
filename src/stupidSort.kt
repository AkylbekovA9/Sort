import kotlin.random.Random

fun stupidSort() {
    var n = 0
    val myArray = IntArray(10)
    for (element in myArray) {
        myArray[element] = Random.nextInt(1, 100)
    }

    for (element in myArray) {
        if (myArray[element] > myArray[element + 1]) {
            n = myArray[element]
            myArray[element] = myArray[element + 1]
            myArray[element + 1] = n

            for (element in 0..myArray[element]) {
                if (myArray[element] > myArray[element + 1]) {
                    n = myArray[element]
                    myArray[element] = myArray[element + 1]
                    myArray[element + 1] = n
                }
            }
        }
        for (element in myArray) {
            print(myArray[element])
        }
    }
}

fun main() {
    stupidSort()
}