/*2. Write a Scala program to create a new string with the last char added at the front and back of a 
given string of length 1 or more */

def modifyString(a:String):String = {
    var position = a.length - 1;
    var lastChar = a.charAt(position);
    var newString = lastChar + a + lastChar;
    return newString;
}

/*3. Write a Scala program to get the absolute difference between n and 51.
If n is greater than 51 return triple the absolute difference. */

def getAbsoluteDifference(n: Double):Double = {
    import scala.math.abs;
    var difference = abs(n - 51.0);
    if (n > 51.0) {
        difference = difference * 3;
    }
    return difference;
}

/*4. Write a Scala program to check two given integers, and return true if one of them 
is 30 or if their sum is 30. */

def checkIntegers(x: Int, y: Int): Boolean = {
    if ((x == 30) || (y == 30) || (x + y == 30)) {
        return true;
    }
    return false;
}

/*5. Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.*/

def checkInteger(x: Int): Boolean = {
    import scala.math.abs;
    if ((abs(x - 100) <= 20) || (abs(x - 300) <= 20)) {
        return true;
    }
    return false;
}

/*6. Write a Scala program to create a new string where 'if' is added to the front of a given string.
If the string already begins with 'if', return the string unchanged*/


7. Write a Scala program to remove the character in a given position of a given string.The given position will be in the range 0...string length -1 inclusive. 
8. Write a Scala program to exchange the first and last characters in a given string and return the new string. */