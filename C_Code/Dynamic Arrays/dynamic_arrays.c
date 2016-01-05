#include "dynamic_array.h"
#include <stdio.h>
#include <stdlib.h>
size_t grow_string_array(char*** array, size_t current_size){
  size_t new_size = ((current_size * 3)/2+1) * (sizeof(char*));
  size_t* temp;
  int i;
  printf("above the for loop\n");
  for (i = 0; i < sizeof(array); ++i)
  {
    printf("we are in space : %d\n",i);
    printf("Im in the function, and The size of the new array is %zu\n", new_size);
  }
  //if(&array <= 0){
    //printf("I am returning 0\n");
    //return 0;
  //}else{

  *array = realloc(*array,new_size);
  //}


  return *array;
}
