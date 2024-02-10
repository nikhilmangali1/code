<?php

$src = fopen("source.txt","r+");
$dst = fopen("destination.txt","a");

while(!feof($src)){
    $line = fgets($src);
    fwrite($dst,$line);
}
echo "Copied successfully!!!!";

fclose($dst);
fclose($src);

?>