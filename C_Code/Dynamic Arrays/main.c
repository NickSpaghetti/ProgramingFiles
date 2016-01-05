#include <stdio.h>
#include <stdlib.h>

int main()
{
      char **buffer = malloc(sizeof(char*));
  int i;
  size_t count = 0;
  size_t buffer_len = 0;
  char* line = NULL;
  size_t new_len = 0;
  size_t read_len = 0;

  new_len = grow_string_array(&buffer,buffer_len);
  *buffer[count] += new_len;
  while ((read_len = getline(&buffer[count], &buffer_len, stdin))!= -1){
    //for(i = 0;i<sizeof(buffer);++i){
    //if(buffer_len < count){
      grow_string_array(&buffer,buffer_len);
      //new_array=buffer[count];
      //printf("buffer len is size %zu: and count size is len %zu \n", buffer_len, read_len);

    //}else{
      printf("buffer counter %s\n",buffer[count]);
      printf("buffer len %zu\n", buffer_len);
      printf("count %zu\n", count);

    buffer_len+=count;
    //}
  //}
}
}
