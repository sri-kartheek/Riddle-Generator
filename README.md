# 🤔 Riddle Game (Java Console App)

Welcome to the **Riddle Game**, a fun and interactive Java console application that tests your wits with brain-teasing riddles! Users can answer riddles, get hints, skip, or exit the game anytime. Points are awarded based on performance.

## 🧠 Features

- Loads riddles, answers, and hints from a `riddles.txt` file
- Random riddle selection
- Hint system (reduced points when used)
- Skipping and exiting options
- Score tracking with total possible points
- Simple console-based interaction

## 🎮 Game Rules

1. For every correct answer, you get **2 points**.
2. If you use a **hint**, a correct answer gives **only 1 point**.
3. Type:
   - `hint` → To get a clue
   - `skip` → To skip the current riddle
   - `exit` → To quit the game
4. At the end, your **total score** is displayed.

## 📁 File Structure

```
RiddleGame.java       // Main game source code
riddles.txt           // Riddle data file
README.md             // Project info (you are reading it!)
```

## 📘 Input Format (`riddles.txt`)

Each riddle is stored in **three lines**:

```
<riddle>
<correct_answer>
<hint>
```

### Example:

```
What has to be broken before you can use it?
Egg
It’s something you eat for breakfast.
```

> Make sure each riddle block is exactly 3 lines and no blank lines in between.

## 🚀 How to Run

1. Clone or download the repository
2. Make sure `riddles.txt` is in the **same folder** as the `.java` file
3. Compile and run:
   ```bash
   javac RiddleGame.java
   java RiddleGame
   ```

## 🛠 Requirements

- Java 8 or later
- Command line or terminal access

## 📈 Sample Output

```
Welcome to the Riddle Game!
Rules:
1.For every correct answer you get 2 points.
2.Type 'exit' to quit the game.
3.Type 'skip' to skip the riddle.
4.Type 'hint' to get a hint.
5.Correct answer after using hint gets only 1 point.
Let's begin!

What has to be broken before you can use it?
Enter your answer:
> Egg
Correct!
Do you want to continue for next riddle:
> yes
...
```

## 🙌 Author

Sri Kartheek  
[GitHub Profile](https://github.com/sri-kartheek)

## 📜 License

This project is open-source and free to use under the [MIT License](LICENSE).
