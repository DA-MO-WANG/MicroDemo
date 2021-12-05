#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

#include <string.h>
#include <sys/wait.h>
int main(int argc, char *argv[]) {
//打印进程id
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