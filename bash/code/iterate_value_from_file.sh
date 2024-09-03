#!/bin/bash

name="/data/data/com.termux/files/home/script/stName.txt"

for i in $( cat $name )
do
	echo student name is $i
done
