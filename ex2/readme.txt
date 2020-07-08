exercice 2 :

*************************************************************************************
Objectif :
- ecriture d'un pom.xml
- d�tection des d�pendances
- pr�paration des injections
- tissage des injections dans le contexte spring, manipulation de spring IDE
- �citure de tests unitaires
*************************************************************************************


1. Compl�ter le fichier pom.xml en d�clarant la d�pendance vers 
   * org.springframework	spring-context				3.1.2.RELEASE
   * org.springframework	spring-test					3.1.2.RELEASE
   * junit					junit						4.10

2. compl�ter l'impl�mentation FileTranslationDaoImpl de l'interface TranslationDao. 
Cette classe recherche dans un fichier texte (csv) le mot � traduire et renvoie la traduction.

3. Ecrire dans le contexte spring plusieurs beans faisant r�f�rence � TranslationDaoImpl :
- frenchToSpanishDao
- englishToFrenchDao
- englishToSpanishDao
Chaque bean s'appuie sur un fichier diff�rent (fr-es.csv, en-fr.csv, en-es.csv), 
dont le nom est inject� via spring.
Ecrire un test unitaire pour un de ces beans


4. Factoriser dans une DAO parente le r�pertoire dans lequel se trouve les fichiers.

5. compl�ter les impl�mentations de l'interface Interpreter (package business.impl). 
Comprendre pourquoi cette classe a besoin d'une DAO.
Comprendre pourquoi cette classe peut se comporter diff�remment selon la dao inject�e.

6. ecrire une impl�mentation InterpreterLocatorImpl de l'interface InterpreterLocator.
injecter dans cette classe une map de 'InterpreterImpl'.
Ecrire un test unitaire pour cette classe

7. Compl�ter l'impl�mentation de l'interface CommandProcessor en y injectant un InterpreterLocator.
Ecrire un test unitaire pour cette classe.

8. Scinder le contexte spring en deux contextes : 
- AppCtxDao.xml (pour les dao)
- AppCtxService.xml (pour les interp�teurs, l'interpretLocator et le commandProcessor).
 
9. Appliquer un aspect de type 'around' sur la m�thode process