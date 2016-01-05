#!/bin/bash
#Purpose = Backup Americas.txt
#Author = Zachory Gray
#START
TIME=`date +%b-%d-%y`            # This Command will add date in Backup File Name.
FILENAME=Americas.txt-$TIME.tar.gz    # Here i define Backup file name format.
SRCDIR=/home/user/bin            # Location of Important Data Directory (Source of backup).
DESDIR=/home            # Destination of backup file.
tar -cpzf $DESDIR/$FILENAME $SRCDIR
#END

