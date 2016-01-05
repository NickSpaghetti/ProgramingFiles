#!/bin/bash

cat Countries.txt | grep  Americas > TempAmerica.txt
sort -r TempAmerica.txt | uniq > Americas.txt
rm TempAmerica.txt
