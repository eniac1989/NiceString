package alipour.nicestring

fun main() {
    println("aaab".isNice())
}

fun String.isNice(): Boolean {
    var condition1: Boolean = false
    var condition2: Boolean = false
    var condition3: Boolean = false
    if (!this.isNullOrEmpty()) {
        if (!this.contains("ba") && !this.contains("bu") && !this.contains("be")) {
            condition1 = true
                println("condition1 : "+ condition1)
        }
        if (this.count { it == 'a' } + this.count { it == 'e' } + this.count { it == 'i' } + this.count { it == 'o' } + this.count { it == 'u' } >= 3) {
            condition2 = true
            println("condition2 : "+condition2)
        }
 
        val zipWithNext = this.zipWithNext { a, b -> a == b }

        if (zipWithNext.contains(true))
        {
            condition3 = true
            println("condition3: "+condition3)
        }
        if ((condition1 && condition3) || (condition2 && condition3) ||(condition1 && condition2))
            return true
        return false
    } else
        return false

}