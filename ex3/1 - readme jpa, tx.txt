exercice 3 :

*************************************************************************************
Objectif :
- ecriture d'un pom.xml
- d�tection des d�pendances
- pr�paration des injections
- tissage des injections par annotations, manipulation de spring IDE
- �citure de tests unitaires
- mapping jpa
- manipulation d'un entityManager
- mise en oeuvre des transactions par aspect, par annotation
*************************************************************************************


1. Compl�ter le fichier pom.xml en d�clarant une d�pendance vers :
   * org.springframework	spring-orm					3.1.2.RELEASE
   * org.springframework	spring-web					3.1.2.RELEASE
   * org.hibernate			hibernate-entitymanager 	3.6.9.Final
   * org.hibernate			hibernate-validator 		4.2.0.Final
   * org.hibernate			hibernate-ehcache 			3.6.9.Final


2. Ecrire un mapping par annnotations

3. Pr�parer un contexte com/acme/ex3a/appCtxConfig.xml contenant une datasource configur� � partir du fichier datasource.properties et de la classe com.training.ex3.utils.MyDatasource 

4. Ajouter au contexte un EntityManagerFactory au contexte

5. Ajouter le transactionManager dans le contexte appCtxConfig.xml 

6. Compl�ter l'impl�mentation CandidateManagerImpl et de EmployeeManagerImpl en utilisant l'entityManager. 

7. Cr�er un contexte com/acme/ex3a/appCtxMain.xml et y inscrire les managers d�velopp�s en 6. 

8. Cr�er un contexte com/acme/ex3a/appCtx.xml qui importe les deux pr�c�dents.