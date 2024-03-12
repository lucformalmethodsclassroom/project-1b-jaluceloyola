Why does FixedArrayQueue require an explicit constructor?
- Since we have a boolean checking to see if the constructor is positive, FixedArrayQueue requires an explicit constructor
What happens when you offer an item to a full FixedArrayQueue?
- The item is not added, and the offer() method returns false.
What happens when you poll an empty FixedArrayQueue?
- The method returns null
What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
- The time and space complexity of each method is O(1), i.e., constant. 
How exhaustively does the TestSimpleQueue test suite test the implementation, both conceptually and in terms of actual coverage?
- 
How exhaustively does the TestSimpleQueueJqwik test suite test the implementation, both conceptually and in terms of actual coverage?
-
What kind of test cases does the simpleQueueActions method generate?
