#!/bin/sh

for i in 1 2 3 4 5 6 7 8 9 10
do
    if [ $1 > 9 ]
    then
        touch "scenario${i}_before_input.txt"
    else
        touch "scenario0${i}_before_input.txt"
    fi
done
