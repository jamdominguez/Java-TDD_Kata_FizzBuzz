# Java-TDD_Kata_FizzBuzz
Simple java local application, using Test Driven Development methodology.

**Level: EASY**

Setup:
 - JDK 1.8.0_191
 - IDE IntelliJ Idea
 - Maven (IntellliJ Idea)

References:
[TDD Kata](https://www.programmingwithwolfgang.com/tdd-kata/)

# 1. Introduction
  TDD is a methodology that let implement efficient code. To use TDD in a project, all team members musth think in TDD mode, from functional analist to junior developer.
  The TDD paradigm consist in:
  1. Take funtional requirements like technical test cases
  2. Implement an basic unit test case
  3. Write the minimun code to pass the test case
  4. Refactoring the code
  5. Repeat the poings 2, 3 and 4 to cover all requirements.

In this example I will develop a simple application using TDD. Imagine you take the next requirements:
___
magine the scene. You are eleven years old, and in the five minutes before the end of the lesson, your math teacher decides he should make his class more “fun” by introducing a “game”. He explains that he is going to point at each pupil in turn and ask them to say the next number in sequence, starting from one. The “fun” part is that if the number is divisible by three, you instead say “Fizz” and if it is divisible by five you say “Buzz”.

So now your math teacher is pointing at all of your classmates in turn, and they happily shout “one!”, “two!”, “Fizz!”, “four!”, “Buzz!”… until he very deliberately points at you, fixing you with a steely gaze… time stands still, your mouth dries up, your palms become sweatier and sweatier until you finally manage to croak “Fizz!”. Doom is avoided, and the pointing finger moves on.

Of course, in order to avoid embarrassment in front of your whole class, you have to get the full list printed out so you know what to say. Your class has about 33 pupils and he might go round three times before the bell rings for break time. Next math lesson is on Thursday. Get coding!

Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz “.

Sample output:

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
… etc up to 100
___
Now we must think in basic unit test to cover every cases...
