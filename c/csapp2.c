typedef struct {
	int a[2];
	double d;
} struct_t;

double function(i) {
	volatile struct_t s;
	s.d = 3.14;
	s.a[i] = 1073442324;
	return s.d;
}

int  main(void) {
	printf("%d\n", function(1));
}