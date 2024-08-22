# DSA in Java

This repository contains various Data Structures and Algorithms (DSA) implementations in Java. The goal is to provide clean and efficient code examples for learning and practicing DSA concepts.

## Project Structure

```
DSA IN JAVA/
├── .vscode/
│   └── tasks.json
├── AllProblems.java
├── input.txt
├── output.txt
└── README.md
```

- **`.vscode/tasks.json`**: Contains the VS Code task configuration for compiling and running Java programs.
- **`Demo.java`**: Example Java file (all Java files will be located directly in the root folder).
- **`input.txt` and `output.txt`**: Input and output files for testing Java programs.

## Task Configuration in VS Code

To simplify compiling and running your Java programs, you can use the following `tasks.json` file. This configuration allows you to compile the Java file, run it with `input.txt`, and store the output in `output.txt`.

### `tasks.json`

```json
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "compile and run",
            "type": "shell",
            "command": "javac ${file} && java ${fileBasenameNoExtension} < input.txt > output.txt && rm *.class",
            "group": {
                "kind": "build",
                "isDefault": true
            }
        }
    ]
}
```

### Steps to Configure in VS Code

1. **Create `.vscode` Folder**: In the root directory of your project, create a `.vscode` folder.
   
2. **Add `tasks.json`**: Inside the `.vscode` folder, create a file named `tasks.json` and paste the above configuration.

3. **Place Your Java Files**: Place your Java files, such as `Demo.java`, directly in the root directory.

4. **Create Input and Output Files**:
   - Create an `input.txt` file in the root directory for input values.
   - Create an `output.txt` file in the root directory to capture the output.

5. **Run the Task**:
   - Open the Java file you want to run in VS Code.
   - Press `Cmd + Shift + B` (on Mac) or `Ctrl + Shift + B` (on Windows/Linux) to execute the task.

## How It Works

- The task compiles the Java file currently open in VS Code.
- It then runs the compiled Java program with `input.txt` as input.
- The output is stored in `output.txt`.
- Finally, the task cleans up by removing the compiled `.class` files.

## Contributing

Feel free to fork this repository and contribute by adding more DSA implementations or improving the existing code.

## License

This project is open-source and available under the [MIT License](LICENSE).
