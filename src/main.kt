import java.awt.datatransfer.StringSelection

fun main() {
    var farmer=Farmers("Joyce",45)
    farmer.talk("I love farming")
    farmer.sleep()
    farmer.cultivateLand()
    farmer.eat()
    var doc=Doctors("kevin",17)
    doc.treatPatient("Jecinta","malaria")
    doc.sleep()
    doc.talk("I love keeping my patient healthy")
    doc.eat()


}

 open class Person(name: String,age: Int){
    fun talk(words:String){
        println(words)
    }
    fun sleep(){
        println("zzzz")
    }
    open fun eat(){
         println("yum")
     }
}
class Farmers(name:String,age:Int):Person(name, age){
    fun cultivateLand(){
        println("dig dig dig")
    }

}
class Doctors(name:String,age:Int):Person(name, age) {
    fun treatPatient(patient: String, disease: String) {
        println("Treating $patient $disease")

    }

    override fun eat() {
        super.eat()
        println("Am eating all food I bought")


    }
}
