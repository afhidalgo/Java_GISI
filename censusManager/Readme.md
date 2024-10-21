# My Java Project

This project is a simple Java application that demonstrates how to work with JAR files and create a runnable JAR.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project provides an example Java program with a `CensusManager` class that manages census data.

## Installation

### Prerequisites
- Java 11+
- Git

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/username/my-java-project.git
    ```

2. Navigate to the project directory:
    ```bash
    cd my-java-project
    ```

3. Compile the Java files into the `bin` directory:
    ```bash
    javac -d bin -sourcepath src src/census/*.java
    ```

4. Package the application into a JAR file:
    ```bash
    jar cvfm census.jar manifest.txt -C bin .
    ```

## Usage

To run the application:

```bash
java -jar census.jar
