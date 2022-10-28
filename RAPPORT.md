# RAPPORT GROUPE B2

## MEMBRES : Jules BOBEUF, Aymeric JAKOBOWSKI, Thomas SANTORO

### Questions 1-6
Jules BOBEUF
Question 1-3 - Implémentation de la classe Complex. Les tests fonctionnent sans erreur.
Question 4 - Création classe PlanComplexe
Question 5 - Décorateur -> création interface IPlanComplexe et classe PlanComplexeTranslation
Question 6 - Décorateur -> Création classe PlanComplexeZoom et utilisation de IPlanComplexe

### Questions 7 - 8
Aymeric JAKOBOWSKI - Thomas SANTORO

Q7 (Aymeric) -> Patron de conception pour représenter les différentes suites : **stratégie**

Q8 (Thomas)-> Patron de conception pour parcourir les éléments d'une suite : **itérateur**

### Questions 9-10
Aymeric JAKOBOWSKI - Thomas SANTORO

Q9 (Aymeric) -> Création et implémentation de la suite Julia

Q10 (Thomas) -> Création et implémentation de la suite Mandelbrot

### Questions 11-12
Aymeric JAKOBOWSKI - Thomas SANTORO

Q9 (Aymeric) -> Utilisation de BinaryOperator sur la suite Julia afin de pouvoir creer une suite Julia généraliser

Q10 (Thomas) -> Utilisation de BinaryOperator sur la suite Mandelbrot afin de pouvoir creer une suite Mandelbrot généraliser

### Questions 13 - 14
Aymeric JAKOBOWSKI

Q13 -> Patron de conception pour représenter différentes pallettes de couleurs : **Stratégie**

Q14 -> Patron de conception pour appliquer un masque sur les couleurs produites par les palettes : **Décorateur**

### Questions 15-23
Thomas SANTORO

Q15 -> Utilisation d'un adaptateur afin de créer un point et de trouver la distance entre 2 points

Q16 -> Utilisation d'une variable complex récupérée

Q17 -> Patron de conception pour représenter les différentes Chaotique  : **stratégie**

Q18 -> Création de l'attracteur de Feigenbaum calculée à partir d'une formule servant à trouver yn

Q19 -> Création d'une suite circulaire similaire à l'attracteur de Feigenbaum avec une autre formule

Q20 -> Création d'un nouveau patron de conception : **itérateur**

Q21 -> Création de la méthode asPixel

Q22 -> Création de la classe Couleur du pixel et de la méthode getCouleur

Q23 -> 

### Questions 24-25
Jules BOBEUF
Question 24 - Adaptateur -> Création classe AdaptateurImage qui implémente IFractalImage
Question 25 -> Implémentation de la méthode SaveAs()

### Questions 26-27
Jules BOBEUF
Question 26 - Constructeur -> Création des classes Image et ImageBuilder, création de l'interface IImageBuilder
Question 27 -> Création de la classe Test.java, ajout du dossier images qui contient le résultat des 4 quatres suites récurrentes

### Question 38
Jules BOBEUF
Remplissage de la méthode buildFractal() en utilisant la classe Test créée précédemment.

### Questions 39-43
Jules BOBEUF
Question 39 -> Création de la run Configuration en local : ça marche pour les parametres données
Question 40 -> Création du Jar
Question 41 -> Création des scriptes bash de base - dossier scripts
Question 42 -> Ajout dans ces fichiers du zoom 
Question 43 -> Génération des images avec les scriptes bash. - dossiers Julia, JuliaGeneralisee, Mandelbrot, MandelbrotGeneralisee
Commandes entrées :
bash Julia.sh -x 0.0 -y 0.0 -p PaletteCouleurs1
bash Mandelbrot.sh -x -1.4002 -y 0.0 -p PaletteCouleurs1
bash JuliaGeneralisee.sh -x 0.0 -y 0.0 -p PaletteCouleursRouge
bash MandelbrotGeneralisee.sh -x -1.4002 -y 0.0 -p PaletteCouleursCyan