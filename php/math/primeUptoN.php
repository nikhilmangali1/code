<?php

function printPrimeNumbers($n){
    echo "Printing prime number from 1 to ",$n," : ";
    for($i =2 ;$i <= $n;$i++){
        if(isPrime($i)){
            echo "$i\t";
        }
    }
}
function isPrime($n){
    if($n <= 1) return false;
    for($i=2;$i<$n;$i++){
        if($n%$i==0) return false;
    }
    return true;
}
$n=50;
printPrimeNumbers($n);

?>