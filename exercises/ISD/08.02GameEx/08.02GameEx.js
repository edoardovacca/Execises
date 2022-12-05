function calculateProfit() {

    var rounds = Number(document.getElementById("rounds").value);        
    var answer = document.getElementById("answer");
    var result = "";
    var wins = 0;
    

    for (var i = 1; i <= rounds; i++) {
        var pips = Math.round( (Math.random( ) * 5) + 1 );    

            if (pips === 2 || pips === 4) {
                wins += 1.25;
                
            } else if (pips === 6) {
                wins += 1.5;
            } else if (pips === 1 || pips === 3 || pips === 5) {
                wins += 0;
            }  
        }
    
    var profit = rounds - wins;
    result = "Bets were altogether " + rounds.toFixed(2) +" euros <br/> Wins were " + wins.toFixed(2) + " euros <br/> Profit was " + profit + " euros";

    answer.innerHTML = result;
        
}