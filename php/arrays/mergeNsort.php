<?php

$a1 = array(83,9,2);
$a2 = array(74,0,222);

$merged = array_merge($a1, $a2);

rsort($merged, SORT_NUMERIC);

$length = count($merged);
for($i=0; $i<$length;$i++){
    echo $merged[$i],"\t";
}

?>