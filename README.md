# Dice Methods

In this assignment, you'll be writing four methods related to dice and some dice related problems. 

The first method is rollDie(). This method represents the rolling of a single die. It takes no inputs, and returns a single integer between 1 and 6, inclusive. The method has the following signature: public static int rollDie() {}

The next three methods are related to a math problem. Your goal is to determine which of the following had the greater chance of success:
* Rolling six dice and getting at least one 6
* Rolling twelve dice and getting at least two 6's
* Rolling eighteen dice and getting at least three 6's

You will write code to solve this problem using probability. For example, you will write some code to carry out a "trial". In a trial, you roll six dice and count the numbers of 6's. If there is at least one 6, that trial is successful. If there are no 6's that trial was unsuccessful. By repeating your trial 10,000 times, you should be able to calculate a pretty accurate estimate for the probability. 

The first method is probabilityOneSix(). This method takes no input, and calculates the probability that you will get at least one 6 when rolling six dice. To get a good estimate for this probability, you should run this experiment at least 10,000 times. The method will return the probability as a double representing the percentage of trials that were successful. For example, if 75.5% of the trials were successful, the method would return 75.5. The method has the following signature: public static double probabilityOneSix() {}

The other two methods probabilityTwoSixes() and probabilityThreeSixes() are similar, except that they calculate the probability that you will get at least two 6's when rolling twelve dice or the probability that you will get at least three 6's when rolling eighteen dice, respectively. 

Your main method should call the three methods that you've written. Which situation was the most likely?

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```