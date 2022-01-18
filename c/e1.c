#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#include <string.h>
#include <sys/wait.h>
int main(int argc, char *argv[]) {
//fork是复制进程资源，把那一刻的状态打了个副本
//子进程和父进程是两块空间，只是原点的内容是一样的
	//printf("hello world (pid:%d)\n",(int)getpid());
	int x = 1;
	int rc = fork();

	if(rc < 0) {
		fprintf(stderr,"fork failed\n");
		exit(1);
	}else if(rc == 0) {
		x = 200;

		printf("子进程(pid:%d) x的值为%d \n",(int)getpid(),x);
	}else {
		int wc = wait(NULL);
		printf("(父进程pid:%d) x的值为%d \n",(int)getpid(),x);
	}
	return 0;

}