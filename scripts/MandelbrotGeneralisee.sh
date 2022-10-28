#!/bin/bash

name=$(basename "$0" .sh)
i=3
f="SuiteMandelbrotGeneralisee"
h="2160"
n="100"
s=$(echo "2/$h" | bc -l) 
w="3840"

if [ ! -e $name ] ; then
    mkdir $name
fi

for (( j=1 ; j<=i ; j++ )) ; do
    o="./$name/$name-$j.jpg"
    java -jar sae-2022-2023.jar -f $f -h $h -n $n -s $s -w $w -o $o $@
    s=$(echo "$s*1.5" | bc -l)  
done

