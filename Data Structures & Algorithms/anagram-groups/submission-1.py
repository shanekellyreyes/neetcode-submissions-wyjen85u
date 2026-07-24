class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
                # defaultdict(list) creates an empty list automatically
        # whenever we access a key that does not exist yet.
        #
        # We will store:
        # character-frequency signature -> list of matching words
        groups = defaultdict(list)

        # Process each word independently.
        for word in strs:
            # Create 26 frequency slots, one for each lowercase letter.
            count = [0] * 26

            # Count every character in the current word.
            for char in word:
                index = ord(char) - ord('a')
                count[index] += 1

            # Lists cannot be dictionary keys because lists are mutable
            # and therefore unhashable. Tuples are immutable and hashable,
            # so convert the count list into a tuple.
            #
            # Every anagram produces the same tuple.
            key = tuple(count)

            # Append this word to the list for its signature.
            groups[key].append(word)

        # The dictionary keys are only internal signatures.
        # The problem asks for the grouped words, so return the values.
        return list(groups.values())