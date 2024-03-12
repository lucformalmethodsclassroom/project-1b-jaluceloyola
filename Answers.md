Why does FixedArrayQueue require an explicit constructor?
Since we have a boolean checking to see if the constructor is positive, FixedArrayQueue requires an explicit constructor

What happens when you offer an item to a full FixedArrayQueue?
The item is not added, and the offer() method returns false.

What happens when you poll an empty FixedArrayQueue?
The method returns null

What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
The time and space complexity of each method is O(1), i.e., constant. 

How exhaustively does the TestSimpleQueue test suite test the implementation, both conceptually and in terms of actual coverage?
Subjectively, TestSimpleQueue seems to reasonably cover many possible errors. However, it's hard to clearly determine how exhaustive the coverage is, as each case is explicitly defined by the programmer, and there is no check to determine if the programmer is catching all of the fail states (Who watches the watchmen?).

How exhaustively does the TestSimpleQueueJqwik test suite test the implementation, both conceptually and in terms of actual coverage?
Conceptually, TestSimpleQueueJqwik will probably be more exhaustive, because it is performing a wide range of possible action combinations, so is likely to cover something that a programmer might miss when writing explicit tests. In terms of actual coverage, the Jococo coverage reports states that the code has 100% coverage for the relevant tests (Lines, Coverage, etc...)

What kind of test cases does the simpleQueueActions method generate?
Example based testing.
