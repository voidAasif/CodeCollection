#!/bin/bash

echo Enter your age
read age

if [ $age -eq 18 ]
	then
		echo your age is 18
	else
		echo you are below 18
fi
