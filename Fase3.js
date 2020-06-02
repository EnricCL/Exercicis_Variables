var traspas = 1948
var naixement = 1987
var esTraspas = false
var fraseCerta = "És any de traspàs."
var fraseFalsa = "No és any de traspàs."

for(var i=traspas; i<(naixement+1); i++){
    if((i%4==0) && ((i%100!=0) || (i%400==0))){
        esTraspas = true
    }else esTraspas = false

    if(esTraspas) console.log(i+": "+fraseCerta)
    else console.log(i+": "+fraseFalsa)

}