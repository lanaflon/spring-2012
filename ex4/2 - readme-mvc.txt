exercice 4 :

*************************************************************************************
Objectif : 																			*
- mise en oeuvre de spring mvc, 												    *
- bean-validation (JSR-303)											* 												    *
*************************************************************************************

2. d�clarer la prise en charge d'un pattern d'url /ui/* par la servlet spring

3. cr�er un controleur (com.acme.ex4.ui.controller.CandidateController) contenant 3 m�thodes :
   une m�thode pour pr�senter le formulaire de recherche de candidats, associ�e � l'url /ex4/ui/candidate/index
   une m�thode pour proc�der � la rechercher ds candidats, associ�e � l'url /ex4/ui/candidate/list.html
   une m�thode pour pr�senter le d�tail d'un candidat, associ�e � l'url /ex4/ui/candidate/edit
   une m�thode pour convertir un candidat en employ�, associ� � l'url /ex4/ui/candidate/hire

4. cr�er les vues correspondantes au point 4 : 
   /WEB-INF/jsp/candidates/index.jsp pour la recherche (formulaire de recherche + liste de r�sultats)
   /WEB-INF/jsp/candidates/detail.jsp pour la fiche d�tail
   		celle-ci propose aussi un petit formulaire pour d�clarer le candidat comme 'embauch�'. 
   
5. cr�er un controleur (com.acme.ex4.ui.controller.EmployeeController) contenant 1 m�thode :
   une m�thode pour rechercher des employ�s, associ�e � l'url /ex4/ui/employees/index

6. cr�er 1 une vue WEB-INF/jsp/employees/index.jsp correspondant � la recherche d'employ�e (point 5). 
   une m�thode pour pr�senter le formulaire de recherche d'employ�s, associ�e � l'url /ex4/ui/employee/index
   une m�thode pour proc�der � la rechercher des employ�s, associ�e � l'url /ex4/ui/employee/index


7. ajouter un m�canisme de gestion des exceptions pour associer les exceptions m�tiers � une page d'erreur et 
les exceptions techniques � une autre page d'erreur.
   
8. ajouter l'internationalisation afin que le message de l'exception puisse �tre une cl�, dont la valeur traduite est affich�e dans la page d'erreur.

9. ajouter un m�canisme de validation pour emp�cher l'embauche du salari� si la date de d�but n'a pas �t� saisie.