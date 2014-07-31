String_Generator_Google_Interview_Question
==========================================

This is a solution of one google interview question. See README for more descriptions of the question.


===========================================

Question description:

Phone interview question: Given a string pattern of 0s, 1s, and ?s (wildcards), generate all 0-1 strings that match this pattern. e.g. 1?00?101 -> [10000101, 10001101, 11000101, 11001101]. You can generate the strings in any order that suits you.

tips:

Actually, this question can be considered as give n bits position, generate all permutations by 0 and 1. e.g. you have 2 bits, the permutation will be [0 0], [0 1], [1 0], [1 1]. You can use recursion to generate the permutation and then put the bits back to the string and replace the ? marks.
