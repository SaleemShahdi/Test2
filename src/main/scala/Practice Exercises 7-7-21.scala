/*1) Create a Scala program to output the following basic JSON notation.
Output:
{
"donut_name":"Vanilla Donut",
"quantity_purchased":"10",
"price":2.5
} */

def outputJSON() {
    println("{")
    println(""""donut_name":"Vanilla Donut",""")
    println(""""quantity_purchased":"10",""")
    println(""""price":2.5""")
    print("}")
}

/*2)Create a Scala program to prompt customers for their name and age. The format for the name and age labels should be in bold. And, the name literal should be underlined.

Name: Nadim Bahadoor
Age: 38
*/

def prompt() {
    import scala.io.StdIn._;
    print("What is your name? ");
    var name = readLine;
    println();
    print("What is your age? ");
    var age = readLine;
    print("\n\n");
    var Name = s"${Console.BOLD}Name${Console.RESET}";
    print(Name);
    print(": ");
    name = s"${Console.UNDERLINED}" + name + s"${Console.RESET}";
    print(name);
    println();
    print(Console.BOLD + "Age" + Console.RESET + ": " + age); // I did not attempt to underline the inputted age because of the issue I brought up in the attached video

}


/*3)Create a Scala program to find the 8th character in the String: "http://allaboutscala". */

def eighthCharacter():Char = {
    var s = "http://allaboutscala";
    return s(7);
}

/*4)Create a Scala program to calculate the total cost for a customer who is buying 10 Glazed donuts. You can assume that the price of each Glazed donut item is at $2.50. Notice the format of the $25.00 total cost literal, which is essentially at 2 decimal places */

def totalCost():String = {
    var totalCost = 10 * 2.5;
    var formattedCost = f"$totalCost%.2f";
    formattedCost = "$" + formattedCost;
    return formattedCost;
}


/*5)Create a Scala program that will ask the following question to a customer: "What is your favorite movie of all times?".*/

def askQuestion() {
    print("What is your favorite movie of all times?");
}


/*6)Create a Scala program to output your name and favorite movie.
Output:
First Name: Nadim
Last Name: Bahadoor
Favorite Movie: The Matrix
*/

def nameAndFavoriteMovie() {
    var firstName = "Shahrez";
    var lastName = "Ahmad";
    def favoriteMovie = "The Pink Panther"
    print(s"""First Name: $firstName
Last Name: $lastName
Favorite Movie: $favoriteMovie""")
}
/*7) Create a Scala program to parse the corresponding values from the given String "Vanilla Donut 10 2.25", where the literal Vanilla Donut is a particular donut, the 10 literal is the quantity purchased, and 2.25 is the unit price of each Vanilla Donut. You further need to cast each token from the input String to their corresponding types, such as, an Int, Double or String.

Output:
Donut Name: Vanilla Donut
Donut Price: $2.25
Donut Purchased: 10
*/

def parse() {
    var givenString = "Vanilla Donut 10 2.25";
    var donutName = "";
    var unitPrice = "";
    var donutsPurchased = "";
    var i = 0;
    while (i < givenString.length && givenString(i) != '1') {
        donutName = donutName + givenString(i);
        i = i + 1;
    }
    donutName = donutName.substring(0, donutName.length - 1);
    while (i < givenString.length && givenString(i) != '2') {
        donutsPurchased = donutsPurchased + givenString(i);
        i = i + 1;
    }
    donutsPurchased = donutsPurchased.substring(0, donutsPurchased.length - 1);
    while (i < givenString.length) {
        unitPrice = unitPrice + givenString(i);
        i = i + 1;
    }
    var donutsPurchasedFinal = donutsPurchased.toInt;
    var unitPriceFinal = unitPrice.toDouble;
    print(s"""Donut Name: $donutName
Donut Price: $$$unitPriceFinal
Donut Purchased: $donutsPurchasedFinal""")
}

/*8)Create a Scala program and use an appropriate data structure to present the following key and value pairs of children and their ages: Bill is 9 years old, Jonny is 8 years old, Tommy is 11 years old, and Cindy is 13 years old. Sort out the corresponding child to age in reverse alphabet order.
Output:
Children to ages in reverse order by their names = Tommy -> 11, Jonny -> 8, Cindy -> 13, Bill -> 9 */

def ages() {
    import scala.collection.immutable.ListMap
    val mapping = Map("Bill"->9, "Jonny"->8, "Tommy"->11, "Cindy"->13);
    val result = ListMap(mapping.toSeq.sortWith(_._1 > _._1):_*);
    print(result);
}


/*9) Let us assume that you two shopping baskets with a bunch of items in each one. The first contains elements: "Cake", "Milk", "Cheese", "Toilet Paper", and the second one has the following items: "Bread", "Water", "Juice", "Milk", "Cheese". Write a Scala program to find the common items between the two shopping baskets. You can use whichever data structure that you feel is appropriate for this particular problem.
Output:
Shopping Basket One = Cake - Milk - Cheese - Toilet Paper
Shopping Basket Two = Water - Milk - Juice - Cheese - Bread
Common items are:

MILK
CHEESE
*/

def intersect() {
    var basket1 = Set("Cake", "Milk", "Cheese", "Toilet Paper");
    var basket2 = Set("Bread", "Water", "Juice", "Milk", "Cheese");
    var intersection = basket1.intersect(basket2);
    intersection = intersection.map(_.toUpperCase);
    print("Common items are:"+"\n\n");
    intersection.foreach(println);
}

/*10)Create a Scala program that defines a sequence of numbers from 100 to 110. The sequence should include the 100 starting number literal, and ends with the 110 number literal.

Output:

Number range from 100 to 110 inclusive = 100 101 102 103 104 105 106 107 108 109 110*/

def seq() {
    val sequence = 100 to 110;
    print("Number range from 100 to 110 inclusive = ");
    sequence.foreach{i=>print(i + " ")};
}

