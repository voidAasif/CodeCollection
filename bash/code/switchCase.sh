#!/bin/bash

echo choose the option

echo 1. date and time
echo 2. current dir 
echo 3. list files

read option

case $option in
	1)date;;
	2)pwd;;
	3)ls -ltr;;
	*)echo invalid option;;
esac

