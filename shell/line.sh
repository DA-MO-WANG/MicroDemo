#!/bin/bash
# 井号注释的作用
# ls 指令的结果，重定向到 execfile这个文件中
#ls *.sh > execfile
#while循环来读取每一行，至于哪里的每一行看后面
while read line
#循环中要做的事
do 
	echo $line
#把execfile文件中的东西重定向到done这个命令中
done <execfile.txt
