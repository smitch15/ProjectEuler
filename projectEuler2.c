#include <stdio.h>
#include <stdlib.h>

//Returns the first Fibonacci number greater than 4 million.
long fib(long, long, long);

//term 1 is the smaller term, term 2 is the larger term
long fib(long term1, long term2, long accum){
  if (term2 > 4000000){
    return accum;
  }
  long temp = term1 + term2;
  term1 = term2;
  term2 = temp;
  if(term2 % 2 == 0){
    accum += term2;
  }
  //printf("%d ", term1+term2);
  return fib(term1, term2, accum);

}

int main(){
  long accum = 2;
  long term1 = 1;
  long term2 = 2;
  printf("%ld\n", fib(term1, term2, accum));
  return 0;
}
