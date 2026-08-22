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

        for i in t:
            if i in tChar:
                tChar[i] += 1
            else:
                tChar[i] = 1
        
        for i in s:
            if i in sChar:
                sChar[i] += 1
            else:
                sChar[i] = 1
        
        return tChar == sChar

    