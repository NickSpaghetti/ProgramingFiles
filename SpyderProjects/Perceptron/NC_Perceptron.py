# -*- coding: utf-8 -*-
# Nicholas Cicchettis
import sys

import numpy as np

import matplotlib.pyplot as plt

from sklearn.cross_validation import train_test_split


if len(sys.argv) != 2 and len(sys.argv) != 3:
    sys.exit('Usage: {0} <CSV file> [<alpha>]'.format(sys.argv[0]))
if len(sys.argv) == 3:
    alpha = float(sys.argv[2])
else:
    alpha = 1.0
csv_FileName = sys.argv[1]
cvsData = np.loadtxt ("/Users/nicholascicchetti/Documents/Nicks Moravian School Work/Spring 2015/DataMining/HomeWork/TestForProject.txt", delimiter = ',')
columns = cvsData.shape[1]
x = cvsData[:,0: columns]
newX = x[:,0]
t =cvsData[: columns - 1]
rows = cvsData.shape[0]
weight = np.array([1,1,1])
lx = np.linspace(-1,1)
timesUpdated = 0
cutoffNum = 0
alpha = 0
datapoints = 0
epochs = 0
check = 0
vectors = []
updateCount = 0

print(csv_FileName , " Contains " , str(rows) , " " + str(columns - 1) , " dimensional data points")
for x in columns:
    if typeTracker==t:
    
else:
    sys.exit("IT IS NOT IN HERE!")

 want sys.argv[0] <CSV file> [<alpha>]
if len(sys.argv) != 2 and len(sys.argv) != 3:
    sys.exit('Usage: {0} <CSV file> [<alpha>]'.format(sys.argv[0]))
    

def DataGeneration():
    x1 = np.random.random((5,2))
    x2 = np.random.random((5,2))+1
    t1 = np.ones(5)
    t2 = -np.ones(5)
    xStack = np.vstack((x1,x2))
    tStack = np.hstack((t1,t2))
    colOfOnes = np.ones(10)
    colStack = np.column_stack((colOfOnes,xStack))
    return colStack,tStack
def Plot_Line(w,lx,x):
    
    plt.scatter(x[:,1], x[:,2])
    plt.plot(lx, -1 * (w[1] / w[2]) * lx - (w[0] / w[2]))
    plt.show()

def TrainData(val,t,w):
    
    for i in range(val.shape[0]):
        updateCount = 0
        y = np.dot(val[i],w)
        if np.sign(y) != np.sign(t[i]):
            w += t[i] * val[i]
            updateCount += 1
        else:
            updateCount += 0
            timesUpdated = updateCount
        print("Your Weight has been Updated ", timesUpdated, " times.")
    return w, timesUpdated

def trainDataEpoc(dat, t, w):
    TrainData(dat,t,w) 
    if timesUpdated == 0:
           CutoffPoint(dat,t,w)
    else:
            x_train, x_test, t_train, t_test = train_test_split(x,t)
            bestWeight = 0
            for i in x_test:
                TrainData(x_train,t_train,w)
                currentWeight = w
                tDot = np.dot(x_test[i],w) 
                if timesUpdated < 0 or timesUpdated == cutoffNum:
                    CutoffPoint(dat,t,w)
                    if currentWeight > bestWeight:
                        bestWeight = currentWeight
                        print("Your Best Weight is ", bestWeight)
                    else:
                        pass
                else:
                    pass
        
                    
        
#get the counts back to see if i need to train and test the dad if the counts are < 0
    #if the count is < 0 keep doing this over again untill the count = 0 || hit the cut off point.
        
def CutoffPoint(val,t,w):
    pointsPresented = 0
    if val <= 500:
        cutoff = x * 40
        cutoffNum = cutoff
    else:
        cutoff = 1000000
        cutoffNum = cutoff    
    while pointsPresented < cutoff:
        TrainData(val,t,w)
        pointsPresented += len(x)
        
    print("The Number of times Epoc was updated: ", timesUpdated)
    return x,w,cutoffNum
        

TrainData(x,t,weight)
trainDataEpoc(x,t,weight)
   