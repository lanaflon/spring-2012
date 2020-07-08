exercice 1 :

*************************************************************************************
Objectif : 
- compr�hension du pom.xml
- d�tection des d�pendances
- pr�paration des injections
- tissage des injections dans le contexte spring, manipulation de spring IDE
*************************************************************************************

Dans le package com.acme.ex1.domain.dao.xml et  com.acme.ex1.domain.service.xml:

1. �crire deux impl�mentations de l'interface MovieDao : 'FoxMovieDaoImpl' et 'WarnerMovieDaoImpl'
chacune renvoie une liste de films (liste lue dans un fichier).

2. �crire une impl�mentation de MovieService, la m�thode findMovies s'appuie 
sur une des impl�mentations de MovieDao pour renvoyer une liste de films

3. Comprendre la d�pendance entre le service (MovieService) et les dao (MovieDao)

4. Pr�parer les injections (par setter ou par constructeur) dans les classes java

5. Cr�er un fichier context spring dans src/main/resources (dossier com/acme/ex1/context)

6. Externaliser la gestion des d�pendances dans un fichier context spring

7. Ecrire une deuxi�me impl�mentation de l'interface MovieService capable de recevoir plusieurs Dao et non plus un seul

Dans le package com.acme.ex1.domain.annotations : 

reprendre les �tapes 1 � 7 (code identique) en configurant le contexte par annotations.
Utiliser pour cela les packages dao.annotations et service.annotations
Les classes seront identiques (aux annotations pr�s), seul le contexte changera.

8. Tester le bon fonctionnement du programme en compl�tant la classe de test (MovieServiceImplTest)

9. Ecrire un deuxi�me test unitaire pour le service, en utilisant cette fois ci les mocks (JMock)

