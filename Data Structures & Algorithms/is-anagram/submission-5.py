class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        #Output is either true or false. True if s and t are anagrams, false if not

        #Input is two string 's' and 't'

        #Constraints: characters are lower case

        #Edge cases: empty string
        if len(s) != len(t):
            return False

        '''Create character dictionaries/hash maps that we can use to count the number
        of characters
        '''
        tChar = {} #counts number of each character within string 't'
        sChar = {} #counts number of each character within string 's'

        for char in t:
            if char in tChar:
                tChar[char] += 1
            else:
                tChar[char] = 1
        
        for char in s:
            if char in sChar:
                sChar[char] += 1
            else:
                sChar[char] = 1
        
        return tChar == sChar

    