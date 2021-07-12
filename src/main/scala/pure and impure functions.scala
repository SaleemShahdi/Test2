def pureFunction(x:Double, y:Double):Double = { // returns the product of two doubles
    return x * y;
}

var message = "original"
def impureFunction() { // Changes message variable and prints to the console i.e. the outside world
    message = "changed";
    println(message);
}