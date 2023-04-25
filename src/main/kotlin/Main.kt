fun main(args: Array<String>) {
var myDetails=CurrentAccount("3122878999","AmakoveBridgit",20000)
 println(  multiples (1..1000))
  println( randomString("Anitah"))
}
//1. Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun randomString(name:String):String {
    if (name.length <= 1) {
        return name
    } else if (name.length - 1 <= 1) {
        return name

    } else {

    }
    return name
}




//2. Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun myPassword(password:String):String{
   if(password.length<=8){
      return "is valid"
  }
    else if(password.length<=16){
        return "is valid"
   }
    else if(password=="digit"){
        return "is valid"
   }
    else{

   }
   return "not valid"

}





//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(num:IntRange){
 for (num in  1..1000)
    if(num %6==0 && num % 8==0){
        println("Bingo")
    }
    else if(num %6==0){
        println("Bin")
    }
    else if(num % 8==0){
        println("Ngo")
    }
    else{
        println("other")
    }


    }



//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){
    fun deposit(amount:Double){


    }
    fun withdraw(amount: Double){


        }

    fun details(){
        println("$accountNumber with $balance is operated by $accountName ")
    }
}



//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(var accountName: String,var accountNumber: Int,var balance: Int){

}
 open class account(var accountName:String,var accountNumber: Int,var balance: Int){
     fun mywithdrawals(withdrawals:Int){

     }
 }