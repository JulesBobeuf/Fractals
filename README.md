# Fractals

<div align="center">
  <img src="Julia/Julia-2.jpg" alt="Julia Fractal Screenshot" width="600">
  <p align="center">
    A Java/JavaFX application to generate fractal images.
</div>

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#built-with">Built With</a></li>
    <li><a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#folder-structure">Folder Structure</a></li>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#command-line-options">Command Line Options</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

This project provides a basic implementation for generating fractal images as part of the university course SAÉ S3.A.01. It allows easy development and experimentation with fractals such as Julia and Mandelbrot sets.

**Team Members:** Jules Bobeuf, Aymeric Jakobowski, Thomas Santoro

## Built With

[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)  
[![JavaFX](https://img.shields.io/badge/JavaFX-007396?style=for-the-badge&logo=java&logoColor=white)](https://openjfx.io/)  
[![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)

## Getting Started

### Folder Structure

```markdown
Fractals/
├── 📁 Julia/                  # Julia fractal examples
├── 📁 JuliaGeneralisee/       # Generalized Julia fractals
├── 📁 Mandelbrot/             # Mandelbrot fractal examples
├── 📁 MandelbrotGeneralisee/  # Generalized Mandelbrot fractals
├── 📁 UML/                    # UML diagrams
├── 📁 images/                 # Figures and screenshots
├── 📁 scripts/                # Utility scripts
├── 📁 src/                    # Java source code
│   └── 📁 main/               # Main application code
├── 📄 build.gradle            # Gradle build configuration
├── 📄 gradlew                 # Unix Gradle wrapper
├── 📄 gradlew.bat             # Windows Gradle wrapper
├── 📄 settings.gradle         # Gradle settings
├── 📄 .gitignore              # Git ignore file
└── 📄 README.md               # Project documentation
```

### Prerequisites

```sh
Java 17+
Gradle
JavaFX SDK
```

### Installation

1. Clone the repository:

```sh
git clone https://github.com/JulesBobeuf/Fractals.git
cd Fractals
```

2. Build the project using Gradle:

```sh
./gradlew build
```

3. Run the application:

```sh
./gradlew run
```

### Command Line Options

The main class `fr.univartois.butinfo.fractals.Fractals` accepts the following command line options:

```
-f, --fractal-name  <name>      Specify fractal to generate
-h, --height        <pixels>    Specify image height
-n, --nb-iterations <integer>   Specify number of iterations
-o, --output        <file>      Specify output file
-p, --palette-name  <name>      Specify color palette
-s, --scale         <ratio>     Specify image scale
-w, --width         <pixels>    Specify image width
-x, --focus-x       <real>      X-coordinate of image center
-y, --focus-y       <real>      Y-coordinate of image center
```

## Usage

After running the Gradle task, the GUI will open and allow you to generate and visualize fractal images interactively.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

Jules Bobeuf  
[LinkedIn](https://www.linkedin.com/in/bobeuf-jules/)  
bobeuf.jules@gmail.com

Aymeric Jakobowski  
[LinkedIn](https://www.linkedin.com/in/aymeric-jakobowski/)  
[GitHub](https://github.com/AymericJak)
