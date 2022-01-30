#!/bin/bash
#ls *.sh > execfile
while read line
do 
	echo $line
done <execfile
