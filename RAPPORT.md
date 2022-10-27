# RAPPORT GROUPE B2

## MEMBRES : Jules BOBEUF, Aymeric JAKOBOWSKI, Thomas SANTORO

### Questions 1-6
Jules BOBEUF
Implémentation de la classe Complex. Les tests fonctionnent sans erreur.
Question 4 -> Création classe PlanComplexe
Question 5 - Décorateur -> création interface IPlanComplexe et classe PlanComplexeTranslation
Question 6 - Décorateur -> Création classe PlanComplexeZoom et utilisation de IPlanComplexe

### Questions 7 - 8
Aymeric JAKOBOWSKI - Thomas SANTORO

Q7 (Aymeric) -> Patron de conception pour représenter les différentes suites : **stratégie**

Q8 -> Patron de conception pour parcourir les éléments d'une suite : **itérateur**

### Questions 13 - 14
Aymeric JAKOBOWSKI

Q13 -> Patron de conception pour représenter différentes pallettes de couleurs : **Stratégie**

Q14 -> Patron de conception pour appliquer un masque sur les couleurs produites par les palettes : **Décorateur**

### Questions 24-25
Jules BOBEUF
Question 24 - Adaptateur -> Création classe AdaptateurImage qui implémente IFractalImage
Question 25 -> Implémentation de la méthode SaveAs()

### Question 28-36
Aymeric JAKOBOWSKI

Package ``fr.univartois.butinfo.fractals.figures``

Q28 -> Réalisation d'une interface IFigures. Une méthode qui retourne une chaine de caractère (String).
Différentes classes implémentant cette interface :
	- Cercle
	- Ellipse
	- Ligne
	- Polygon
	- Rectangle

Q29 -> Patron de conception pour appliquer des transformations sur les figures : **Décorateur**
Mise en place de 3 décorateurs pour les transformations suivantes : 
	-Translation
	-Scale
	-Rotation
	
Q30 -> Patron de conception pour avoir plusieurs figures : **Composite**
Utilisation d'un itérateur pour le parcours de plusieurs figures.

Q31 -> Patron de conception pour implémenter plusieurs étapes lors de la création du fichier : **PAtron de méthode**
Plusieurs méthodes définies :
	1. Ouverture du ficher
	2. Ecriture de l'en tête
	3. Créations des figures
	4. Bouclage du fichier