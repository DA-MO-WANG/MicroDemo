#!/bin/bash
read -p "input ip:" ip
ping -c2 $ip &>/dev/null
if [ $? == 0 ];then
	echo "host $ip is ok"
else
	echo "host $ip is fail"
fi
