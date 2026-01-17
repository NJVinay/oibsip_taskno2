# Number Guessing Game

**GitHub Repository**: https://github.com/NJVinay/oibsip_taskno2

This is Task 2 of the Oasis Infobyte Internship - Number Guessing Game

## Description

A simple yet engaging console-based number guessing game implemented in Java. The game generates a random number between 1 and 100, and challenges the player to guess it within 5 attempts.

## Features

- Random number generation between 1 and 100
- 5 attempts to guess the correct number
- Helpful hints after each incorrect guess (higher or lower)
- Score calculation based on number of attempts
- User-friendly console interface

## Game Rules

1. The system generates a random number between 1 and 100
2. You have 5 attempts to guess the correct number
3. After each guess, you'll receive a hint whether the target number is higher or lower
4. Your score is calculated as: `(5 - attempts_used) × 10`
5. Maximum score: 50 points (guessing correctly on first attempt)

## How to Run

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Compilation

```bash
javac numberguessinggame.java
```

### Execution

```bash
java numberguessinggame
```

## Scoring System

- Correct guess on 1st attempt: 50 points
- Correct guess on 2nd attempt: 40 points
- Correct guess on 3rd attempt: 30 points
- Correct guess on 4th attempt: 20 points
- Correct guess on 5th attempt: 10 points
- Failed to guess in 5 attempts: 0 points

## Sample Gameplay

```
Let's try out a simple number guessing game...

Guess the number i've guessed now and let's try if it matches

Try guessing a number between 1 and 100

Enter the number you have guessed :
50

I've guessed a bigger number this time (Thoda sa bada number yaar...!)

Try guessing a number between 1 and 100

Enter the number you have guessed :
75

Yay...! You have a strong predictable sense ;D
You have guessed the correct number in 2 trails
Your score is 40
```

## Project Structure

```
oibsip_taskno2/
├── numberguessinggame.java    # Main game implementation
└── README.md                   # Project documentation
```

## Author

Developed as part of Oasis Infobyte Internship Program

## License

This project is created for educational purposes as part of an internship task.
