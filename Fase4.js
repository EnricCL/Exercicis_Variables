var nom = "Enric"
var cognom1 = "Comes"
var cognom2 = "Lefler"

var dia = 12
var mes = 1
var any = 1987

var nomComplet = nom + ' ' + cognom1 + ' ' + cognom2
var dataCompleta = dia + '/' + mes + '/' + any

console.log("El meu nom és "+nomComplet)
console.log("Vaig néixer el "+dataCompleta)

var fraseCerta="El meu any de naixement és de traspàs."
var fraseFalsa="El meu any de naixement no és de traspàs."

if((any%4==0)&&((any%100!=0)||(any%400==0))){
    console.log(fraseCerta)
}else console.log(fraseFalsa)