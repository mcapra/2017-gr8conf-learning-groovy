
class Vampire {
    String name = ''
    int yearBorn
    //def setName(n) { println "setting $n"; name=n }
}
def vamp = new Vampire()

println vamp.name == vamp.getName()
println '--'

vamp.name = 'Dracula'
vamp.yearBorn = 1897

println "name = $vamp.name"

//def v2= new Vampire(name: 'Count Dracula', yearBorn: 1897)
//println "v2 = $v2.name"

