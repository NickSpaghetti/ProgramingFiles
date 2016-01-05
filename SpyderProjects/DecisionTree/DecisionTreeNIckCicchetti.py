# -*- coding: utf-8 -*-
"""
Created on Sun Mar  1 19:59:05 2015

@author: nicholascicchetti
"""

import pandas as pd
import numpy as np
import sys
import random



# Returns the data as a pandas data frame and the train ratio as a float.
# The program will exit on the following conditions:
# - There are too few command line arguments
# - The supplied CSV filename cannot be read by pandas
# - The supplied train ratio is not a float
# - The supplied train ratio is not in the interval (0.0, 1.0]
def get_data_and_train_ratio_from_args():
    if len(sys.argv) < 2:
        sys.exit('Usage: {0} <CSV file> [<train ratio>]'.format(sys.argv[0]))
        csv_filename = sys.argv[1]
        if len(sys.argv) >= 3:
            ratio_string = sys.argv[2]
        else:
            ratio_string = '0.75'
            try:
                data = pd.read_csv(csv_filename, dtype=str)
            except:
                sys.exit('pandas could not read {0} as a CSV file'.format(csv_filename))
            try:
                train_ratio = float(ratio_string)
            except ValueError:
                sys.exit('{0} is not a float'.format(ratio_string))
            if train_ratio <= 0.0 or train_ratio > 1.0:
                sys.exit('training ratio of {0} is out of bounds'.format(train_ratio))
                return data, train_ratio

 # Split the data into train and test data frames.
def train_test_split_data_frame(data, train_ratio):
    
        # Generate an array of random floats on the interval [0.0, 1.0) with the
        # same number of values as there are rows of data
        rand = np.random.random(len(data)) 
        # Create a boolean array which will be used to select rows for the train
        # and test sets. mask[i] will be True when rand[i] < train_ratio and False
        # when rand[i] >= train_ratio
        mask = rand < train_ratio
        # data_train gets the rows from data which correspond to True values in mask
        data_train = data[mask]
        # ~mask inverts the mask so we can get the test data
        data_test = data[~mask]
        return data_train, data_test

# Return a data frame of zeros where the columns and indexes are the classes
# from data
def get_zeroed_confusion_matrix(data):
    classes = data.ix[:,-1].unique()
    return pd.DataFrame(0, index=classes, columns=classes)
    confusion_matrix.loc[target,predicted]
class TreeNode:
    def __init__(self, split_criterion, data, depth):
        self.split_criterion = split_criterion
        self.data = data
        self.depth = depth
        self.children = dict()
        # You'll also want to store the node's children and the split feature
        # Storing counts for each class will make classifying and printing
        # easier too.
        # Figure out if the node should be split, or if it is a leaf
        # If it's not a leaf, call self.split()
    def classify(self, data_point):
    # If the class is a leaf or if there is no child corresponding to
    # data_point's category within the split feature, return the class
    # with the highest count.
    # Otherwise, recursively call classify on the appropriate child
        split_feature_value = data_point[self.split_feature]
        if split_feature_value not in self.children:
            return self.majority_class
        else:
            return self.children[split_feature_value].classify(data_point)
    def get_child(self, category):
        return self.children[category]
        # I use this function to print spaces corresponding to the depth of the
        # node before printing any info about the node
    def print_prefix(self):
        print(self.depth * ' ', end='')
    def print_node(self):
    # Print the split criterion and the counts for each class, then call
    # each child's print_node() method.
        pass
    def split(self):
    # Calculate the information gain for each feature and keep track of the
    # feature with the highest gain. In case of ties, just pick one.
       features = self.data.columns.values.tolist()
       child = dict()
       maxIG = 0
       prevIG = 0
       calcEntropy = self.calculate_entropy(self.data.ix[:,-1])
       calcIG = self.calculate_information_gain(features,calcEntropy)
       for i in self.data[features:,-1]:
           calcEntropy
           calcIG
           prevIG = calcIG
           if prevIG > maxIG:
               maxIG = prevIG
               maxIG = i
               child = maxIG
           else:
               pass
           
           if child  == 0:
               pass
           else:
               self.split()
    # For each category within the feature with the highest information
    # gain, get the subset of the data that corresponds to that category,
    # drop the feature column, and create a child with the subset of data
    
    def calculate_entropy(self, class_column):
        xVal = class_column
        xValLeng= len(xVal)
        features = set(xVal).unique()
        flenght = len(features)
        entropy = 0
        isEmpty = xVal.empty
        if xVal != isEmpty:      
            for i in range(flenght):
                numerator = 0
                for j in range(xValLeng):
                    if features[i] == xVal[j]:
                        numerator += 1
            entropy -= ((numerator/ xValLeng*np.log2(numerator/xValLeng))) 
        else:
            print('Hey the file you are trying to have me read is is empty')                      
            return entropy
    
    def calculate_information_gain(self, feature_name, overall_entropy):
        ig = 0
        xVal = self.data[feature_name]
        xValLng = len(xVal)
        features = set(xVal).unique()
        featuresLng = len(features)
        isEmpty = xVal.empty
        if isEmpty == False:
            for i in range(featuresLng):
                numerator = 0
                for j in range(xValLng):
                    if features[i] == xVal[j]:
                        numerator += 1
            ig = (overall_entropy) - ((numerator/ xValLng)*self.calculate_entropy(xVal))
        else:
            print('Hey the file you are trying to have me read is is empty')
        return ig
 # Calculate the information gain for a feature. Takes the
 # overall_entropy as an additional argument to avoid re-calculating
    dataName = 'go_to_park.csv'
    train_ratio = .70
    #get_zeroed_confusion_matrix(dataName)
    get_data_and_train_ratio_from_args
    train_test_split_data_frame(dataName, train_ratio)
    get_zeroed_confusion_matrix(dataName)
    calculate_entropy(dataName.columns)
    overallEntropy = calculate_entropy(dataName.columns)
    calculate_information_gain(dataName[dataName['Features']],overallEntropy)
    split()
    print_prefix()
    print_node()